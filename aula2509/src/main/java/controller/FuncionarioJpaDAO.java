package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Funcionario;
 
public class FuncionarioJpaDAO {
 
         private static FuncionarioJpaDAO instance;
         protected EntityManager entityManager;
         
         public static FuncionarioJpaDAO getInstance(){
                   if (instance == null){
                            instance = new FuncionarioJpaDAO();
                   }
                   
                   return instance;
         }
 
         private FuncionarioJpaDAO() {
                   entityManager = getEntityManager();
         }
 
         private EntityManager getEntityManager() {
                   EntityManagerFactory factory = Persistence.createEntityManagerFactory("crudHibernatePU");
                   if (entityManager == null) {
                            entityManager = factory.createEntityManager();
                   }
 
                   return entityManager;
         }
 
         public Funcionario getById(final int id) {
                   return entityManager.find(Funcionario.class, id);
         }
 
         @SuppressWarnings("unchecked")
         public List<Funcionario> findAll() {
                   return entityManager.createQuery("FROM " + Funcionario.class.getName()).getResultList();
         }
 
         public void persist(Funcionario funcionario) {
                   try {
                            entityManager.getTransaction().begin();
                            entityManager.persist(funcionario);
                            entityManager.getTransaction().commit();
                   } catch (Exception ex) {
                            ex.printStackTrace();
                            entityManager.getTransaction().rollback();
                   }
         }
 
         public void merge(Funcionario funcionario) {
                   try {
                            entityManager.getTransaction().begin();
                            entityManager.merge(funcionario);
                            entityManager.getTransaction().commit();
                   } catch (Exception ex) {
                            ex.printStackTrace();
                            entityManager.getTransaction().rollback();
                   }
         }
 
         public void remove(Funcionario funcionario) {
                   try {
                            entityManager.getTransaction().begin();
                            funcionario = entityManager.find(Funcionario.class, funcionario.getId());
                            entityManager.remove(funcionario);
                            entityManager.getTransaction().commit();
                   } catch (Exception ex) {
                            ex.printStackTrace();
                            entityManager.getTransaction().rollback();
                   }
         }
 
         public void removeById(final int id) {
                   try {
                	   Funcionario funcionario = getById(id);
                            remove(funcionario);
                   } catch (Exception ex) {
                            ex.printStackTrace();
                   }
         }
 
}