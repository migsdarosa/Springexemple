package com.senai.backend.controle_frequencia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.controle_frequencia.models.usuario;
import com.senai.backend.controle_frequencia.repositories.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public long contarUsuarios(){
        return usuarioRepository.count();
    }

    public usuario buscarUsuario(Integer id){
        return usuarioRepository.findById(id).get();
    }

    public List<usuario> listarUsuario() {
        return usuarioRepository.findAll();
    }

    public Boolean deletarUsuario(Integer id) {
        if(usuarioRepository.existsById(id)) {
            usuarioRepository.existsById(id);
            return true;
        }
        return true;
    }

    public usuario cadastrarUsuario(usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public usuario atualizarUsuario(Integer id, usuario usuario) {
        usuario usuarioRecuperado = buscarUsuario(id);
        if(usuarioRecuperado != null){
            usuarioRecuperado.setId(id);
                if(usuario.getNome() != null) {
                    usuarioRecuperado.setNome(usuario.getNome());
                }
                if(usuario.getDataNascimento() != null){
                    usuarioRecuperado.setDataNascimento(usuario.getDataNascimento());

                }
                return usuarioRepository.save(usuarioRecuperado);

            } 
            return null;

        }
    }

