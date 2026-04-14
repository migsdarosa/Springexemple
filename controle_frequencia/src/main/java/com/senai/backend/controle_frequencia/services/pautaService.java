package com.senai.backend.controle_frequencia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.controle_frequencia.models.pauta;
import com.senai.backend.controle_frequencia.repositories.pautaRepository;

@Service
public class pautaService {

    @Autowired
    private pautaRepository pautaRepository;

    public long contarPautas() {
        return pautaRepository.count();
    }

    public pauta buscarPauta(Integer id) {
        return pautaRepository.findById(id).get();

    }

    public List<pauta> listarPautas() {
        return pautaRepository.findAll();
    }

    public Boolean deletarPauta(Integer id) {
        if (pautaRepository.existsById(id)) {
            pautaRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public pauta cadatrarPauta(pauta pauta) {
        return pautaRepository.save(pauta);

    }

    public pauta atualizarPauta(Integer id, pauta pauta) {
        pauta pautaRecuperada = buscarPauta(id);
        if(pautaRecuperada != null) {
            pautaRecuperada.setId(id);
            if(pauta.getTurma() != null) {
                pautaRecuperada.setTurma(pauta.getTurma());

            }
            return pautaRepository.save(pautaRecuperada);
        }
        return null;
    }


}
