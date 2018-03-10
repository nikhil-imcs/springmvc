package com.niks.apartments.service;

import com.niks.apartments.pojo.User;

public interface LoginService {

	public void saveUser(User user);

	public boolean authenticateUser(String username, String password);

	public boolean checkForDuplicateUsername(String checkUsername);
	
	

}
