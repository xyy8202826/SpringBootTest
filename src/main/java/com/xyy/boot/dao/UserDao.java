package com.xyy.boot.dao;

import org.springframework.data.repository.CrudRepository;
import com.xyy.boot.model.User;

public interface UserDao extends CrudRepository<User, Integer> {
	public User findByName(String name);

}
