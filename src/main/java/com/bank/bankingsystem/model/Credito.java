package com.bank.bankingsystem.model;

import com.bank.bankingsystem.model.enums.TipoCredito;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@Document
public class Credito {
    @Id
    private String id;
    private TipoCredito tipoCredito;
    private BigDecimal limiteCredito;
    private BigDecimal saldo;
}