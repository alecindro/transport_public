package com.altran.transport.web;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.altran.transport.TransportApplication;
import com.altran.transport.dto.DataSetDTO;
import com.altran.transport.service.OpenDataSetService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TransportApplication.class)
@AutoConfigureMockMvc
public class OpenDataControllerTest extends TestController{
	
	private static final String url = "/api/datasets/v1";
	
	//@Test
	public void test() throws Exception {
		RequestParam params = new RequestParam();
		params.addParams(OpenDataSetService.ROWS, 20);
		params.addParams(OpenDataSetService.START, 1);
		
		List<DataSetDTO> responses = get(url,params, DataSetDTO.class);
		Assert.assertEquals(20,responses.size());
	}
	
	//@Test
	public void testWithQuery() throws Exception {
		RequestParam params = new RequestParam();
		params.addParams("rows", 20);
		params.addParams("page", 1);
		params.addParams("query", "norte");
		
		List<DataSetDTO> responses = get(url,params, DataSetDTO.class);
		Assert.assertEquals(1,responses.size());
	}
	
	@Test
	public void testWithQueryAndLanguage() throws Exception {
		RequestParam params = new RequestParam();
		params.addParams("rows", 20);
		params.addParams("page", 1);
		params.addParams("query", "norte");
		params.addParams("language", "en");
		
		List<DataSetDTO> responses = get(url,params, DataSetDTO.class);
		Assert.assertEquals(1,responses.size());
		System.out.println(responses.get(0).getOrganization());
		System.out.println(responses.get(0).getUrl());
		Assert.assertEquals("Transport",responses.get(0).getOrganization());
		Assert.assertEquals("https://www.barcelonanord.cat/en/home/",responses.get(0).getUrl());
		
	}
		
	
	
}
