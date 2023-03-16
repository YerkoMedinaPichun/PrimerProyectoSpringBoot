package com.generation.firstproyect.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.generation.firstproyect.model.Usuario;
import com.generation.firstproyect.model.UsuarioDTO;
import com.generation.firstproyect.repository.UsuarioRepository;


@Service
public class MyUserDetailsService implements UserDetailsService{

  //Inyección de dependencias que hacemos para poder acceder a los metodos del repository de esta clase
  @Autowired
  private UsuarioRepository usuarioRepository;
  
  //Metodo para buscar el usuario por username, haciendo el llamado al repositorio
  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
    Usuario usuario = usuarioRepository.findUserByUsername(username);
    return new org.springframework.security.core.userdetails.User(usuario.getUsername(),usuario.getPassword(),new ArrayList<>());
  }


  //Metodo para crear un nuevo usuario
  public Usuario createUser(UsuarioDTO usuarioDTO){
    Usuario usuario = new Usuario();
    usuario.setUsername(usuarioDTO.getUsername());
    usuario.setPassword(usuarioDTO.getPassword());

    return usuarioRepository.save(usuario);
  }
}
