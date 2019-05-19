package com.altran.transport.web;

public class PathVariable {
	
	private StringBuilder pathBuilder;
	
	public PathVariable addPath(Object path) {
		if(pathBuilder == null) {
			pathBuilder = new StringBuilder();
		}
		pathBuilder.append("/").append(path);
		return this;
	}
	
	public String getPath() {
		return pathBuilder.toString();
	}

}
