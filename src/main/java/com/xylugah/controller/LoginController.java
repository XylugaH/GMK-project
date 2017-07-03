package com.xylugah.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xylugah.entity.User;

@RestController
public class LoginController {

	private static final Logger logger = Logger.getLogger(LoginController.class);

	private String port = 8090;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public User home(@RequestParam(value = "name", defaultValue = "World") String name) {
		logger.info("Welcome home! The client locale is {}.");

		return new User("XylugaH", 1, "123");
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public User home(@RequestParam(value = "name", defaultValue = "World") String name) {
		logger.info("Welcome home! The client locale is {}.");

		return new User("XylugaH", 1, "123");
	}
}
