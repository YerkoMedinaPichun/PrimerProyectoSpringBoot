package com.generation.firstproyect.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.generation.firstproyect.model.Equipo;
import com.generation.firstproyect.service.EquipoService;

@Controller
@CrossOrigin("*")
@RestController
public class EquipoController {
  private Equipo equipo;
  private EquipoService equipoService;

  public EquipoController(@Autowired EquipoService equipoService){
    this.equipoService = equipoService;
  }

  @PostMapping("/equipo/Save")
  public void guardarEquipo(@RequestBody Equipo equipo){
    equipoService.saveEquipo(equipo);
  }

  @PutMapping("/equipo/Update")
  public void actualizarEquipo(@RequestBody Equipo equipo){
    equipoService.updateEquipo(equipo);
  }

  @DeleteMapping("/equipo/Delete/{id}")
  public void eliminarEquipo(@PathVariable Integer id){
    equipoService.deleteByIdEquipo(id);
  }

  @GetMapping("/equipo/FindAll")
  public List<Equipo> obtenerEquipos(){
    return equipoService.findAll();
  }

  @GetMapping("/equipo/FindWithFC")
  public List<Equipo> obtenerEquiposFC(){
    return equipoService.findEquipoWithFC();
  }

  @GetMapping("/equipo/FindAllAscOrder")
  public List<Equipo> obtenerEquiposOrdenadosAsc(){
    return equipoService.findAllEquipoAscOrder();
  }

  @GetMapping("/equipo/FindAllDescOrder")
  public List<Equipo> obtenerEquipoOrdenadosDesc(){
    return equipoService.findAllEquiposDescOrder();
  }

}
