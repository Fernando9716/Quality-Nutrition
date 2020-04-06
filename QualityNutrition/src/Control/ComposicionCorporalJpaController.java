/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Control.exceptions.NonexistentEntityException;
import Modelo.ComposicionCorporal;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author fernando
 */
public class ComposicionCorporalJpaController implements Serializable {

    public ComposicionCorporalJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(ComposicionCorporal composicionCorporal) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(composicionCorporal);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(ComposicionCorporal composicionCorporal) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            composicionCorporal = em.merge(composicionCorporal);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = composicionCorporal.getIdComposicionCorporal();
                if (findComposicionCorporal(id) == null) {
                    throw new NonexistentEntityException("The composicionCorporal with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            ComposicionCorporal composicionCorporal;
            try {
                composicionCorporal = em.getReference(ComposicionCorporal.class, id);
                composicionCorporal.getIdComposicionCorporal();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The composicionCorporal with id " + id + " no longer exists.", enfe);
            }
            em.remove(composicionCorporal);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<ComposicionCorporal> findComposicionCorporalEntities() {
        return findComposicionCorporalEntities(true, -1, -1);
    }

    public List<ComposicionCorporal> findComposicionCorporalEntities(int maxResults, int firstResult) {
        return findComposicionCorporalEntities(false, maxResults, firstResult);
    }

    private List<ComposicionCorporal> findComposicionCorporalEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(ComposicionCorporal.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public ComposicionCorporal findComposicionCorporal(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(ComposicionCorporal.class, id);
        } finally {
            em.close();
        }
    }

    public int getComposicionCorporalCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<ComposicionCorporal> rt = cq.from(ComposicionCorporal.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
