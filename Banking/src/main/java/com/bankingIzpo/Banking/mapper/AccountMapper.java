package com.bankingIzpo.Banking.mapper;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import com.bankingIzpo.Banking.model.Entity.Account;
import com.bankingIzpo.Banking.model.dto.AccountRequestDTO;
import com.bankingIzpo.Banking.model.dto.AccountResponseDTO;

import java.util.*;

@Component
@AllArgsConstructor

public class AccountMapper {
    private final ModelMapper modelMapper;

    public Account convertToEntity(AccountRequestDTO accountRequestDTO) {
        return modelMapper.map(accountRequestDTO, Account.class);
    }
    public AccountResponseDTO convertToDTO(Account account) {
        return modelMapper.map(account, AccountResponseDTO.class);
    }
    public List<AccountResponseDTO> convertToDTO(List<Account> accounts) {
        return accounts.stream()
                .map(this::convertToDTO)
                .toList();
    }
}
