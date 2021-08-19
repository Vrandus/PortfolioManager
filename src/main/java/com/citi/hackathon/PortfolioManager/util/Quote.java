package com.citi.hackathon.PortfolioManager.util;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    private Double regularMarketPrice;

    public Double getRegularMarketPrice() {
        return regularMarketPrice;
    }

    public void setRegularMarketPrice(Double regularMarketPrice) {
        this.regularMarketPrice = regularMarketPrice;
    }
}
