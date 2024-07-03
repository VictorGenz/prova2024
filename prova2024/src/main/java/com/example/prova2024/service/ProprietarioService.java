package com.example.prova2024.service;

import com.example.prova2024.entity.Proprietario;
import com.example.prova2024.repository.ProprietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProprietarioService {
    @Autowired
    ProprietarioRepository proprietarioRepository;

    public Proprietario cadastrarProprietario(Proprietario proprietario) {
        return proprietarioRepository.save(proprietario);
    }

    public Proprietario buscarProprietarioPorId(Long id) {
        return proprietarioRepository.findById(id).orElse(null);
    }

    public void excluirProprietarioPorId(Long id) {
        proprietarioRepository.deleteById(id);
    }

    public Proprietario atualizarProprietario(Proprietario proprietario) {
        return proprietarioRepository.save(proprietario);
    }

}
