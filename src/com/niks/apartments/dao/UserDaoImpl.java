package com.niks.apartments.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niks.apartments.pojo.User;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveUser(User user) {
		
		Session session=sessionFactory.getCurrentSession();
		System.out.println("Saving user from UserDao.saveUser()-->"+user.toString());
		session.save(user);
		System.out.println("User saved");
		
		
	}

	@Override
	public boolean authenticateUser(String username, String password) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from User as u where u.username=? and u.password=?";
		Query query=session.createQuery(hql);
		query.setParameter(0, username);
		query.setParameter(1, password);
		
		@SuppressWarnings("unchecked")
		List<User> list=query.getResultList();
		System.out.println("User found using authenticateUser()-->"+ list);
		if(list!=null && list.size()>0){
			return true;
		}
		else{
			return false;
		}
		
	/*	User user = (User) query.getSingleResult();
		if(user!=null){
			return true;
		}
		else{
			return false;
		}*/
	}

	@Override
	public boolean checkForDuplicateUsername(String checkUsername) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from User as u where u.username=?";
		Query query=session.createQuery(hql);
		query.setParameter(0, checkUsername);
		List<User> list=query.getResultList();
		
		if(list!=null && list.size()>0){
			System.out.println("Duplicate User found using checkForDuplicateUsername()-->"+ list);
			return true;
		}
		else{
			return false;
		}
		
	}

	@Override
	public User getUserByUsername(String apartmentUser) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from User as u where u.username=?";
		Query query=session.createQuery(hql);
		query.setParameter(0, apartmentUser);
		List<User> list=query.getResultList();
		
		if(list!=null && list.size()>0){
			User user=list.get(0);
			System.out.println("Apartment User found using getUserByUsername()-->"+user);
			return user;
		}
		else{
			return null;
		}
	}

	@Override
	public void updateUser(User user) {
		Session session=sessionFactory.getCurrentSession();
		System.out.println("Updating user from UserDao.updateUser()-->"+user.toString());
		session.update(user);
		System.out.println("User updated");
		
	}

}
