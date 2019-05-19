package com.altran.transport.domain.rest.opendata;

public enum EnumTranslated {

	CA("ca"),
	EN("en"),
	ES("es");
	
	private String language;
	
	
	private EnumTranslated(String language) {
		this.language = language;
	}


	public String getLanguage() {
		return language;
	}
	
	
	
	
	
}
