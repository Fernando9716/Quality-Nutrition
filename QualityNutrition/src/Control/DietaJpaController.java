/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Control.exceptions.NonexistentEntityException;
import Control.exceptions.PreexistingEntityException;
import Modelo.Dieta;
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
public class DietaJpaController implements Serializable {

    public DietaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Dieta dieta) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(dieta);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findDieta(dieta.getIdDieta()) != null) {
                throw new PreexistingEntityException("Dieta " + dieta + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Dieta dieta) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            dieta = em.merge(dieta);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = dieta.getIdDieta();
                if (findDieta(id) == null) {
                    throw new NonexistentEntityException("The dieta with id " + id + " no longer exists.");
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
            Dieta dieta;
            try {
                dieta = em.getReference(Dieta.class, id);
                dieta.getIdDieta();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The dieta with id " + id + " no longer exists.", enfe);
            }
            em.remove(dieta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Dieta> findDietaEntities() {
        return findDietaEntities(true, -1, -1);
    }

    public List<Dieta> findDietaEntities(int maxResults, int firstResult) {
        return findDietaEntities(false, maxResults, firstResult);
    }

    private List<Dieta> findDietaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Dieta.class));
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

    public Dieta findDieta(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Dieta.class, id);
        } finally {
            em.close();
        }
    }

    public int getDietaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Dieta> rt = cq.from(Dieta.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
