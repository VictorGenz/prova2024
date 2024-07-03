package com.example.prova2024.controller;

import com.example.prova2024.entity.Carro;
import com.example.prova2024.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Carro")

public class CarroController {
@Autowired
    CarroService carroService;

@PostMapping("/cadastrar")
public Carro cadastrarCarro(@RequestBody Carro carro) {
    return carroService.cadastrarCarro(carro);
}
@GetMapping("/buscar")
    public Carro buscarCarro(@RequestParam Long id) {
    return carroService.buscarCarroPorId(id);
}

@PostMapping("/atualizar")
    public Carro atualizarCarro(@RequestBody Carro carro) {
    return carroService.atualizarCarro(carro);
}

@DeleteMapping("/deletar")
    public void deletarCarro(@RequestParam Long id) {
    carroService.deletarCarro(id);
}


}
