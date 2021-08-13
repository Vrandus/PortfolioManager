package com.citi.hackathon.PortfolioManager.repos;

import com.citi.hackathon.PortfolioManager.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

    // public List<Investments> findByAccount(Integer id);
}
