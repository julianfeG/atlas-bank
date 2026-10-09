package com.atlas.bank.atlas_bank.transaction.dto;

import com.atlas.bank.atlas_bank.transaction.validation.DifferentAccounts;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.math.BigDecimal;

@Data
@DifferentAccounts
public class TransferRequest {
    @NotNull(message = "El ID de la cuenta de origen es obligatorio")
    private Long sourceAccountId;

    @NotNull(message = "El ID de la cuenta de destino es obligatorio")
    private Long targetAccountId;

    @NotNull(message = "El monto de la transferencia es obligatorio")
    @Positive(message = "El monto de la transferencia debe ser mayor a cero")
    private BigDecimal amount;

}
