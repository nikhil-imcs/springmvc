package com.niks.apartments.service;

import com.niks.apartments.pojo.User;

public interface UserService {

	public User getUserByUsername(String apartmentUser);

	public void updateUser(User user);

}
