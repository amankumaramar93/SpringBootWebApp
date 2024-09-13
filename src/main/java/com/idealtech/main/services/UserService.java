package com.idealtech.main.services;

import com.idealtech.main.entities.User;

public interface UserService 
{
	public boolean registerUser(User user);
	public User loginUser(String email, String password);

}
