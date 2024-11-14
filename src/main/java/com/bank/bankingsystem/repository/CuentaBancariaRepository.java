package com.bank.bankingsystem.repository;

import com.bank.bankingsystem.model.CuentaBancaria;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuentaBancariaRepository extends ReactiveMongoRepository<CuentaBancaria, String> {
}
