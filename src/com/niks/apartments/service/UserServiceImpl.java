package com.niks.apartments.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niks.apartments.dao.UserDao;
import com.niks.apartments.pojo.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	@Transactional
	public User getUserByUsername(String apartmentUser) {
		return userDao.getUserByUsername(apartmentUser);
	}

	@Override
	@Transactional
	public void updateUser(User user) {
		userDao.updateUser(user);
		
	}

}
