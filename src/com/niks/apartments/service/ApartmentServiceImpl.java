package com.niks.apartments.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niks.apartments.dao.ApartmentDao;
import com.niks.apartments.pojo.Apartment;

@Service
public class ApartmentServiceImpl implements ApartmentService {
	
	@Autowired
	private ApartmentDao apartmentDao;

	@Override
	@Transactional
	public void saveApartment(Apartment apartment) {
		apartmentDao.saveApartment(apartment);
		
	}

	@Override
	@Transactional
	public List<Apartment> getApartments() {
		return apartmentDao.getApartments();
	}

	@Override
	@Transactional
	public Apartment getApartmentById(int id) {
		return apartmentDao.getApartmentById(id);
	}

}
