package com.altran.transport.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.altran.transport.TransportApplication;
import com.altran.transport.domain.rest.opendata.ResponseRest;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = TransportApplication.class)
public class OpenDataSetServiceTests {

	@Autowired
	private OpenDataSetService service;
	@Value("${app.opendata.default_rows}")
	private int default_rows;
	
	private static final String CRAZY_QUERY="EIQOW2438247398ADAS";
	
	@Test
	public void testDefault() {
		ResponseRest rr = service.getResponse(null,0,0);
		Assert.assertEquals(default_rows,rr.getResult().getResults().size());
	}
	
	@Test
	public void testNone() {
		ResponseRest rr = service.getResponse(CRAZY_QUERY,0,0);
		Assert.assertEquals(0,rr.getResult().getResults().size());
	}
	
	@Test
	public void test20Rows() {
		ResponseRest rr = service.getResponse(null,0,20);
		Assert.assertEquals(20,rr.getResult().getResults().size());
	}
}
