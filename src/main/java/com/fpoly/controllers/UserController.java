package com.fpoly.controllers;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fpoly.models.UserApplication;
import com.fpoly.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	public void add(UserApplication user) {
		userService.save(user);
	}
	
//	@GetMapping("/")
//	public List<UserApplication> selectAll() {
//		List<UserApplication> users = (List<UserApplication>) userService.findAll();
//		return users;
//	}
	@GetMapping("/")
	public String select() {
		return "Graduation Project";
	}
}
