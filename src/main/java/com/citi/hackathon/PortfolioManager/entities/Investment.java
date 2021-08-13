package com.citi.hackathon.PortfolioManager.entities;


import javax.persistence.*;

@Entity
@Table(name = "investments")

public class Investment {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name= "ticker")
    private String ticker;

    @Column(name = "investment_type")
    private String investmentType;

    @Column(name = "account_id")
    private Integer accountId;

    @Column(name = "units")
    private Double units;

    @Column(name = "open_value")
    private Double openValue;

    @Column(name = "close_value")
    private Double closeValue;

    public Investment() {
    }

    public Investment(String ticker, String investmentType, Integer accountId, Double units, Double openValue, Double closeValue) {
        this.ticker = ticker;
        this.investmentType = investmentType;
        this.accountId = accountId;
        this.units = units;
        this.openValue = openValue;
        this.closeValue = closeValue;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getInvestmentType() {
        return investmentType;
    }

    public void setInvestmentType(String investmentType) {
        this.investmentType = investmentType;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Double getUnits() {
        return units;
    }

    public void setUnits(Double units) {
        this.units = units;
    }

    public Double getOpenValue() {
        return openValue;
    }

    public void setOpenValue(Double openValue) {
        this.openValue = openValue;
    }

    public Double getCloseValue() {
        return closeValue;
    }

    public void setCloseValue(Double closeValue) {
        this.closeValue = closeValue;
    }
}
