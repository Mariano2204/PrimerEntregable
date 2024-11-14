package com.bank.bankingsystem.model;


import com.bank.bankingsystem.model.enums.TipoCliente;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Cliente {
    @Id
    private String id;
    private String nombre;
    private TipoCliente tipo;
    private List<String> productos; // IDs de productos
}