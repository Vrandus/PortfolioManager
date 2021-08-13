package com.citi.hackathon.PortfolioManager.service;

import com.citi.hackathon.PortfolioManager.entities.Account;
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
        return null;
    }

    @Override
    public List<Account> getAccountsByType(String accountType) {
        return null;
    }

    @Override
    public void addNewAccount(Account newAccount) {

    }

    @Override
    public void deleteAccount(Integer id) {

    }

    @Override
    public void updateExistingAccount(Account account) {

    }
}
