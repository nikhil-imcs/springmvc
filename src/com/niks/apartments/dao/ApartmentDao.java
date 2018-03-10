package com.niks.apartments.dao;

import java.util.List;

import com.niks.apartments.pojo.Apartment;

public interface ApartmentDao {

	public void saveApartment(Apartment apartment);

	public List<Apartment> getApartments();

	public Apartment getApartmentById(int id);

}
