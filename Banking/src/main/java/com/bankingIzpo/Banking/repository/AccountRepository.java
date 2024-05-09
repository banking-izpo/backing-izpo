package com.bankingIzpo.Banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bankingIzpo.Banking.model.Entity.Account;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Optional<Account> findByAccountNumber(String accountNumber);

}
