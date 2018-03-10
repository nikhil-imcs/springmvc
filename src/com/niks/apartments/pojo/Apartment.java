package com.niks.apartments.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="apartment")
public class Apartment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="title")
	private String title;
	@Column(name="description")
	private String description;
	@Column(name="address")
	private String address;
	@Column(name="imagepath")
	private String imagepath;
	@Column(name="rent")
	private String rent;
//	@Column(name="user_id")
//	private int userid;
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getImagepath() {
		return imagepath;
	}
	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}
	public String getRent() {
		return rent;
	}
	public void setRent(String rent) {
		this.rent = rent;
	}
	@Override
	public String toString() {
		return String.format("Apartment [id=%s, title=%s, description=%s, address=%s, imagepath=%s, rent=%s]", id,
				title, description, address, imagepath, rent);
	}
	
	
	
//	public int getUserid() {
//		return userid;
//	}
//
//	public void setUserid(int userid) {
//		this.userid = userid;
//	}
//	@Override
//	public String toString() {
//		return String.format(
//				"Apartment [id=%s, title=%s, description=%s, address=%s, imagepath=%s, rent=%s, userid=%s]", id, title,
//				description, address, imagepath, rent, userid);
//	}
	

	
	
	
	

}
