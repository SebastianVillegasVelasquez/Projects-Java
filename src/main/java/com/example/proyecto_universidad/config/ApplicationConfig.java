package com.example.proyecto_universidad.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;

@Configuration
@RequiredArgsConstructor
public class ApplicationConfig {

    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) {

    }
}
