package com.apachecamel.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@RequestMapping(method=RequestMethod.GET, value="/fbLogin", produces=MediaType.APPLICATION_JSON_VALUE)
	public String facebookAuthentication(){
		return "{Status:SuccessFB}";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/linkedInLogin", produces=MediaType.APPLICATION_JSON_VALUE)
	public String linkedInAuthentication(){
		return "{Status:SuccessLinkedIn}";
	}
	
}
