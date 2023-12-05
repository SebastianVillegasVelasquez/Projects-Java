package com.example.proyecto_universidad.controllers;

import com.example.proyecto_universidad.models.Estudiante;
import com.example.proyecto_universidad.services.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    //GET ALL
    @GetMapping
    public ResponseEntity<List<Estudiante>> getEstudiantes(){
        List<Estudiante> estudiantes = estudianteService.estudiantesLista();
        return new ResponseEntity<>(estudiantes, HttpStatus.OK);
    }

    //Get By ID


    //POST
    @PostMapping
    public ResponseEntity<String> crearEstudiante(@RequestBody Estudiante estudiante){
        try {
            estudianteService.crearEstudiante(estudiante);
            return new ResponseEntity<>("Estudiante creado exitosamente", HttpStatus.CREATED);
        }catch (Exception e){
            return  new ResponseEntity<>("Error al crear estudiante: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //PUT
    @PutMapping("editar/{id}")
    public ResponseEntity<String> editarEstudiante(@RequestBody Estudiante estudiante,@PathVariable Long id){
        try{
            estudiante.setId(id);
            estudianteService.editarEstudiante(estudiante);
            return new ResponseEntity<>("Estudiante editado correctamente ", HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("Error al editar el estudiante: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //DELETE
    @DeleteMapping("eliminar/{id}")
    public ResponseEntity<String> eliminarEstudiante(@PathVariable Long id){
        try{
            estudianteService.eliminarEstudiante(id);
            return  new ResponseEntity<>("Estudiante eliminado con exito ", HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("Error al editar el estudiante: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
