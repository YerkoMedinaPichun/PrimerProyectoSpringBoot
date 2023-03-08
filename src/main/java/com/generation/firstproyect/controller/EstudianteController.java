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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.generation.firstproyect.model.Estudiante;
import com.generation.firstproyect.service.EstudianteService;

//Especificamos que es una clase de tipo Controller
//Se debe especificar el origen de las peticiones, en este caso pueden venir de cualquier lado
@Controller
@CrossOrigin("*")
@RestController
public class EstudianteController {
  private EstudianteService estudianteService;

  public EstudianteController(@Autowired EstudianteService estudianteService){
    this.estudianteService= estudianteService;
  }

  /*
   * public EstudianteController(@Autowired EstudianteService estudianteService){
        this.estudianteService= estudianteService;
    }

   * 
   */

  //post, get, delete, put
  //post  -> ingresar datos a la base
  @PostMapping("/estudiante/Save")
  public void guardarEstudiante(@RequestBody Estudiante estudiante){
    estudianteService.saveEstudiante(estudiante);
  }

  @PutMapping("/estudiante/Update")
  public void editarEstudiante(@RequestBody Estudiante estudiante){
    estudianteService.updateEstudiante(estudiante);
  }

  @DeleteMapping("/estudiante/Delete/{id}")
  public void eliminarEstudiante(@PathVariable Integer id){
    estudianteService.deleteEstudiante(id);
  }

  @GetMapping("/estudiante/FindAll")
  public List<Estudiante> obtenerEstudiantes(){
    return estudianteService.findAll();
  }

  @GetMapping("/estudiante/ConLL")
  public List<Estudiante> estudiantesConLL(){
    return estudianteService.estudiantesConLL();
  }

  @GetMapping("/estudiante/PorGrupo/{equipo}")
  public List<Estudiante> estudiantesPorGrupo(@PathVariable Integer equipo){
    return estudianteService.estudiantePorEquipo(equipo);
  }


}
