package com.generation.firstproyect.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.generation.firstproyect.model.Equipo;
import com.generation.firstproyect.repository.EquipoRepository;

@Service
@Transactional
public class EquipoService {
  
  private EquipoRepository equipoRepository;

  public EquipoService(EquipoRepository equipoRepository){
    this.equipoRepository = equipoRepository;
  }

  public void saveEquipo(Equipo equipo){
    this.equipoRepository.save(equipo);
  }

  public void updateEquipo(Equipo equipo){
    this.equipoRepository.save(equipo);
  }

  public void deleteByIdEquipo(Integer id){
    this.equipoRepository.deleteById(id);
  }

  public List<Equipo> findAll(){
    return equipoRepository.findAll();
  }

  public List<Equipo> findEquipoWithFC(){
    return equipoRepository.findEquipoWithFC();
  }

  public List<Equipo> findAllEquipoAscOrder(){
    return equipoRepository.findAllEquipoAscOrder();
  }

  public List<Equipo> findAllEquiposDescOrder(){
    return equipoRepository.findAllEquipoDescOrder();
  }


}
