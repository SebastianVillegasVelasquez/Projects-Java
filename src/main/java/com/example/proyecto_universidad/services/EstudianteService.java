package com.example.proyecto_universidad.services;

import com.example.proyecto_universidad.models.Estudiante;
import com.example.proyecto_universidad.repositories.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    //Obtener todos los estudiantes
    public List<Estudiante> estudiantesLista() {
        try {
            return estudianteRepository.findAll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    //Obtener estudiante por correo
    public Optional<Estudiante> estudianteByCorreo(String correo) {
        return estudianteRepository.findByCorreo(correo);
    }

    //Obtener estudiante por id

    public Optional<Estudiante> estudianteById(Long id) {
        return estudianteRepository.findById(id);
    }

    //Crear Estudiante
    public Estudiante crearEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    //Editar Estudiante
    public Estudiante editarEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    //Eliminar estudiante por ID

    public void eliminarEstudiante(Long id) {
        estudianteRepository.deleteById(id);
    }
}
