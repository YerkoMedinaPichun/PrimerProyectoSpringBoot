package com.generation.firstproyect.model;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
//@ToString
@Entity(name="equipos")
public class Equipo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer equipo_id;
  private String nombre_proyecto;
  private Integer integrantes;

  // public Equipo() {
  // }

  // public Equipo(Integer equipo_id, String nombre_proyecto, Integer integrantes) {
  //   this.equipo_id = equipo_id;
  //   this.nombre_proyecto = nombre_proyecto;
  //   this.integrantes = integrantes;
  // }
  
  // public Integer getEquipo_id() {
  //   return equipo_id;
  // }
  // public void setEquipo_id(Integer equipo_id) {
  //   this.equipo_id = equipo_id;
  // }
  // public String getNombre_proyecto() {
  //   return nombre_proyecto;
  // }
  // public void setNombre_proyecto(String nombre_proyecto) {
  //   this.nombre_proyecto = nombre_proyecto;
  // }
  // public Integer getIntegrantes() {
  //   return integrantes;
  // }
  // public void setIntegrantes(Integer integrantes) {
  //   this.integrantes = integrantes;
  // }

  // @Override
  // public String toString() {
  //   return "Equipo [equipo_id=" + equipo_id + ", nombre_proyecto=" + nombre_proyecto + ", integrantes=" + integrantes
  //       + "]";
  // }

  
  
}
