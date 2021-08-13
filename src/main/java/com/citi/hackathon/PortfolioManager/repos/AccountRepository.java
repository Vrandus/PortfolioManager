package com.citi.hackathon.PortfolioManager.repos;


import com.citi.hackathon.PortfolioManager.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

    public List<Account> findAccountByAccountType(String accountType);

    public Account findAccountById(Integer id);
}
