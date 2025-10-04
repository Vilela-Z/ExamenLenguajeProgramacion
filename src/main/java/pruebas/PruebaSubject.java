package pruebas;

import dao.SubjectDAO;
import modelo.Subject;

public class PruebaSubject {

  public static void main(String[] args) {
    SubjectDAO dao = new SubjectDAO();

    // Registrar nuevo curso
    Subject nuevo = new Subject("Base de Datos II", 4);
    dao.registrar(nuevo);

    // Editar curso
    nuevo.setCreditos(5);
    dao.editar(nuevo);

    // Listar todos
    System.out.println("=== LISTA DE CURSOS ===");
    dao.listar().forEach(System.out::println);

    // Buscar por nombre
    System.out.println("\n=== BUSCAR: 'Base' ===");
    dao.buscarPorNombre("Base").forEach(System.out::println);

    // Eliminar curso
    dao.eliminar(nuevo.getIdSubject());
  }
}