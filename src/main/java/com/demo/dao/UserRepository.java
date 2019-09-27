package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.pojo.UserInfo;


public interface UserRepository extends JpaRepository<UserInfo, Long>{
	UserInfo findByName(String name);
}
