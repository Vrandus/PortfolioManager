package com.citi.hackathon.PortfolioManager.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity @Table(name="accounts")
public class Account implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "account_type")
    private String accountType;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "description")
    private String description;

    @Column(name = "cash_value")
    private Double cashValue;

    public Account() {}

    public Account(String accountType, String bankName, String description, Double cashValue) {
        this.accountType = accountType;
        this.bankName = bankName;
        this.description = description;
        this.cashValue = cashValue;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getCashValue() {
        return cashValue;
    }

    public void setCashValue(Double cashValue) {
        this.cashValue = cashValue;
    }
}
