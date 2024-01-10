package com.sbi.insurance.sbi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.health.yatra.insurance.yatra.model.Subscribe;
import com.sbi.insurance.sbi.service.SbiService;

@RestController
public class SbiController {

	    @Autowired
	    private SbiService sbiservice;
	    @GetMapping("/getsubid/{subscriberID}")
	    public ResponseEntity<Subscribe> getSubId(@PathVariable int subscriberID) {
	        ResponseEntity<Subscribe> responseEntity = sbiservice.getSubId(subscriberID);
	       return responseEntity;
	    }



}
