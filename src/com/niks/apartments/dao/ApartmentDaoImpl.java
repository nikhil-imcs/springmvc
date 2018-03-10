package com.niks.apartments.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niks.apartments.pojo.Apartment;

@Repository
public class ApartmentDaoImpl implements ApartmentDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveApartment(Apartment apartment) {
		Session session=sessionFactory.getCurrentSession();
		System.out.println("Apartment being saved using saveApartment()-->"+apartment.toString());
		session.save(apartment);
		System.out.println("Apartment Saved");
		
	}

	@Override
	public List<Apartment> getApartments() {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Apartment";
		Query query=session.createQuery(hql);
		List<Apartment> apartments=query.getResultList();
		if(apartments.size()>0){
			return apartments;
		}
		else{
			return null;
		}
	}

	@Override
	public Apartment getApartmentById(int id) {
		Session session=sessionFactory.getCurrentSession();
		Apartment apartment=session.get(Apartment.class, id);
		if(apartment!=null){
			System.out.println("Apartment Retreived is--->"+apartment.toString());
			return apartment;
		}
		else{
			return null;
		}
	}

}
