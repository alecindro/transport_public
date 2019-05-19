package com.altran.transport.web;

import java.util.HashMap;
import java.util.Map;

public class RequestParam {

	private Map<String, Object> params = new HashMap<>();

	public RequestParam addParams(String param, Object value) {
		params.put(param, value);
		return this;
	}

	public String getParams() {
		StringBuilder result = new StringBuilder();
		int size = params.size();
		if (size > 0) {
			String param = (String) params.keySet().toArray()[0];
			Object value = params.values().toArray()[0];
			result.append("?").append(param).append("=").append(value);
		}
		for (int i = 1; i < size; i++) {
			String param = (String) params.keySet().toArray()[i];
			Object value = params.values().toArray()[i];
			result.append("&").append(param).append("=").append(value);
		}

		return result.toString();
	}

}
