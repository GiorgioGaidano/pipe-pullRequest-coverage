package com.ggaidano.controller;

import com.ggaidano.pojo.HelloResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/controller")
public class HelloController2 {

	@GetMapping(value = "/hello2", produces = MediaType.APPLICATION_JSON_VALUE)
	public HelloResponse helloController(){
		HelloResponse response = new HelloResponse();
		response.setStatus("OK");
		response.setResponse("Hello");

		return response;
	}

	@GetMapping(value = "/hello3", produces = MediaType.APPLICATION_JSON_VALUE)
	public HelloResponse helloController3(){
		HelloResponse response = new HelloResponse();
		response.setStatus("OK");
		response.setResponse("Hello");

		return response;
	}

}
