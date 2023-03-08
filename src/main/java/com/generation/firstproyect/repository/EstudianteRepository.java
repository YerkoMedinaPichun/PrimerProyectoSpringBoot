package com.generation.firstproyect.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.generation.firstproyect.model.Estudiante;

//son las instrucciones que le mandaremos mandar a la base de datos
//No es una clase, es una interfaz, son clases que permiten generar instrucciones para poder ocuparla

//Vas a crear un archivo repository en donde cuando te conectes a la base
//vas a trabajar con objetos de tipo Estudiantes, el cual tiene un ID de tipo Integer

//La capa que "conversa" con la base de datos
public interface EstudianteRepository extends JpaRepository<Estudiante, Integer>{

  //Esta es una query nativa, sin parametros que nos permite obtener los estudiantes que tengan una 'LL' en su nombre
  //es una consulta personalizada
  @Query(value = "SELECT * FROM estudiantes WHERE nombre LIKE ('%ll%')",nativeQuery=true)
  List <Estudiante> findEstudiantesWithLL();

  //@Query(value = "SELECT * FROM estudiantes WHERE equipo_id = ?1 AND nombre = ?2")

  //Esto tambien es query nativa, con parametros que nos permite obtener los estudiantes pertenecientes a un equipo el cual yo voy a especificar cuando llame a esta consulta, también es una consulta personalizada
  @Query(value = "SELECT * FROM estudiantes WHERE equipo_id = ?1", nativeQuery = true)
  List <Estudiante> findEstudianteByEquipo(Integer equipo);


  //ejemplo de otro proyecto
  //Como hacer una funcion de modificacion con Querys nativas
  //@Modifying
  /*@Modifying
    @Query(value = "UPDATE PRODUCT p SET p.STOCK = p.stock+10 WHERE p.id = ?1", nativeQuery = true)
    void sumarStock(Long recetaID);*/

  
}
