package com.example.proyecto_universidad.repositories;

import com.example.proyecto_universidad.models.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AsignaturaRepository extends JpaRepository<Asignatura, Long> {
    Optional<Asignatura> findByNombre_asignatura(String nombre_asignatura);
}
