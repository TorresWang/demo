package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.pojo.User;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String hello() {
		return "Hello World";
	}
	
	@RequestMapping("/getUser")
	public User getUser() {
		User user = new User();
		user.setName("wangjy");
		user.setPassword("ftorres9");
		return user;
	}
}
