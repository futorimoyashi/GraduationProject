package com.fpoly.controllers;

import org.springframework.web.bind.annotation.*;

import com.fpoly.models.UserApplication;
import com.fpoly.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	private UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping("/add")
	public void add(@RequestBody UserApplication user) {
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
