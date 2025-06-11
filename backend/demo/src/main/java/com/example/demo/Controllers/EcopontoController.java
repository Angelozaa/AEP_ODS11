package com.example.demo.Controllers;

import com.example.demo.Model.EcopontoModel;
import com.example.demo.Repositorys.EcopontoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ecopontos")
@CrossOrigin(origins = "*")
public class EcopontoController {

    private final EcopontoRepository repository;

    public EcopontoController(EcopontoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<EcopontoModel> listarTodos() {
        return repository.findAll();
    }

    @PostMapping
    public EcopontoModel cadastrar(@RequestBody EcopontoModel ecoponto) {
        return repository.save(ecoponto);
    }
}
