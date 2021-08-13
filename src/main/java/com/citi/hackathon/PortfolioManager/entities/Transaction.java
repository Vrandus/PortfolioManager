package com.citi.hackathon.PortfolioManager.entities;


import javax.persistence.*;
import java.sql.Timestamp;
@Entity
@Table(name = "transactions")

public class Transaction {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name= "ticker")
    private String ticker;

    @Column(name = "asset_type")
    private String assetType;

    @Column(name = "account_id")
    private Integer accountId;

    @Column(name = "units")
    private Double units;

    @Column(name = "unit_price")
    private Double unitPrice;

    @Column(name = "transaction_time")
    private Timestamp transactionTime;

    @Column(name = "transaction_type")
    private String transactionType;
    // Should be BUY, SELL, or TRANSFER


    public Transaction() {

    }

    public Transaction(String ticker, String assetType, Integer accountId, Double units, Double unitPrice, Timestamp transactionTime, String transactionType) {
        this.ticker = ticker;
        this.assetType = assetType;
        this.accountId = accountId;
        this.units = units;
        this.unitPrice = unitPrice;
        this.transactionTime = transactionTime;
        this.transactionType = transactionType;
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

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
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

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Timestamp getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(Timestamp transactionTime) {
        this.transactionTime = transactionTime;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
}
