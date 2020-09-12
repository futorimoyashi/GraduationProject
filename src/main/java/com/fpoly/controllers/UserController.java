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
}