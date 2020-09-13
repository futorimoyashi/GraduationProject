package com.fpoly.controllers;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import java.util.List;
import org.springframework.web.bind.annotation.*;

import com.fpoly.models.UserApplication;
import com.fpoly.services.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

	private UserService userService;
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public UserController(UserService userService, BCryptPasswordEncoder bCryptPasswordEncoder) {
		this.userService = userService;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}

	@GetMapping
	public List<UserApplication> getUsers(){
		return (List<UserApplication>) userService.findAll();
	}

	@PostMapping("/signup")
	public void signUp(@RequestBody UserApplication userApplication){
		userApplication.setPassword(bCryptPasswordEncoder.encode(userApplication.getPassword()));
		userService.save(userApplication);
	}
	
	@GetMapping("/select")
	public List<UserApplication> selectAll() {
		List<UserApplication> users = (List<UserApplication>) userService.findAll();
		return users;
	}
}
