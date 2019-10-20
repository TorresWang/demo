package com.demo.controller;

import org.springframework.cache.annotation.Cacheable;
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
	@Cacheable(value="user-key")
	public UserInfo getUser() {
		UserInfo user = new UserInfo();
		user.setName("wangjy");
		user.setPassword("ftorres9");
		System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
		return user;
	}
}
