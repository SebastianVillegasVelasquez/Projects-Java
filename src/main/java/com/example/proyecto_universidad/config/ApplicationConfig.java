package com.example.proyecto_universidad.config;

import com.example.proyecto_universidad.repositories.AdministradorReposityory;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Configuration
@RequiredArgsConstructor
public class ApplicationConfig {

    private final AdministradorReposityory administradorReposityory;

    @Bean
    public UserDetailsService loadByUsername() {
        return username -> administradorReposityory.findByCorreo(username)
                .orElseThrow(() -> new UsernameNotFoundException("user not found"));
    }
}
