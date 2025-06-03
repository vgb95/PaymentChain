package com.vgb.paymentchain.payment.chain.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Account {
    Long id;
    Long userId;
    String AccountType;
    BigDecimal balance;
    String currency;
    String accountNumber;
    BigDecimal dailyLimit;
    BigDecimal monthlyLimit;
    Boolean isActive;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
}
