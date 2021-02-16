package com.example.springdemo.service;

import com.example.springdemo.entity.User;
import com.example.springdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> getUser() {
		List<User> userList = new ArrayList<>();
		userRepository.findAll()
				.forEach(userList::add);

		return userList;
	}

	public User addUser(User user){
		return userRepository.save(user);
	}

	public User updateUser(User update){
		return userRepository.save(update);
	}

	public void deleteUser(long userId){
		userRepository.deleteById(userId);
	}
}
