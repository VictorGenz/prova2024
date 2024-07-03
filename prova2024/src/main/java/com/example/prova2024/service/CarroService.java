package com.example.prova2024.service;

import com.example.prova2024.entity.Carro;
import com.example.prova2024.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarroService {
    @Autowired
    CarroRepository carroRepository;

public Carro cadastrarCarro(Carro carro) {
return carroRepository.save(carro);
}
public Carro buscarCarroPorId(Long id) {
    return carroRepository.findById(id).orElse(null);
}

public void deletarCarro(Long id) {
carroRepository.deleteById(id);
}

public Carro atualizarCarro(Carro carro) {
    return carroRepository.save(carro);
}

}
