package com.xyy.bootwar.dao;

import org.springframework.data.repository.CrudRepository;

import com.xyy.bootwar.model.User;

public interface UserDao extends CrudRepository<User, Integer> {
	public User findByName(String name);

}
