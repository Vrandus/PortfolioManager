package com.citi.hackathon.PortfolioManager.service;

import com.citi.hackathon.PortfolioManager.entities.Transaction;

import java.util.List;

public interface TransactionService {
    List<Transaction> getAllTransactions();

    List<Transaction> getTransactionsByTicker();

    Transaction addTransaction(Transaction transaction);


}
