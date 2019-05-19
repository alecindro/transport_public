package com.altran.transport.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.altran.transport.domain.rest.opendata.ResponseRest;

@Service
public class OpenDataSetRepository {
	
	private static final Logger log = LoggerFactory.getLogger(OpenDataSetRepository.class);
	
	
	@Autowired
	@Qualifier("restTemplateOpenData")
	private RestTemplate restTemplate;
	
	
	@Cacheable(value="opendata_search_cache")
	public ResponseRest getResponse(String url) {
		log.info("Request to opendata  url = {}", url);
		return restTemplate.getForObject(url, ResponseRest.class);
	}
	

}
