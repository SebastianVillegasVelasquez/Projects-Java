package com.example.proyecto_universidad.repositories;

import com.example.proyecto_universidad.models.Administrador;
import com.example.proyecto_universidad.models.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
    Optional<Profesor> findByCorreo(String correo);

}
