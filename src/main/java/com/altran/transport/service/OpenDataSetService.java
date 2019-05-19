package com.altran.transport.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import com.altran.transport.domain.rest.opendata.ResponseRest;
import com.altran.transport.repository.OpenDataSetRepository;

@Service
public class OpenDataSetService {
	
	private static final Logger log = LoggerFactory.getLogger(OpenDataSetService.class);
	
	
	@Value("${app.opendata.package_search}")
	private String urlOPenDataSearch;
	@Value("${app.opendata.default_rows}")
	private int default_rows;	
		
	public static final String QUERY = "q";
	public static final String ROWS = "rows";
	public static final String START = "start";
	
	
	@Autowired
	private OpenDataSetRepository repository;
	
	public ResponseRest getResponse(String query,Integer page, Integer rows) {		
		log.info("Request to datasets query = {}, page = {}, rows = {}",query,page,rows);
		String url = getUrl(query, page, rows);
		return repository.getResponse(url);
		
	}

	private String getUrl(String query,Integer page, Integer rows) {
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(urlOPenDataSearch);
		page = page == null ? 0 : page > 0 ? page -1 : page;
		rows = rows == null || rows == 0 ? default_rows : rows;
		if(query!= null) {
			builder.queryParam(QUERY, query);
		}
		builder.queryParam(ROWS, rows);
		builder.queryParam(START, page*rows);
		return builder.toUriString();
	}
}
