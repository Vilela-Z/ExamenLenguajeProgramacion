package dao;

import java.util.List;
import jakarta.persistence.*;
import modelo.Subject;
import util.JpaUtil;

public class SubjectDAO {

  EntityManager em = JpaUtil.getEntityManager();

  public void registrar(Subject s) {
    em.getTransaction().begin();
    em.persist(s);
    em.getTransaction().commit();
  }

  public void editar(Subject s) {
    em.getTransaction().begin();
    em.merge(s);
    em.getTransaction().commit();
  }

  public void eliminar(int id) {
    Subject s = em.find(Subject.class, id);
    if (s != null) {
      em.getTransaction().begin();
      em.remove(s);
      em.getTransaction().commit();
    }
  }

  public List<Subject> listar() {
    return em.createNamedQuery("Subject.findAll", Subject.class).getResultList();
  }

  public List<Subject> buscarPorNombre(String nombre) {
    return em.createNamedQuery("Subject.findByName", Subject.class)
        .setParameter("nombre", "%" + nombre + "%")
        .getResultList();

  }
}