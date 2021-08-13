package com.citi.hackathon.PortfolioManager.service;


import com.citi.hackathon.PortfolioManager.entities.Account;

import java.util.List;

public interface AccountService {
    List<Account> getAllAccounts();

    Account getAccountById(Integer id);

    // accountType be either "Cash" or "Investment"
    List<Account> getAccountsByType(String accountType);

    void addNewAccount(Account newAccount);

    void deleteAccount(Integer id);

    void updateExistingAccount(Account account);
}
