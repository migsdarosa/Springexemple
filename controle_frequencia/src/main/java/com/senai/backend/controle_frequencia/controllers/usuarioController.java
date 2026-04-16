package com.senai.backend.controle_frequencia.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.controle_frequencia.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/usuario")
public class usuarioController {

    @Autowired
   private UsuarioService usuarioService; 
    
}
