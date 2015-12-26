package com.xyy.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xyy.boot.model.User;
import com.xyy.boot.service.UserService;

@RestController
public class SampleController {
	@Autowired
	private UserService userService;

	@RequestMapping("/test")
	@ResponseBody
	User home() {
		return userService.getUserByName("b");
	}
}
