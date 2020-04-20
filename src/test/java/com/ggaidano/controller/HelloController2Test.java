package com.ggaidano.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.ggaidano.pojo.HelloResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloController2Test {

	@Autowired
	TestRestTemplate testRestTemplate;

	@Test
	public void testResponse2OK(){
		HelloResponse response = testRestTemplate.getForObject("/controller/hello2", HelloResponse.class);
		assertEquals(response, buildOKResponse());
	}

	@Test
	public void testResponse3OK(){
		HelloResponse response = testRestTemplate.getForObject("/controller/hello3", HelloResponse.class);
		assertEquals(response, buildOKResponse());
	}

	private HelloResponse buildOKResponse() {
		HelloResponse response = new HelloResponse();
		response.setStatus("OK");
		response.setResponse("Hello");
		return response;
	}

}