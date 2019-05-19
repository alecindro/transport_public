package com.altran.transport.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.altran.transport.adapter.DataSetMapper;
import com.altran.transport.domain.rest.opendata.ResponseRest;
import com.altran.transport.dto.DataSetDTO;
import com.altran.transport.service.OpenDataSetService;

import io.micrometer.core.annotation.Timed;

@RestController
@RequestMapping("/api")
public class OpenDataController {
	
	private static final Logger log = LoggerFactory.getLogger(OpenDataController.class);

	@Autowired
	private OpenDataSetService service;
	@Autowired
	private DataSetMapper dataSetMapper;
	
	@GetMapping(value="/datasets/v1")
    @Timed(value="app.listdataset")
    public List<DataSetDTO> getOrganizations(@RequestParam(required = false,name = "query") String query,
    		@RequestParam(required = false, name="language", defaultValue="ca") String language,
    		@RequestParam(required = false ,name = "page") Integer page, 
    		@RequestParam(required = false, name = "rows") Integer rows){
		log.info("Request to datasets query = {}, language = {}, page = {}, rows = {}",query,language,page,rows);
		ResponseRest response = service.getResponse(query, page, rows);
		return dataSetMapper.responseToDTO(response, language);
	}
	
}
