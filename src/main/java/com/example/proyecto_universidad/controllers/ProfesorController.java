package com.example.proyecto_universidad.controllers;

import com.example.proyecto_universidad.models.Profesor;
import com.example.proyecto_universidad.services.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/profesores")
public class ProfesorController {
    @Autowired
    private ProfesorService profesorService;

    //GET ALL
    @GetMapping
    public ResponseEntity<List<Profesor>> getProfesors(){
        List<Profesor> Profesores = profesorService.profesorLista();
        return new ResponseEntity<>(Profesores, HttpStatus.OK);
    }

    //Get By ID
    @GetMapping("get/{id}")
    public ResponseEntity<Optional<Profesor>> getProfesorById(@PathVariable long id){
        try {
            Optional<Profesor> profesorById = profesorService.profesorById(id);
            if (profesorById.isPresent()){
                return new ResponseEntity<>(profesorById, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //POST
    @PostMapping
    public ResponseEntity<String> crearProfesor(@RequestBody Profesor Profesor){
        try {
            profesorService.crearProfesor(Profesor);
            return new ResponseEntity<>("Profesor creado exitosamente", HttpStatus.CREATED);
        }catch (Exception e){
            return  new ResponseEntity<>("Error al crear Profesor: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //PUT
    @PutMapping("editar/{id}")
    public ResponseEntity<String> editarProfesor(@RequestBody Profesor Profesor,@PathVariable Long id){
        try{
            Profesor.setId(id);
            profesorService.editarProfesor(Profesor);
            return new ResponseEntity<>("Profesor editado correctamente ", HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("Error al editar el Profesor: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //DELETE
    @DeleteMapping("eliminar/{id}")
    public ResponseEntity<String> eliminarProfesor(@PathVariable Long id){
        try{
            profesorService.eliminarProfesor(id);
            return  new ResponseEntity<>("Profesor eliminado con exito ", HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("Error al editar el Profesor: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
