package com.xyy.bootwar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xyy.bootwar.dao.UserDao;
import com.xyy.bootwar.model.User;

@Controller
public class SampleController {
	@Autowired
	private UserDao userDao;
	 @RequestMapping("/test")
	    @ResponseBody
	    User home() {
	        return userDao.findByName("b");
	    }

	    public static void main(String[] args) throws Exception {
	        SpringApplication.run(SampleController.class, args);
	    }
}
