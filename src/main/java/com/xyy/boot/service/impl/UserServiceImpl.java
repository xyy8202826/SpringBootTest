package com.xyy.boot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xyy.boot.dao.UserDao;
import com.xyy.boot.model.User;
import com.xyy.boot.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	@Override
	public User getUserByName(String userName) {
		return userDao.findByName(userName);
	}

}
