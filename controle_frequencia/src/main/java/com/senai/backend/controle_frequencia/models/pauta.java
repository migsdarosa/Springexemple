package com.senai.backend.controle_frequencia.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

    @Entity
    @Table(name = "pauta")

public class pauta {

    @Id
    @GeneratedValue
    @Column(name = "id")

    private Integer id;
    
    @Column ( name = "turma")
    private String turma;

    @OneToMany
    @JoinColumn( name = "id_pauta")
    private List<usuario> usuario;

    public pauta() {
    }

    public pauta(Integer id, String turma, List<com.senai.backend.controle_frequencia.models.usuario> usuario) {
        this.id = id;
        this.turma = turma;
        this.usuario = usuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public List<usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(List<usuario> usuario) {
        this.usuario = usuario;
    }

    
    



}
