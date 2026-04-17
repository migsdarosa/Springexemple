package com.senai.backend.controle_frequencia.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.controle_frequencia.models.usuario;
import com.senai.backend.controle_frequencia.services.UsuarioService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/usuario")
public class usuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/contar-usuarios")
    public long contarUsuarios() {
        return usuarioService.contarUsuarios();
    }

    @GetMapping("/buscar_usuario/{id}")
    public usuario buscarUsuario(@PathVariable Integer id) {
        return usuarioService.buscarUsuario(id);
    }

    @GetMapping("/listar-usuarios")
    public List<usuario> listarUsuario() {
        return usuarioService.listarUsuario();
    }

     @GetMapping("/deletar-usuario/{id}")
    public String deletarUsuario(@PathVariable Integer id) {
        if (usuarioService.deletarUsuario(id)) {
            return "Usuario deletado com sucesso!";
        }
        return "Falha ao deletar usuario";
    }

    @PostMapping("/salvar-usuario")
    public usuario cadastrarUsuario(@RequestBody usuario usuario) {
        return usuarioService.cadastrarUsuario(usuario);
    }

    @PutMapping("/atualizar-usuario")
    public String putMethodName(@PathVariable String id, @RequestBody String entity) {
        
        
        return entity;
    }
    public String atualizarUsuario(@PathVariable Integer id, @RequestBody usuario usuario) {
        if (usuarioService.atualizarUsuario(id, usuario) != null) {
            return "Usuario atualizado com sucesso!";
        }
        return "Falha ao atualizar usuario";
    }











}
