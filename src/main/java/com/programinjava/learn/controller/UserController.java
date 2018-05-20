package com.programinjava.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.programinjava.learn.model.User;
import com.programinjava.learn.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	@PostMapping("/userprocess")
	public String saveUser(@ModelAttribute User user ,ModelMap map) {
		
		userService.saveUser(user);	
		map.addAttribute("message", "Successfully Added User");
		return "index";
		
	}
	
	@GetMapping("/user")
	public String getIndex(ModelMap map) {
		map.addAttribute("user",new User());
		return "index";
	}
	
	

}
