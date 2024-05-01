package com.bankingIzpo.Banking.model.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "accounts")

public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "account_number", unique = true, nullable = false)
    private String accountNumber;
    @Column(name = "balance", nullable = false)
    private BigDecimal balance;
    @Column(name = "owwner_name", nullable = false)
    private String ownnerName;
    @Column(name = "ownner_email", nullable = false)
    private String ownnerEmail;
    @Column(name="create_at")
    private LocalDate createAt;
    @Column(name="update_at")
    private LocalDate updateAt;
}
