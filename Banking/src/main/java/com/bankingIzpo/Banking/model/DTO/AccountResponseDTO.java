package com.bankingIzpo.Banking.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountResponseDTO {
    private Long id;
    private String accountNumber;
    private BigDecimal balance;
    private String ownnerName;
    private String ownnerEmail;
}
