package com.citi.hackathon.PortfolioManager.service;

import com.citi.hackathon.PortfolioManager.entities.Transaction;
import com.citi.hackathon.PortfolioManager.repos.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository transactionRepo;

    @Autowired
    private TickerDataService tickerDataService;

    @Override
    public List<Transaction> getAllTransactions() {
        return transactionRepo.findAll();
    }

    @Override
    public List<Transaction> getTransactionsByTicker() {
        return null;
    }

    @Override
    public Transaction addTransaction(Transaction transaction) {
        transaction.setId(0);
        Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
        transaction.setTransactionTime(currentTimestamp);

        Double price = tickerDataService.getResultByTicker(transaction.getTicker()).getRegularMarketPrice();
        transaction.setUnitPrice(price);

        return transactionRepo.save(transaction);
    }


}
