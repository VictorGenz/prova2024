package com.example.prova2024.controller;

import com.example.prova2024.entity.Proprietario;
import com.example.prova2024.service.ProprietarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Proprietario")

public class ProprietarioController {
@Autowired
ProprietarioService proprietarioService;

@PostMapping("/cadastrar")
    public Proprietario cadastrarProprietario(@RequestBody Proprietario proprietario) {
    return proprietarioService.cadastrarProprietario(proprietario);
}

@GetMapping("/buscar")
    public Proprietario buscarProprietario(@RequestParam Long id) {
return proprietarioService.buscarProprietarioPorId(id);
}

@PostMapping("/atualizar")
    public Proprietario atualizarProprietario(@RequestBody Proprietario proprietario) {
    return proprietarioService.atualizarProprietario(proprietario);
}

@DeleteMapping("/deletar")
    public void deletarProprietario(@RequestParam Long id) {
    proprietarioService.excluirProprietarioPorId(id);
}

}
