package com.bank.bankingsystem.model;

import com.bank.bankingsystem.model.enums.TipoMovimiento;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Document
public class Movimiento {
    @Id
    private String id;
    private LocalDateTime fecha;
    private TipoMovimiento tipoMovimiento;
    private BigDecimal monto;
}
