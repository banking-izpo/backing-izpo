package com.bankingIzpo.Banking.repository;

import com.bankingIzpo.Banking.model.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    @Query("SELECT t FROM Transaction t WHERE t.sourceAccount.accountNumber = :accountNumber OR t.targetAccount.accountNumber=:accountNumber")
    List<Transaction> findBySourceAccountOrTargetAccount(@Param("accountNumber") String accountNumber);
    @Query("SELECT t.transactionDate,COUNT(t) FROM Transaction t WHERE t.transactionDate BETWEEN :startDate AND :endDate AND (t.sourceAccount.accountNumber = :accountNumber) OR (t.targetAccount.accountNumber=:accountNumber) GROUP BY t.transactionDate")
    List<Object[]> getTransactionCountByDateRangeAndAccountNumber(String accountNumber,
                                                                     LocalDate startDate,
                                                                     LocalDate endDate);
}
