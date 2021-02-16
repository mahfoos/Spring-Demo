package com.example.springdemo.controller;

import com.example.springdemo.entity.User;
import com.example.springdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("/user")
	public Iterable<User> getUser() {
		return userService.getUser();
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}

	@RequestMapping(value = "/updateUser", method = RequestMethod.PUT)
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}


	@RequestMapping(value = "/deleteUser/{userId}", method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable long userId) {
		userService.deleteUser(userId);
	}


}
