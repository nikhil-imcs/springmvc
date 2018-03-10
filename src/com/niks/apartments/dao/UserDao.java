package com.niks.apartments.dao;

import com.niks.apartments.pojo.User;

public interface UserDao {

	public void saveUser(User user);

	public boolean authenticateUser(String username, String password);

	public boolean checkForDuplicateUsername(String checkUsername);

	public User getUserByUsername(String apartmentUser);

	public void updateUser(User user);

}
