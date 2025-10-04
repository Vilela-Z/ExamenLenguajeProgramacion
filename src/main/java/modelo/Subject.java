package modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "subject")
@NamedQueries({
  @NamedQuery(name = "Subject.findAll", query = "SELECT s FROM Subject s"),
  @NamedQuery(name = "Subject.findByName", query = "SELECT s FROM Subject s WHERE s.nombre LIKE :nombre")
})
 
public class Subject {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "idsubject")
  private int idSubject;

  @Column(name = "name")
  private String nombre;

  @Column(name = "credit")
  private int creditos;
  public Subject() {}

  public Subject(String nombre, int creditos) {
    this.nombre = nombre;
    this.creditos = creditos;
  }

  public int getIdSubject() { return idSubject; }
  public void setIdSubject(int idSubject) { this.idSubject = idSubject; }
  public String getNombre() { return nombre; }
  public void setNombre(String nombre) { this.nombre = nombre; }
  public int getCreditos() { return creditos; }
  public void setCreditos(int creditos) { this.creditos = creditos; }

  @Override
  public String toString() {
    return idSubject + " | " + nombre + " | " + creditos;
    
  }
}