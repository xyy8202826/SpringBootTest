package com.xyy.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xyy.boot.dao.UserDao;
import com.xyy.boot.model.User;

@Controller
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages={"com.xyy.boot.dao"})
@EntityScan(basePackages="com.xyy.boot.model")
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
