package com.altran.transport.configuration;

import org.apache.http.impl.client.HttpClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class OpendataRestConfig {

	
	@Bean(name="restTemplateOpenData")
	public RestTemplate restTemplateOpenData() {
		ClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory(HttpClients.createDefault());
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		return restTemplate;
	}
}
