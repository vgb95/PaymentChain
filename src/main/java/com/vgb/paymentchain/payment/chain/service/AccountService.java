package com.vgb.paymentchain.payment.chain.service;

import com.vgb.paymentchain.payment.chain.entities.Account;

import java.util.List;

public interface AccountService {


    Account createAccount(Account account);
    Account getAccountById(Long id);
    List<Account> getAllAccounts();
    Account updateAccount(Long id, Account account);
    void deleteAccount(Long id);
    Account getBalanceByAccountId(Long id);
    Account getAccountByAccountNumber(String accountNumber);
    List<Account> getAccountsByUserId(Long id);
    List<Account> getAccountsByUserIdAndAccountType(Long id, String accountType);


}
