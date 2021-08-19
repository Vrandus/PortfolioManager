package com.citi.hackathon.PortfolioManager.util;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    private QuoteResponse quoteResponse;

    public QuoteResponse getQuoteResponse() {
        return quoteResponse;
    }

    public void setQuoteResponse(QuoteResponse quoteResponse) {
        this.quoteResponse = quoteResponse;
    }
}
