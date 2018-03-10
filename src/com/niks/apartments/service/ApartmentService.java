package com.niks.apartments.service;

import java.util.List;

import com.niks.apartments.pojo.Apartment;

public interface ApartmentService {

	public void saveApartment(Apartment apartment);

	public List<Apartment> getApartments();

	public Apartment getApartmentById(int id);

}
