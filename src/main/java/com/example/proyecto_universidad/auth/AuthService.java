package com.example.proyecto_universidad.auth;

import com.example.proyecto_universidad.jwt.JwtService;
import com.example.proyecto_universidad.models.Estudiante;
import com.example.proyecto_universidad.models.Role;
import com.example.proyecto_universidad.repositories.EstudianteRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthService {
    private EstudianteRepository estudianteRepository;
    private JwtService jWtService;

    public AuthResponse login(LoginRequest login) {
        return null;
    }

    public AuthResponse register(RegisterRequest register) {
        Estudiante estudiante = Estudiante.builder()
                .nombre(register.getUsername())
                .apellido(register.getApellido())
                .correo(register.getCorreo())
                .password(register.getPassword())
                .role(Role.ESTUDIANTE)
                .build();

        estudianteRepository.save(estudiante);

        return AuthResponse.builder()
                .token(jWtService.getToken(estudiante))
                .build();
    }
}
