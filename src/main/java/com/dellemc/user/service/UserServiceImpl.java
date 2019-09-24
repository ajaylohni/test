package com.dellemc.user.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.dellemc.user.exception.ResourceNotFoundException;
import com.dellemc.user.model.User;
import com.dellemc.user.repository.UserRepository;
 import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand; 


@Service
public class UserServiceImpl implements UserService {
	

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	
	@HystrixCommand(fallbackMethod = "reliable")
	
	public User getUserByid(Long userId) throws ResourceNotFoundException {
		return userRepository
        .findById(userId)
        .orElseThrow(() -> new ResourceNotFoundException("User not found on :: " + userId));
	}
	
	public User createUser(User user) {
		 return userRepository.save(user);
	}
	
	public void deleteUser(User user) {
		 userRepository.delete(user);
	}

	
	public String reliable() {
		return "Cloud Native Java (O'Reilly)";
	}
	

}
