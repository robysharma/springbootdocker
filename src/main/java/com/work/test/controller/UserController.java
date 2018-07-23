package com.work.test.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.work.test.model.User;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@GetMapping
	public List<User> getUsers() {
		return getUsersData();
	}

	private List<User> getUsersData() {
		List<User> users = Arrays.asList(new User(1L,"john", "dallas"), new User(2L,"mark", "newyork"),
				new User(3L,"paul", "chandigarh"));
		return users;
	}
}
