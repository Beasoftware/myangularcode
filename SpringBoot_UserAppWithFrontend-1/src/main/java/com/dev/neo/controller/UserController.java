package com.dev.neo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.neo.exception.ResourceNotFoundException;
import com.dev.neo.model.User;
import com.dev.neo.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/")
public class UserController {
	@Autowired
	private UserRepository userRepository;

	// get all users
	@GetMapping("/getalluser")
	public List<User> getUser(){
		return this.userRepository.findAll();
		
	}
	@PostMapping("/addusers")
	public User addUser(@RequestBody User user) {
		return userRepository.save(user);
	}
	@GetMapping("/users/{id}")
	public ResponseEntity<User> getEmployeeById(@PathVariable Long id) {
		User User = userRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("User not exist with id :" + id));
		return ResponseEntity.ok(User);
	}
}// end class
