package com.bankingIzpo.Banking.mapper;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import com.bankingIzpo.Banking.model.entity.Transaction;
import com.bankingIzpo.Banking.model.dto.TransactionRequestDTO;
import com.bankingIzpo.Banking.model.dto.TransactionResponseDTO;
import com.bankingIzpo.Banking.model.dto.TransactionReportDTO;

import java.time.LocalDate;
import java.util.*;

@Component
@AllArgsConstructor

public class TransactionMapper {
    private final ModelMapper modelMapper;

    public Transaction convertToTransaction(TransactionRequestDTO  transactionRequestDTO) {
        return modelMapper.map(transactionRequestDTO, Transaction.class);
    }
    public TransactionResponseDTO convertToResponseDTO(Transaction transaction){
        return modelMapper.map(transaction, TransactionResponseDTO.class);
    }

    public List<TransactionResponseDTO> convertToResponseDTO(List<Transaction> transactions){
        return transactions.stream()
                .map(this::convertToResponseDTO)
                .toList();
    }
    public TransactionReportDTO convertToReportDTO(Object[] transactionData){
        TransactionReportDTO reportDTO = new TransactionReportDTO();
        reportDTO.setTransactionDate((LocalDate) transactionData[0]);
        reportDTO.setTransactionCount((Long) transactionData[1]);
        return reportDTO;
    }
}
