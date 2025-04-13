package com.example.demo;


import java.util.Arrays;

import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class DemoApplication {
	
    //private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	
    public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
//    @Bean
/*	public RestTemplate restTemplate(RestTemplateBuilder builder) {
    	CloseableHttpClient httpClient = HttpClients.custom()
    	        .setConnectionManager(new PoolingHttpClientConnectionManager())
    	        .build();

    	    // Configura o RestTemplate com o HttpClient
    	    HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory(httpClient);
    	    return new RestTemplate(factory);
	} */
	
    
//	@Bean
//	@Profile("!test")
/*	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
	    return args -> {
	        // Captura a resposta como uma String para debug
	        String response = restTemplate.getForObject("https://dados.mobilidade.rio/gps/brt", String.class);
	        log.info("JSON recebido: {}", response);

	        // Desserializa corretamente para BusResponse
	        BusResponse busResponse = restTemplate.getForObject("https://dados.mobilidade.rio/gps/brt", BusResponse.class);

	        if (busResponse != null && busResponse.veiculos() != null) {
	            log.info("Ônibus recebidos: {}", busResponse.veiculos());
	        } else {
	            log.error("Resposta da API não contém a chave 'veiculos' ou está nula.");
	        }
	    };
	} */


}
