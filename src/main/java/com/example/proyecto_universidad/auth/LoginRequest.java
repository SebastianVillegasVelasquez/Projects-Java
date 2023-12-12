package com.example.proyecto_universidad.auth;

import lombok.*;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginRequest {
    String username;
    String password;
}
