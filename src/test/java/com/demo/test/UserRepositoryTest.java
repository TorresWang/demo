package com.demo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.dao.UserRepository;
import com.demo.pojo.UserInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest()
public class UserRepositoryTest {
	@Autowired
	private UserRepository userRespository;
	@Test
	public void test() throws Exception{
		UserInfo user = new UserInfo();
		user.setId((long) 1);
		user.setName("王靖宇");
		user.setPassword("wangjingyu");
		userRespository.save(user);
	}
}
