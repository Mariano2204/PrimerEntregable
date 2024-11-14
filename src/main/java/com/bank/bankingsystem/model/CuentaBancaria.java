package com.bank.bankingsystem.model;

import com.bank.bankingsystem.model.enums.TipoCuenta;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@Data
@Document
public class CuentaBancaria {
    @Id
    private String id;
    private String numeroCuenta;
    private TipoCuenta tipoCuenta;
    private BigDecimal saldo;
    private List<Movimiento> movimientos;
}


