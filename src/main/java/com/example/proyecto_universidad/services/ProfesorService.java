package com.example.proyecto_universidad.services;

import com.example.proyecto_universidad.models.Estudiante;
import com.example.proyecto_universidad.models.Profesor;
import com.example.proyecto_universidad.repositories.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesorService {
    @Autowired
    private ProfesorRepository profesorRepository;

    //Obtener todos los profesores
    public List<Profesor> profesorLista() {
        return profesorRepository.findAll();
    }


    //Obtener profesor por correo
    public Optional<Profesor> profesorByCorreo(String correo) {
        return profesorRepository.findByCorreo(correo);
    }

    //Obtener profesor por Id
    public Optional<Profesor> profesorById(Long id) {
        return profesorRepository.findById(id);
    }

    //Crear profesor
    public Profesor crearProfesor(Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    //Editar profesor
    public Profesor editarProfesor(Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    //Eliminar profesor por ID

    public void eliminarProfesor(Long id) {
        profesorRepository.deleteById(id);
    }
}
