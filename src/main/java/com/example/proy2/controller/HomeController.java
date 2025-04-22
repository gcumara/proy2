package com.example.proy2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String saludo(){
        return "Hola desde la rama uno";
    }
}
