package com.atlas.bank.atlas_bank.transaction.exception;

import java.math.BigDecimal;

public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(Long accountId, BigDecimal balance, BigDecimal amount) {
        super("Fondos insuficientes en la cuenta con ID: " + accountId + ". Saldo actual: " + balance + ", monto solicitado: " + amount);
    }
}
