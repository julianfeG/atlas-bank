package com.atlas.bank.atlas_bank.transaction.exception;

public class AccountNotActiveException extends RuntimeException {
    public AccountNotActiveException(Long accountId, String status) {
        super("La cuenta con ID: " + accountId + " no está activa. Estado actual: " + status);
    }
}
