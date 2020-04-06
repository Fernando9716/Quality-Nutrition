/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Control.exceptions.NonexistentEntityException;
import Modelo.DAntropometricos;
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
public class DAntropometricosJpaController implements Serializable {

    public DAntropometricosJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(DAntropometricos DAntropometricos) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(DAntropometricos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(DAntropometricos DAntropometricos) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            DAntropometricos = em.merge(DAntropometricos);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = DAntropometricos.getIdDAntropometricos();
                if (findDAntropometricos(id) == null) {
                    throw new NonexistentEntityException("The dAntropometricos with id " + id + " no longer exists.");
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
            DAntropometricos DAntropometricos;
            try {
                DAntropometricos = em.getReference(DAntropometricos.class, id);
                DAntropometricos.getIdDAntropometricos();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The DAntropometricos with id " + id + " no longer exists.", enfe);
            }
            em.remove(DAntropometricos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<DAntropometricos> findDAntropometricosEntities() {
        return findDAntropometricosEntities(true, -1, -1);
    }

    public List<DAntropometricos> findDAntropometricosEntities(int maxResults, int firstResult) {
        return findDAntropometricosEntities(false, maxResults, firstResult);
    }

    private List<DAntropometricos> findDAntropometricosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(DAntropometricos.class));
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

    public DAntropometricos findDAntropometricos(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(DAntropometricos.class, id);
        } finally {
            em.close();
        }
    }

    public int getDAntropometricosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<DAntropometricos> rt = cq.from(DAntropometricos.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
