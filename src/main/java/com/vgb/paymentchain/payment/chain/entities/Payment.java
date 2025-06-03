package com.vgb.paymentchain.payment.chain.entities;

import com.vgb.paymentchain.payment.chain.enums.PaymentType;
import com.vgb.paymentchain.payment.chain.enums.TransactionStatus;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Payment {
    Long id;
    Long fromAccountId;
    Long toAccountId;
    BigDecimal amount;
    String currency;
    PaymentType paymenType;
    TransactionStatus status;
}
