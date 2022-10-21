package com.in28minutes.rest.webservices.restfullwebservices.helloworld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HelloWorldBean {
	
	private String message;
	private List<String> lista = new ArrayList<>();
	
	public HelloWorldBean(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
	public List<String> getLista() {
		return lista;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
//	@Override
//	public String toString() {
//		return "HelloWorldBean [message = " + message + "]";
//	}

}
