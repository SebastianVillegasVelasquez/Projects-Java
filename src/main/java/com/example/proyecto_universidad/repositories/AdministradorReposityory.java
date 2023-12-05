package com.example.proyecto_universidad.repositories;

import com.example.proyecto_universidad.models.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdministradorReposityory extends JpaRepository<Administrador, Long> {
    Optional<Administrador> findByCorreo(String correo);
}
