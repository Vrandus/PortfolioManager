package com.citi.hackathon.PortfolioManager.service;

import com.citi.hackathon.PortfolioManager.entities.Investment;
import com.citi.hackathon.PortfolioManager.repos.InvestmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InvestmentServiceImpl implements InvestmentService{

    @Autowired
    private InvestmentRepository investmentRepo;
    @Override
    public List<Investment> getAllInvestments() {
        return investmentRepo.findAll();
    }

    @Override
    public List<Investment> getInvestmentsByTicker() {
        return null;
    }

    @Override
    public void addInvestment(Investment transaction) {

    }

    @Override
    public void updateInvestment(Investment transaction) {

    }
}
