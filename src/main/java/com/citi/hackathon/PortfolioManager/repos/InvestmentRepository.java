package com.citi.hackathon.PortfolioManager.repos;

import com.citi.hackathon.PortfolioManager.entities.Investment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestmentRepository extends JpaRepository<Investment, Integer> {

    // public List<Investments> findByAccount(Integer id);
}
