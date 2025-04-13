package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManager;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BusService{
	
    private final RestTemplate restTemplate; 
	
	public BusService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	public BusResponse fetchBusData() {
        String apiUrl = "https://dados.mobilidade.rio/gps/brt";
		return restTemplate.getForObject(apiUrl, BusResponse.class);
	}
	
	public List<Bus> getBusesByLine(String linha) {
        BusResponse response = fetchBusData();
        return response.veiculos().stream()
                .filter(bus -> bus.Linha().equals(linha))
                .collect(Collectors.toList());
    }
	
}