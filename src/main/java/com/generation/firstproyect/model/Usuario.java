package com.generation.firstproyect.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;

import org.hibernate.validator.constraints.Range;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name="usuarios")
public class Usuario {
  @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY)
  private int id_usuario;

  @Column(name = "nombre_usuario")
  @Range(min = 3, max = 25, message = "El nombre del usuario debe ser mínimo de 3 carácteres y máximo 25 carácteres.")
  private String nombreDeUsuario;

  @Email
  private String email;

  @Range( min = 8, message = "El usuario no puede ser menos de 8 carácteres")
  private String password;

}
