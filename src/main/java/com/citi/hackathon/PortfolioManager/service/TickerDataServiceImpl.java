package com.citi.hackathon.PortfolioManager.service;

import com.citi.hackathon.PortfolioManager.util.Quote;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@Service
public class TickerDataServiceImpl implements TickerDataService {

    @Autowired
    private RestTemplate restTemplate;


    @Override
    public Double getPriceByTicker(String ticker) {


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
        ResponseEntity<String> response1 = restTemplate.exchange(
                url,
                HttpMethod.GET,
                request,
                String.class,
                ticker
        );

        try {

            // check response
            if (response1.getStatusCode() == HttpStatus.OK) {

                System.out.println("Request Successful.");
                System.out.println(response1.getBody());

                String json = response1.getBody();



                ObjectMapper objectMapper = new ObjectMapper();

                System.out.println("DEBUG 1=====");

                JsonNode jsonNode = objectMapper.readTree(json);

                System.out.println("DEBUG 2=====");

                System.out.println(jsonNode.get("quoteResponse").asText());



            } else {
                System.out.println("Request Failed");
                System.out.println(response1.getStatusCode());
            }

        } catch(Exception e){
            System.out.println(e.getMessage());
        }

        return null;
    }
}
