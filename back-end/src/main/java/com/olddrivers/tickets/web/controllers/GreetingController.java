package com.olddrivers.tickets.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.olddrivers.tickets.business.entities.User;
import com.olddrivers.tickets.business.entities.service.UserService;
import com.olddrivers.tickets.util.Message;
import com.olddrivers.tickets.util.RegistForm;

@Controller
public class GreetingController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/test")
	@ResponseBody
	Message Add(String name) {
		return userService.Add(new User(new RegistForm("asd","abc@163.com","123456")));
		
	}
	
	@RequestMapping("/{id}")
	@ResponseBody
	User findOne(@PathVariable("id") Long id) {
		return userService.findOne(id);
	}
	
}
