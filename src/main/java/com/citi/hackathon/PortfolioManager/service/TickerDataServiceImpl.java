package com.citi.hackathon.PortfolioManager.service;

import com.citi.hackathon.PortfolioManager.controller.TransactionController;
import com.citi.hackathon.PortfolioManager.util.Quote;
import com.citi.hackathon.PortfolioManager.util.QuoteResponse;
import com.citi.hackathon.PortfolioManager.util.Result;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class TickerDataServiceImpl implements TickerDataService {

    private static Logger logger = LogManager.getLogger(TickerDataServiceImpl.class);

    @Autowired
    private RestTemplate restTemplate;

    private String tickersArraytoString(String[] tickers){
        StringBuilder sb = new StringBuilder();
        for (String s:tickers) {
            sb.append(s);
            sb.append(",");
        }
        sb.append("\b");
        return sb.toString();
    }

    private QuoteResponse getQuoteFromYahooFinanceService(String ticker){

        QuoteResponse quoteResponse = null;

        // request url
        String url = "https://apidojo-yahoo-finance-v1.p.rapidapi.com/market/v2/get-quotes?region=US&symbols={id}";

        // create an instance of RestTemplate
        RestTemplate restTemplate = new RestTemplate();

        // create headers
        HttpHeaders headers = new HttpHeaders();

        // set `Content-Type` and `Accept` headers
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        // example of custom header
        headers.set("x-rapidapi-host", "apidojo-yahoo-finance-v1.p.rapidapi.com");
        headers.set("x-rapidapi-key", "736271d17dmshd3603ce99be5b21p1c4aafjsnf2aca2046da3");

        // build the request
        HttpEntity request = new HttpEntity(headers);

        // make an HTTP GET request with headers
        ResponseEntity<Quote> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                request,
                Quote.class,
                ticker
        );

        try {
            // check response
            if (response.getStatusCode() == HttpStatus.OK) {

                logger.info("Request Successful.");
                logger.info("Response JSON:"+response.getBody());

                quoteResponse = response.getBody().getQuoteResponse();

            } else {
                logger.info("Request Failed");
                logger.info("Response CODE:"+response.getStatusCode());
            }

        } catch(Exception e){
            logger.error(e.getMessage());
        }
        return quoteResponse;
    }

    @Override
    public Result getResultByTicker(String ticker) {
        QuoteResponse quoteResponse = getQuoteFromYahooFinanceService(ticker);
        return quoteResponse.getResult().get(0);
    }

    public List<Result> getResultsByTickers(String[] tickers) {
        QuoteResponse quoteResponse = getQuoteFromYahooFinanceService(tickersArraytoString(tickers));
        return quoteResponse.getResult();
    }


}
