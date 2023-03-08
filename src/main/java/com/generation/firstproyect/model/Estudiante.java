package com.generation.firstproyect.model;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//El entity nos permite decirle al objeto que hará referencia a una tabla
//además podemos entregar el nombre de la tabla de manera explicita
@Entity(name="estudiantes")
public class Estudiante {
  //estos 2 datos nos permiten especificarle a la base de datos que el siguiente atributo es el Id de la tabla
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer estudiante_id;
  private String nombre;
  private String apellido;
  private Integer equipo_id;

  /* Constructores */

  public Estudiante() {
  }
  public Estudiante(Integer estudiante_id, String nombre, String apellido, Integer equipo_id) {
    this.estudiante_id = estudiante_id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.equipo_id = equipo_id;
  }

  /* Getters And Setters */

  public Integer getEstudiante_id() {
    return estudiante_id;
  }
  public void setEstudiante_id(Integer estudiante_id) {
    this.estudiante_id = estudiante_id;
  }
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public String getApellido() {
    return apellido;
  }
  public void setApellido(String apellido) {
    this.apellido = apellido;
  }
  public Integer getEquipo_id() {
    return equipo_id;
  }
  public void setEquipo_id(Integer equipo_id) {
    this.equipo_id = equipo_id;
  }

  /* toString */

  @Override
  public String toString() {
    return "Estudiante [estudiante_id=" + estudiante_id + ", nombre=" + nombre + ", apellido=" + apellido
        + ", equipo_id=" + equipo_id + "]";
  }

  








}
