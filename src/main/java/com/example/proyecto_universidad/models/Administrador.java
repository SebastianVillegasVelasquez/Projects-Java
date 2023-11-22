package com.example.proyecto_universidad.models;

import jakarta.persistence.*;
<<<<<<< HEAD
import lombok.*;
=======
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
>>>>>>> origin/main

@Entity
@NoArgsConstructor
@AllArgsConstructor
<<<<<<< HEAD
@Getter
@Setter
=======
@Data
>>>>>>> origin/main
@Table(name = "administradores")
public class Administrador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "correo")
    private String correo;

    @Column(name = "password")
    private String password;
}
