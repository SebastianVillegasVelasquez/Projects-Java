package com.example.proyecto_universidad.repositories;

import com.example.proyecto_universidad.models.Administrador;
import com.example.proyecto_universidad.models.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
    Optional<Estudiante> findByNombre(String nombre);

    Optional<Estudiante> findByCorreo(String correo);

}
