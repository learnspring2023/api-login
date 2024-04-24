package com.example.login.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.login.api.model.LoginResponse;
import com.example.login.api.model.User;
import com.example.login.api.repository.LoginRegisterRepository;

@Service
public class LoginRegisterService {

	@Autowired
	LoginRegisterRepository loginRepository;
	
	public LoginResponse checkIdPassword(User user) {
		User dbUser = loginRepository.findByIdAndPassword(user.getId(),user.getPassword());
		LoginResponse response = new LoginResponse();
		if(dbUser!=null) {
			response.setMessage("Login Success");
		} else {
			response.setMessage("Login Failed");
		}
		return response;
	}

	public User register(User user) {
		return loginRepository.save(user);
	}

}
