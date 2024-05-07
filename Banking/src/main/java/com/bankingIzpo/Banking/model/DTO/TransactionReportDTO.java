package com.bankingIzpo.Banking.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor

public class TransactionReportDTO {
    private LocalDate transactionDate;
    private long transactionCount;
}
