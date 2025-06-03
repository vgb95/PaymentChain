package com.vgb.paymentchain.payment.chain.entities;

import com.vgb.paymentchain.payment.chain.enums.DocumentType;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

    Long id;
    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    String password;
    DocumentType documentType;
    String documentNumber;
    LocalDate dateOfBirth;
    Boolean isActive;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
}
