package com.example.demo;

import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManager;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class HTTPConfig{
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
    	CloseableHttpClient httpClient = HttpClients.custom()
    	        .setConnectionManager(new PoolingHttpClientConnectionManager())
    	        .build();

    	    // Configura o RestTemplate com o HttpClient
    	    HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory(httpClient);
    	    return builder.requestFactory(()->factory).build();
	}
	
}