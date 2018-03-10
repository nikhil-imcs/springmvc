package com.niks.apartments.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.niks.apartments.pojo.Apartment;
import com.niks.apartments.service.ApartmentService;

@Controller
@SessionAttributes("username")
public class HomeController {
	@Autowired
	private ApartmentService apartmentService;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String getHomePage(Model model){
		List<Apartment> apartments=apartmentService.getApartments();
		System.out.println("List of all apartments is-->"+apartments);
		model.addAttribute("apartments", apartments);
		
		return "home";
	}

}
