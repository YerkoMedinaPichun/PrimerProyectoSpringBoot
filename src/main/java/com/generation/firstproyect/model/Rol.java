package com.generation.firstproyect.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity(name = "roles")
public class Rol {
  @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "nombre_rol")
  private String nombreRol;
}
