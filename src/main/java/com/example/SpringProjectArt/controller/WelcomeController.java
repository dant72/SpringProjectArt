package com.example.SpringProjectArt.controller;

import com.example.SpringProjectArt.model.Product;
import com.example.SpringProjectArt.model.User;
import com.example.SpringProjectArt.service.ProductService;
import com.example.SpringProjectArt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


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
		return "Welcome to spring boot app!";
	}

	@PostMapping("/register")
	public String register(HttpServletRequest request) {

		try {
			User user = new User();
			user.setFirstName(request.getParameter("firstName"));
			user.setLastName(request.getParameter("lastName"));
			user.setEmail(request.getParameter("email"));
			user.setUsername(request.getParameter("username"));
			user.setPassword(request.getParameter("password"));

			userService.register(user);

			return "Register successful!";
		}
		catch (Exception ex)
		{
			return ex.getMessage();
		}
	}


	@GetMapping("/users")
	public List<User> Users()
	{
		return userService.getAll();
	}
}