package com.skious.onlinestore.persistence.dao;

import java.util.List;

import com.skious.onlinestore.persistence.dto.UserDto;

public interface UserDao {
	
	boolean saveUser(UserDto user);
	
	List<UserDto> getUsers();

	UserDto getUserByEmail(String userEmail);

	UserDto getUserById(int id);

}
