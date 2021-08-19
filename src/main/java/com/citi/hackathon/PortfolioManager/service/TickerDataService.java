package com.citi.hackathon.PortfolioManager.service;

import com.citi.hackathon.PortfolioManager.util.Result;

import java.util.List;

public interface TickerDataService {

    Result getResultByTicker(String ticker);
    List<Result> getResultsByTickers(String[] ticker);
}
