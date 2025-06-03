package com.vgb.paymentchain.payment.chain.service.impl;

import com.vgb.paymentchain.payment.chain.entities.Account;
import com.vgb.paymentchain.payment.chain.service.AccountService;

import java.util.List;

public class AccountServiceImpl implements AccountService {
    @Override
    public Account createAccount(Account account) {
        return null;
    }

    @Override
    public Account getAccountById(Long id) {
        return null;
    }

    @Override
    public List<Account> getAllAccounts() {
        return List.of();
    }

    @Override
    public Account updateAccount(Long id, Account account) {
        return null;
    }

    @Override
    public void deleteAccount(Long id) {

    }

    @Override
    public Account getBalanceByAccountId(Long id) {
        return null;
    }

    @Override
    public Account getAccountByAccountNumber(String accountNumber) {
        return null;
    }

    @Override
    public List<Account> getAccountsByUserId(Long id) {
        return List.of();
    }

    @Override
    public List<Account> getAccountsByUserIdAndAccountType(Long id, String accountType) {
        return List.of();
    }
}
