package com.onpassive.webconsumer;
import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
//public class RestClient {
	
//	private static final String GET_ALL = "http://localhost:7080/emp/findAll";
////	private static final String GET_BY_ID = "localhost:8092/get/{id}";
//	private static final String ADD_DATA = "localhost:8092/add";
//
//	static RestTemplate restTemplate = new RestTemplate();
//
//	public static void main(String[] args) {
//	getAllData();
//	}
//
//	public static void getAllData() {
//
//	HttpHeaders headers = new HttpHeaders();
//	headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//
//	HttpEntity<String> http = new HttpEntity<String>("parameters", headers);
//	ResponseEntity<String> result = restTemplate.exchange(GET_ALL, HttpMethod.GET, http, String.class);
//
//	System.out.println(result);
//
//	}
//
//	}
