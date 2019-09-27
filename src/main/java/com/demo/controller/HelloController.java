package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.pojo.UserInfo;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String hello() {
		return "Hello World";
	}
	
	@RequestMapping("/getUser")
	public UserInfo getUser() {
		UserInfo user = new UserInfo();
		user.setName("wangjy");
		user.setPassword("ftorres9");
		return user;
	}
}
