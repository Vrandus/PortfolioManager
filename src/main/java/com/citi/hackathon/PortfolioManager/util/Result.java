package com.citi.hackathon.PortfolioManager.util;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {

    private Double regularMarketPrice;
    private Double regularMarketChangePercent;
    private String symbol;
    private String regularMarketTime;

    public Double getRegularMarketChangePercent() {
        return regularMarketChangePercent;
    }

    public void setRegularMarketChangePercent(Double regularMarketChangePercent) {
        this.regularMarketChangePercent = regularMarketChangePercent;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getRegularMarketTime() {
        return regularMarketTime;
    }

    public void setRegularMarketTime(String regularMarketTime) {
        this.regularMarketTime = regularMarketTime;
    }

    public Double getRegularMarketPrice() {
        return regularMarketPrice;
    }

    public void setRegularMarketPrice(Double regularMarketPrice) {
        this.regularMarketPrice = regularMarketPrice;
    }
}
