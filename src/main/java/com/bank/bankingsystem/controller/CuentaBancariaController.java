package com.bank.bankingsystem.controller;

import com.bank.bankingsystem.model.CuentaBancaria;
import com.bank.bankingsystem.service.CuentaBancariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/cuentas")
public class CuentaBancariaController {

    @Autowired
    private CuentaBancariaService cuentaBancariaService;

    @GetMapping
    public Flux<CuentaBancaria> getAllCuentas() {
        return cuentaBancariaService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<CuentaBancaria> getCuentaById(@PathVariable String id) {
        return cuentaBancariaService.findById(id);
    }

    @PostMapping
    public Mono<CuentaBancaria> createCuenta(@RequestBody CuentaBancaria cuentaBancaria) {
        return cuentaBancariaService.save(cuentaBancaria);
    }

    @PutMapping("/{id}")
    public Mono<CuentaBancaria> updateCuenta(@PathVariable String id, @RequestBody CuentaBancaria cuentaBancaria) {
        return cuentaBancariaService.update(id, cuentaBancaria);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteCuenta(@PathVariable String id) {
        return cuentaBancariaService.delete(id);
    }
}
