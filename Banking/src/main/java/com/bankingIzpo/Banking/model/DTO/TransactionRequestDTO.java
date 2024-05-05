package com.bankingIzpo.Banking.model.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class TransactionRequestDTO {
    private Long id;
    @NotBlank(message = "La cuenta de origen no puede ser vacio")
    private String sourceAccountNumber;
    @NotBlank(message = "La cuenta destino no puede ser vacia")
    private String targetAccountNumber;
    @NotNull(message = "El monto no debe ser vacia")
    @DecimalMin(value = "0.01", message = "La cantidad debe ser mayor de cero")
    private BigDecimal amount;
    @NotBlank(message = "La descripcion no debe ser vacia")
    private String description;

}
