package com.citi.hackathon.PortfolioManager.service;

import com.citi.hackathon.PortfolioManager.entities.Account;
import com.citi.hackathon.PortfolioManager.entities.Transaction;
import com.citi.hackathon.PortfolioManager.repos.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountRepository accountRepo;

    @Override
    public List<Account> getAllAccounts() {
        return accountRepo.findAll();
    }

    @Override
    public Account getAccountById(Integer id) {
        return accountRepo.findAccountById(id);
    }

    @Override
    public List<Account> getAccountsByType(String accountType) {
        return null;
    }

    @Override
    public Account addNewAccount(Account newAccount) {
        newAccount.setId(0);
        return accountRepo.save(newAccount);

    }

    @Override
    public void deleteAccount(Integer id) {

    }

    @Override
    public void updateExistingAccount(Account account) {

    }

    @Override
    public List<Transaction> getAllTransactionsByAccountId(Integer id) {
        return accountRepo.findAccountById(id).getTransactions();

    }
}
