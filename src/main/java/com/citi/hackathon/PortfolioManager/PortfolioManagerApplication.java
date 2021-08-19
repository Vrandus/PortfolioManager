package com.citi.hackathon.PortfolioManager;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@Import(SwaggerConfig.class)
public class PortfolioManagerApplication {

 	@Bean
 	public RestTemplate restTemplate(RestTemplateBuilder builder) {
 		return builder.build();
 	}


	public static void main(String[] args) {
		SpringApplication.run(PortfolioManagerApplication.class, args);
	}

}
