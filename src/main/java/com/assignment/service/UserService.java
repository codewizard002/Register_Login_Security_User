package com.assignment.service;

import com.assignment.entity.User;

public interface UserService {

	public User saveUser(User user);

	public void removeSessionMessage();
	//public User getUserById(int id);

}
