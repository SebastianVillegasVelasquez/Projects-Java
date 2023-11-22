package com.example.proyecto_universidad.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "asignaturas")
public class Asignatura {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nombre_asignatura")
    private String nombre_asignatura;

    @Column(name = "nombre_profesor")
    private String nombre_profesor;

    @Column(name = "horario_asignatura")
    private String horario_asignatura;

    @Column(name = "cupo_estudiantes")
    private int cupo_estudiantes;

}
