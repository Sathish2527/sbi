package com.sbi.insurance.sbi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.health.yatra.insurance.yatra.model.Subscribe;
@Service
public class SbiService {
	@Autowired
	private RestTemplate restTemplate;

	public ResponseEntity<Subscribe> getSubId(int subscriberID) {
	  
	        ResponseEntity<Subscribe> subscribe = restTemplate.exchange("http://YATRA/getsubId/" + subscriberID, HttpMethod.GET, null, Subscribe.class);
	        return subscribe;
	    
	}

	



}
