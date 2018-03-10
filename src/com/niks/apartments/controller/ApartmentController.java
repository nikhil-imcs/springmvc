package com.niks.apartments.controller;

import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.niks.apartments.dao.UserDao;
import com.niks.apartments.pojo.Apartment;
import com.niks.apartments.pojo.User;
import com.niks.apartments.service.ApartmentService;
import com.niks.apartments.service.UserService;

@Controller
@SessionAttributes("username")
public class ApartmentController {
	@Autowired
	private UserService userService;
	@Autowired
	private ApartmentService apartmentService;
	
	@GetMapping("/newapartment")
	public String getNewApartmentPage(Model model,HttpSession session){
		
		Apartment apartment=new Apartment();
		model.addAttribute("apartment", apartment);
		return "newapartment";
	}
	
	@PostMapping("/newapartment")
	public String processNewApartment(@ModelAttribute("apartment") Apartment apartment,HttpSession session){
		System.out.println("Apartment in process from processNewApartment()-->"+apartment.toString());
		String apartmentUser=(String)session.getAttribute("username");
		System.out.println("Apartment user is-->"+apartmentUser);
		User user=userService.getUserByUsername(apartmentUser);
		user.addApartment(apartment);
		userService.updateUser(user);
		return "redirect:/";
	}
	
	@GetMapping("/apartments/{id}")
	public String showApartmentDetails(@PathVariable("id") int id,Model model){
		int apartmentId=id;
		System.out.println("Showing details for Apartment with Id-->"+apartmentId);
		Apartment apartment= apartmentService.getApartmentById(id);
		model.addAttribute("apartment", apartment);
		
		return "apartment-details";
	}

}
