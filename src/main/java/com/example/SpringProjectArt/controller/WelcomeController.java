package com.example.SpringProjectArt.controller;

import com.example.SpringProjectArt.dto.UserDto;
import com.example.SpringProjectArt.model.User;
import com.example.SpringProjectArt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;

@RestController
public class WelcomeController
{
	private final UserService userService;


	@Autowired
	public WelcomeController(UserService userService)
	{
		this.userService = userService;
	}

	@GetMapping("/welcome")
	public String Welcome()
	{
		User user = new User();
		user.setFirstName("Tom");
		user.setLastName("Tomson");
		user.setEmail("email434");
		user.setUsername("User2222");
		user.setPassword("test");

		userService.register(user);

		return "Welcome to spring boot app";
	}

	@PostMapping("/register")
	public void register(@RequestBody UserDto userDto)
	{
		User user = new User();
		user.setFirstName(userDto.getFirstName());
		user.setLastName(userDto.getLastName());
		user.setEmail(userDto.getEmail());
		user.setUsername(userDto.getUsername());
		user.setPassword(userDto.getPassword());

		userService.register(user);
	}

}