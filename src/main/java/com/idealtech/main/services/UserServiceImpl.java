package com.idealtech.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idealtech.main.entities.User;
import com.idealtech.main.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	private UserRepository userRepository;

	@Override
	public boolean registerUser(User user) 
	{
		try
		{
			userRepository.save(user);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public User loginUser(String email, String password) 
	{
		User validUser = userRepository.findByEmail(email);
		
		if(validUser != null && validUser.getPassword().equals(password))
		{
			return validUser;
		}
		else
		{
			return null;
		}
		
		
	}

}
