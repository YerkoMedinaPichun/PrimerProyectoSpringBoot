package com.generation.firstproyect.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
  
  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
    http.authorizeRequests()
    .antMatchers("/equipo/FindAll").permitAll()
    .antMatchers("/login").permitAll()
    .anyRequest().authenticated();

    return http.build();
  }

}
