package com.citi.hackathon.PortfolioManager.controller;


import com.citi.hackathon.PortfolioManager.entities.Account;
import com.citi.hackathon.PortfolioManager.service.AccountService;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/account")
@CrossOrigin // allows requests from all domains
public class AccountController {
    private static Logger logger = LogManager.getLogger(AccountController.class);


    @Autowired
    private AccountService accountService;

    @ApiOperation(value = "findAll", nickname = "findAll")
    @GetMapping
    public List<Account> getAccounts(){
        logger.info("Request for all accounts");
        return accountService.getAllAccounts();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Account getAccountById(@PathVariable("id") int id){
        logger.info("Request for account id: " + id);
        return accountService.getAccountById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addAccount(@RequestBody Account account){
        accountService.addNewAccount(account);
    }
}
