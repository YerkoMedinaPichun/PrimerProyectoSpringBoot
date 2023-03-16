package com.generation.firstproyect.model;

import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name="usuarios")
public class Usuario implements UserDetails {
  @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY)
  @NotNull
  private Long id_usuario;

  @Column(name = "nombre_usuario")
  @Size(min = 3, message = "El nombre del usuario debe ser mínimo de 3 carácteres y máximo 25 carácteres.")
  private String username;

  // @Email
  // private String email;

  @Size( min = 8, message = "El usuario no puede ser menos de 8 carácteres")
  private String password;



  private boolean accountNonLocked;


  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    //permisos que tendrá el usuario segun el Rol y es de tipo lectura
    return List.of(() -> "Read");
  }

  @Override
  public String getUsername() {
    return username;
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }

  public boolean getAccountNonLocked(){
    return accountNonLocked;
  }

}
