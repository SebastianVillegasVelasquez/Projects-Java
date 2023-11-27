package com.example.proyecto_universidad.models;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "estudiantes",
uniqueConstraints = @UniqueConstraint(
        name = "correo_unique",
        columnNames = "correo"
))

public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;

    @Column(name = "correo",
    nullable = false)
    private String correo;

    @Column(name = "password")
    private String password;

    @ManyToMany(mappedBy = "estudiantes")
    private List<Asignatura> asignaturas;

    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
