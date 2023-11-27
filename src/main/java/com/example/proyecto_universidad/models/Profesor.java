package com.example.proyecto_universidad.models;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "profesores",
uniqueConstraints = @UniqueConstraint(
        name = "email_unique",
        columnNames = "correo"
))
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @OneToMany(mappedBy = "profesor")
    private List<Asignatura> asignaturas;

}
