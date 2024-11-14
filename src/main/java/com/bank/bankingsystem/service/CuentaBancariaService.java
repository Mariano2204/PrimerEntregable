package com.bank.bankingsystem.service;

import com.bank.bankingsystem.model.CuentaBancaria;
import com.bank.bankingsystem.repository.CuentaBancariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CuentaBancariaService {

    @Autowired
    private CuentaBancariaRepository cuentaBancariaRepository;

    public Flux<CuentaBancaria> findAll() {
        return cuentaBancariaRepository.findAll();
    }

    public Mono<CuentaBancaria> findById(String id) {
        return cuentaBancariaRepository.findById(id);
    }

    public Mono<CuentaBancaria> save(CuentaBancaria cuentaBancaria) {
        return cuentaBancariaRepository.save(cuentaBancaria);
    }

    public Mono<CuentaBancaria> update(String id, CuentaBancaria cuentaBancaria) {
        return cuentaBancariaRepository.findById(id)
                .flatMap(existingCuenta -> {
                    existingCuenta.setNumeroCuenta(cuentaBancaria.getNumeroCuenta());
                    existingCuenta.setTipoCuenta(cuentaBancaria.getTipoCuenta());
                    existingCuenta.setSaldo(cuentaBancaria.getSaldo());
                    existingCuenta.setMovimientos(cuentaBancaria.getMovimientos());
                    return cuentaBancariaRepository.save(existingCuenta);
                });
    }

    public Mono<Void> delete(String id) {
        return cuentaBancariaRepository.deleteById(id);
    }
}