package com.example.login.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.login.api.model.LoginResponse;
import com.example.login.api.model.User;
import com.example.login.api.service.LoginRegisterService;

@RestController
@CrossOrigin
public class LoginRegisterController {

	@Autowired
	LoginRegisterService loginService;
	
	@PostMapping("login")
	public LoginResponse login(@RequestBody User user) {
		System.out.println(user);
		LoginResponse response = loginService.checkIdPassword(user);
		System.out.println(response);
		return response;
	}
	
	@PostMapping("register")
	public User register(@RequestBody User user) {
		System.out.println(user);
		User dbUser = loginService.register(user);
		System.out.println(dbUser);
		return dbUser;
	}
}
