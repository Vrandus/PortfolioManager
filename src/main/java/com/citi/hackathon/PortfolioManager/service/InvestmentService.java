package com.citi.hackathon.PortfolioManager.service;

import com.citi.hackathon.PortfolioManager.entities.Investment;

import java.util.List;

public interface InvestmentService {
    List<Investment> getAllInvestments();

    List<Investment> getInvestmentsByTicker();

    void addInvestment(Investment transaction);

    void updateInvestment(Investment transaction);

}
