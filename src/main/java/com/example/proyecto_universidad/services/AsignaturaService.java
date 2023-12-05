package com.example.proyecto_universidad.services;

import com.example.proyecto_universidad.models.Asignatura;
import com.example.proyecto_universidad.models.Profesor;
import com.example.proyecto_universidad.repositories.AsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AsignaturaService {

    @Autowired
    private AsignaturaRepository asignaturaRepository;

    //Obtener todas las asignaturas
    public List<Asignatura> AsignaturaLista() {
        return asignaturaRepository.findAll();
    }

    //Obtener asignatura por nombre
    public Optional<Asignatura> asignaturaByNombre(String nombre_Asignatura) {
        return asignaturaRepository.findByNombre_asignatura(nombre_Asignatura);
    }

    //Crear asignatura
    public Asignatura crearAsignatura(Asignatura asignatura) {
        return asignaturaRepository.save(asignatura);
    }

    //Editar asignatura
    public Asignatura editarAsignatura(Asignatura asignatura) {
        return asignaturaRepository.save(asignatura);
    }

    //Eliminar asignatura por ID
    public void eliminarAsignatura(Long id) {
        asignaturaRepository.deleteById(id);
    }
}
