package com.altran.transport.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

	

public abstract class TestController {
	
	@Autowired
	private MockMvc mvc;

	@Autowired
	private ObjectMapper mapper;

	private ResultActions invokeAll(String BASE_URL) throws Exception {

		return mvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get(BASE_URL).accept(MediaType.APPLICATION_JSON));
	}

	private ResultActions invokeSearch(String BASE_URL,String param, Object value) throws Exception {
		return mvc
				.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get(BASE_URL + "?" + param + "=" + value).accept(MediaType.APPLICATION_JSON));
	}
	
	private ResultActions invokeSearch(String BASE_URL,RequestParam params) throws Exception {
		return mvc
				.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get(BASE_URL + params.getParams()).accept(MediaType.APPLICATION_JSON));
	}
	

	private ResultActions invokeGet(String BASE_URL,Object id) throws Exception {
		return mvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get(BASE_URL + "/" + id).accept(MediaType.APPLICATION_JSON));
	}
	
	private ResultActions invokeGet(String BASE_URL) throws Exception {
		return mvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get(BASE_URL).accept(MediaType.APPLICATION_JSON));
	}

	private ResultActions invokeGet(String BASE_URL,PathVariable path) throws Exception {
		return mvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get(BASE_URL + path.getPath()).accept(MediaType.APPLICATION_JSON));
	}
	
	private ResultActions invokeCreate(String BASE_URL,Object object) throws Exception {
		byte[] json = toJson(object);
		return mvc.perform(
				org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post(BASE_URL)
						.content(json).contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON));
	}

	private ResultActions invokeUpdate(String BASE_URL,Object object) throws Exception {
		byte[] json = toJson(object);
		return mvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put(BASE_URL).content(json).contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON));
	}

	private ResultActions invokeDelete(String BASE_URL,Object id) throws Exception {
		return mvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders
				.delete(BASE_URL + "/" + id));
	}
	
	private ResultActions invokeDelete(String BASE_URL,PathVariable path) throws Exception {
		return mvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders
				.delete(BASE_URL + path.getPath()));
	}



	protected <T> List<T> getAll(String BASE_URL, Class<T> tClass) throws Exception {
		CollectionType javaType = mapper.getTypeFactory().constructCollectionType(List.class, tClass);
		String content = getContent(invokeAll(BASE_URL).andReturn());
		if(content.isEmpty()) {
			return new ArrayList<T>();
		}
		List<T> result = this.mapper.readValue(content, javaType);
		return result;
	}
	
	protected <T> T get(String BASE_URL, Class<T> tClass) throws Exception {
		ResultActions ra = invokeGet(BASE_URL);
		MvcResult result = ra.andReturn();
		String content = getContent(result);
		if(content.isEmpty()) {
			return tClass.newInstance();
		}
		return (T) fromJsonResult(invokeGet(BASE_URL).andReturn(), tClass);
	}

	protected <T> T deleteLogic(String BASE_URL, Object id, Class<T> tClass) throws Exception {
		return (T) fromJsonResult(invokeDelete(BASE_URL,id).andReturn(), tClass);
	}

	protected <T> void delete(String BASE_URL,Object id) throws Exception {
		invokeDelete(BASE_URL,id);
	}
	
	protected <T> void delete(String BASE_URL,PathVariable path) throws Exception {
		invokeDelete(BASE_URL,path);
	}

	@SuppressWarnings("unchecked")
	protected <T> T post(String BASE_URL,T object) throws Exception {
		return (T) fromJsonResult(invokeCreate(BASE_URL,object).andReturn(), object.getClass());
	}
	
	protected <T> void postVoid(String BASE_URL,T object) throws Exception {
		invokeCreate(BASE_URL,object).andReturn();
	}
	
	protected <T> T post(String BASE_URL, Object object,Class<T> tClass) throws Exception {
		return (T) fromJsonResult(invokeCreate(BASE_URL,object).andReturn(), tClass);
	}

	@SuppressWarnings("unchecked")
	protected <T> T put(String BASE_URL,T object) throws Exception {
		return (T) fromJsonResult(invokeUpdate(BASE_URL,object).andReturn(), object.getClass());
	}
	
	protected <T> T put(String BASE_URL,T object, Class<T> tClass) throws Exception {
		return (T) fromJsonResult(invokeUpdate(BASE_URL,object).andReturn(), tClass);
	}

	protected <T> T getById(String BASE_URL, Object id, Class<T> tClass) throws Exception {
		return (T) fromJsonResult(invokeGet(BASE_URL,id).andReturn(), tClass);
	}

	protected <T> T getOne(String BASE_URL, String param, Object value, Class<T> tClass) throws Exception {
		return (T) fromJsonResult(invokeSearch(BASE_URL,param, value).andReturn(), tClass);
	}

	protected <T> List<T> get(String BASE_URL, String param, Object value, Class<T> tClass) throws Exception {
		CollectionType javaType = mapper.getTypeFactory().constructCollectionType(List.class, tClass);
		String content = getContent(invokeSearch(BASE_URL,param, value).andReturn());
		if(content.isEmpty()) {
			return new ArrayList<T>();
		}
		List<T> result = this.mapper
				.readValue(content, javaType);
		return result;
	}
	
	protected <T> T getOne(String BASE_URL, PathVariable path, Class<T> tClass) throws Exception {
		return (T) fromJsonResult(invokeGet(BASE_URL,path).andReturn(), tClass);
	}

	protected <T> List<T> get(String BASE_URL, PathVariable path, Class<T> tClass) throws Exception {
		CollectionType javaType = mapper.getTypeFactory().constructCollectionType(List.class, tClass);
		List<T> result = this.mapper
				.readValue(invokeGet(BASE_URL,path).andReturn().getResponse().getContentAsString(), javaType);
		return result;
	}
	
	protected <T> T getOne(String BASE_URL, RequestParam params, Class<T> tClass) throws Exception {
		return (T) fromJsonResult(invokeSearch(BASE_URL,params).andReturn(), tClass);
	}

	protected <T> List<T> get(String BASE_URL, RequestParam params, Class<T> tClass) throws Exception {
		CollectionType javaType = mapper.getTypeFactory().constructCollectionType(List.class, tClass);
		String content = getContent(invokeSearch(BASE_URL,params).andReturn());
		if(content.isEmpty()) {
			return new ArrayList<T>();
		}
		List<T> result = this.mapper
				.readValue(content, javaType);
		return result;
	}
	
	protected void getVoid(String BASE_URL, RequestParam params) throws Exception {
		invokeSearch(BASE_URL,params).andReturn();
		
	}
	
	
	
	<T> T fromJsonResult(MvcResult result, Class<T> tClass) throws Exception {
		String content = getContent(result);
		if(content.isEmpty()) {
			return tClass.newInstance();
		}
		if(tClass.equals(String.class)) {
			return (T) content;
		}
		return this.mapper.readValue(content, tClass);
	}

	protected byte[] toJson(Object object) throws Exception {
		if(object instanceof String) {
			return ((String)object).getBytes();
		}
		return this.mapper.writeValueAsString(object).getBytes();
	}
	
	private String  getContent(MvcResult result) throws Exception {
		if(result.getResponse().getStatus()== 404) {
			throw new Exception("url não encontrada");
		}
		if(result.getResponse().getStatus()>299) {
			throw new Exception(result.getResponse().getContentAsString());
		}
		return result.getResponse().getContentAsString();
	}


}
