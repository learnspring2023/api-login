package com.example.login.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.login.api.model.User;

@Repository
public interface LoginRegisterRepository extends CrudRepository<User, Integer> {
	User findByIdAndPassword(int userId, String password);
	//save
	//findAll
	//findById
}
// select * from user_info
//where id = :userId
// and password = :password;
