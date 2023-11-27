package com.example.proyecto_universidad.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "administradores",
        uniqueConstraints = @UniqueConstraint(
                name = "email_unique",
                columnNames = "correo"
        ))

public class Administrador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "correo",
    nullable = false)
    private String correo;

    @Column(name = "password")
    private String password;
}
