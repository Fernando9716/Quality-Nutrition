/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Control.exceptions.NonexistentEntityException;
import Modelo.DAnaliticos;
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
public class DAnaliticosJpaController implements Serializable {

    public DAnaliticosJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(DAnaliticos DAnaliticos) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(DAnaliticos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(DAnaliticos DAnaliticos) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            DAnaliticos = em.merge(DAnaliticos);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = DAnaliticos.getIdDAnaliticos();
                if (findDAnaliticos(id) == null) {
                    throw new NonexistentEntityException("The dAnaliticos with id " + id + " no longer exists.");
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
            DAnaliticos DAnaliticos;
            try {
                DAnaliticos = em.getReference(DAnaliticos.class, id);
                DAnaliticos.getIdDAnaliticos();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The DAnaliticos with id " + id + " no longer exists.", enfe);
            }
            em.remove(DAnaliticos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<DAnaliticos> findDAnaliticosEntities() {
        return findDAnaliticosEntities(true, -1, -1);
    }

    public List<DAnaliticos> findDAnaliticosEntities(int maxResults, int firstResult) {
        return findDAnaliticosEntities(false, maxResults, firstResult);
    }

    private List<DAnaliticos> findDAnaliticosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(DAnaliticos.class));
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

    public DAnaliticos findDAnaliticos(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(DAnaliticos.class, id);
        } finally {
            em.close();
        }
    }

    public int getDAnaliticosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<DAnaliticos> rt = cq.from(DAnaliticos.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
