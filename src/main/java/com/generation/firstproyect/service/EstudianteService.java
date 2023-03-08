package com.generation.firstproyect.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.generation.firstproyect.model.Estudiante;
import com.generation.firstproyect.repository.EstudianteRepository;

@Service
@Transactional
public class EstudianteService {

  //Se conecta con el archivo repository para poder ocuparlo a nivel de las instrucciones creadas en esta
  private EstudianteRepository estudianteRepository;


  
  public EstudianteService(EstudianteRepository estudianteRepository){
        this.estudianteRepository = estudianteRepository;
  }





  public void saveEstudiante(Estudiante estudiante){

    //Este .save está haciendo el trabajo de un INSERT INTO, pero Java lo reconoce por defecto, entonces lo hará de manera automatica cuando reconozca este método
    this.estudianteRepository.save(estudiante);
  }

  public void updateEstudiante(Estudiante estudiante){
    //A pesar de ser una funcion de actualizacion, se ocupa el mismo método .save()
    this.estudianteRepository.save(estudiante);
  }

  public void deleteEstudiante(Integer id){
    estudianteRepository.deleteById(id);
  }

  public List<Estudiante> findAll(){
    return estudianteRepository.findAll();
  }


  public List<Estudiante> estudiantesConLL(){
    return estudianteRepository.findEstudiantesWithLL();
  }

  public List<Estudiante> estudiantePorEquipo(Integer equipo){
    return estudianteRepository.findEstudianteByEquipo(equipo);
  }
  
}
