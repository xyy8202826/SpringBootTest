package com.xyy.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xyy.boot.dao.UserDao;
import com.xyy.boot.model.User;

@RestController
public class SampleController {
	@Autowired
	private UserDao userDao;
	 @RequestMapping("/test")
	    @ResponseBody
	    User home() {
	        return userDao.findByName("b");
	    }
}
