package com.bank.bankingsystem.service;

import com.bank.bankingsystem.model.Cliente;
import com.bank.bankingsystem.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Flux<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public Mono<Cliente> findById(String id) {
        return clienteRepository.findById(id);
    }

    public Mono<Cliente> save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Mono<Cliente> update(String id, Cliente cliente) {
        return clienteRepository.findById(id)
                .flatMap(existingCliente -> {
                    existingCliente.setNombre(cliente.getNombre());
                    existingCliente.setTipo(cliente.getTipo());
                    existingCliente.setProductos(cliente.getProductos());
                    return clienteRepository.save(existingCliente);
                });
    }

    public Mono<Void> delete(String id) {
        return clienteRepository.deleteById(id);
    }
}