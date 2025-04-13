package com.example.demo;
 import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
 
 @JsonIgnoreProperties(ignoreUnknown = true)
 public record Bus(
		 @JsonProperty("codigo") String Codigo,
		    @JsonProperty("placa") String Placa,
		    @JsonProperty("linha") String Linha,
		    @JsonProperty("latitude") double Latitude,
		    @JsonProperty("longitude") double Longitude,
		    @JsonProperty("dataHora") long DataHora,
		    @JsonProperty("velocidade") int Velocidade,
		    @JsonProperty("id_migracao_trajeto") int IdMigracaoTrajeto,
		    @JsonProperty("sentido") String Sentido,
		    @JsonProperty("trajeto") String Trajeto,
		    @JsonProperty("hodometro") int Hodometro,
		    @JsonProperty("direcao") int Direcao,
		    @JsonProperty("ignicao") int Ignicao
		 ) {}