package com.citi.hackathon.PortfolioManager.controller;

import com.citi.hackathon.PortfolioManager.entities.Account;
import com.citi.hackathon.PortfolioManager.entities.Transaction;
import com.citi.hackathon.PortfolioManager.service.TransactionService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transaction")
@CrossOrigin // allows requests from all domains
public class TransactionController {
    private static Logger logger = LogManager.getLogger(TransactionController.class);

    @Autowired
    private TransactionService transactionService;


    @GetMapping
    public List<Transaction> getTransactions(){
        logger.info("Request for all accounts");
        return transactionService.getAllTransactions();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addTransaction(@RequestBody Transaction transaction){
        transactionService.addTransaction(transaction);
    }
}
