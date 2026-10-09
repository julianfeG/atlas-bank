package com.atlas.bank.atlas_bank.account.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreateAccountRequest {
    @NotBlank(message = "El número de cuenta es obligatorio")
    private String accountNumber;

    @NotBlank(message = "El nombre del titular es obligatorio")
    private String ownerName;

    @NotBlank(message = "El correo electrónico es obligatorio")
    @Email(message = "El correo electrónico no es válido")
    private String email;

    @NotBlank(message = "El tipo de cuenta es obligatorio")
    private String type;

    @PositiveOrZero(message = "El saldo inicial no puede ser negativo")
    private BigDecimal balance;
}
