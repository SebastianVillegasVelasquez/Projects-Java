package com.example.proyecto_universidad.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(value = "prueba", method = RequestMethod.GET)
    public String prueba(){
        return "Hola mundo";
    }
}
