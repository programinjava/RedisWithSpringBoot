package com.programinjava.learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programinjava.learn.model.User;
//import com.programinjava.learn.repository.UserRespositoryImpl;
import com.programinjava.learn.repository.UserRespository;

@Service
public class UserService {
	
	
	@Autowired
	UserRespository userRespository;
	
	public void saveUser(User user) {
		userRespository.save(user);
	}
	
	
	

}
