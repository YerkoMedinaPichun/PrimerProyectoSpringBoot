package com.generation.firstproyect.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.generation.firstproyect.model.Equipo;

public interface EquipoRepository extends JpaRepository<Equipo,Integer>{
  

  @Query(value = "SELECT * FROM equipos WHERE nombre_proyecto LIKE 'f%' OR nombre_proyecto LIKE 'C%'",nativeQuery = true)
  List <Equipo> findEquipoWithFC();

  @Query(value = "SELECT * FROM equipos ORDER BY nombre_proyecto ASC",nativeQuery = true)
  List<Equipo> findAllEquipoAscOrder();

  @Query(value = "SELECT * FROM equipos ORDER BY nombre_proyecto DESC",nativeQuery = true)
  List<Equipo> findAllEquipoDescOrder();
}

/*
 * SELECT * FROM equipos ORDER BY nombre_proyecto ASC;
SELECT * FROM equipos ORDER BY nombre_proyecto DESC;
 */