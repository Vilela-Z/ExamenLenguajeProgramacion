package util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.EntityManager;

public class JpaUtil {

  private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Examen");

  public static EntityManager getEntityManager() {
    return emf.createEntityManager();
  }

}