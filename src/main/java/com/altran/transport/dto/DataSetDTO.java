package com.altran.transport.dto;

public class DataSetDTO {
	
	public String code;
	public String organization;
	public String url;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "DataSetDTO [code=" + code + ", organization=" + organization + ", url=" + url + "]";
	}
	
	

}
