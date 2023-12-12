package com.example.proyecto_universidad.jwt;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.io.Encoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Objects;

@Service
public class JwtService {

    private final static String PRIVATE_KEY = "7526348912345678901234567890123456789012345678901234567890";

    public String getToken(UserDetails userDetails) {
        return getToken(new HashMap<>(), userDetails);
    }

    private String getToken(HashMap<String, Object> extraClaims, UserDetails userDetails) {
        return Jwts
                .builder()
                .setSubject(userDetails.getUsername())
                .setClaims(extraClaims)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 24 * 60))
                .signWith(getKey(), SignatureAlgorithm.HS256)
                .compact();

    }

    private Key getKey() {
        byte[] key = Decoders.BASE64URL.decode(PRIVATE_KEY);
        return Keys.hmacShaKeyFor(key);
    }
}
