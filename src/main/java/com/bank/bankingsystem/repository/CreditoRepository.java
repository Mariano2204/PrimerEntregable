package com.bank.bankingsystem.repository;

import com.bank.bankingsystem.model.Credito;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditoRepository extends ReactiveMongoRepository<Credito, String> {
}
