package com.niks.apartments.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niks.apartments.dao.UserDao;
import com.niks.apartments.pojo.User;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private UserDao userDao;

	@Override
	@Transactional
	public void saveUser(User user) {
		userDao.saveUser(user);
	}

	@Override
	@Transactional
	public boolean authenticateUser(String username, String password) {
		return userDao.authenticateUser(username,password);
	}

	@Override
	@Transactional
	public boolean checkForDuplicateUsername(String checkUsername) {
		return userDao.checkForDuplicateUsername(checkUsername);
	}

}
