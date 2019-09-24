package com.dellemc.user.service;

import java.util.List;

import javax.validation.Valid;

import com.dellemc.user.exception.ResourceNotFoundException;
import com.dellemc.user.model.User;

public interface UserService {


	User getUserByid(Long userId) throws ResourceNotFoundException;

	User createUser(@Valid User user);

	void deleteUser(User user);

	List<User> findAll();

}