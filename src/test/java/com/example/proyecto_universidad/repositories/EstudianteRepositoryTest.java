package com.example.proyecto_universidad.repositories;

import com.example.proyecto_universidad.models.Estudiante;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class EstudianteRepositoryTest {

    @Autowired
    EstudianteRepository estudianteRepository;

    @Test
    public void saveEstudiante(){
        Estudiante estudiante = Estudiante.builder()
                .nombre("Jhon")
                .apellido("Doe")
                .correo("Example@example.com")
                .password("Example")
                .build();

        estudianteRepository.save(estudiante);
    }

    @Test
    public void findByFirstName(){
        Estudiante estudiante = estudianteRepository.findByNombre("Sebastian").get();
        System.out.println("Estudiante " + estudiante);
    }


}