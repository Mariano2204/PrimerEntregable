package com.bank.bankingsystem.controller;

import com.bank.bankingsystem.model.Cliente;
import com.bank.bankingsystem.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public Flux<Cliente> getAllClientes() {
        return clienteService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Cliente> getClienteById(@PathVariable String id) {
        return clienteService.findById(id);
    }

    @PostMapping
    public Mono<Cliente> createCliente(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }

    @PutMapping("/{id}")
    public Mono<Cliente> updateCliente(@PathVariable String id, @RequestBody Cliente cliente) {
        return clienteService.update(id, cliente);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteCliente(@PathVariable String id) {
        return clienteService.delete(id);
    }
}
