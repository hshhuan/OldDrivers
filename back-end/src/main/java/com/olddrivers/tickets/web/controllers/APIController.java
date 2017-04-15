package com.olddrivers.tickets.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.olddrivers.tickets.business.entities.User;
import com.olddrivers.tickets.business.entities.Movie;
import com.olddrivers.tickets.business.entities.service.MovieService;
import com.olddrivers.tickets.business.entities.service.UserService;
import com.olddrivers.tickets.util.LoginForm;
import com.olddrivers.tickets.util.Message;
import com.olddrivers.tickets.util.RegistForm;

@Controller
@RequestMapping("/api")
public class APIController {
	
	@Autowired
	private UserService userService;
	private MovieService movieService;
	
	@RequestMapping("/users/{id}")
	@ResponseBody
	User FindOne(@PathVariable("id") Long id) {
		return userService.findOne(id);
	}
	
	
	@RequestMapping("/users/login")
	@ResponseBody
	Message Login(@RequestBody LoginForm loginForm) {
		return userService.Login(loginForm);
	}
	
	@RequestMapping("/users/add")
	@ResponseBody
	Message Add(@RequestBody RegistForm registForm) {
		return userService.Add(new User(registForm));
	}

	@RequestMapping("/users/update")
	@ResponseBody
	Message Login(@RequestBody User user) {
		return userService.Update(user);
	}
	
	@RequestMapping("/movies")
	@ResponseBody
	List<Movie> FindAllMovies() {
		return movieService.findAll();
	}
}
