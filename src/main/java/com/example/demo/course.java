package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "coursedetails")
public class course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String email;
	private String password;
	private String fname;
	private String lname;
	private String usertype;
	private String topic;
	private int price;

	
	
	
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getFname() {
		return fname;
	}




	public void setFname(String fname) {
		this.fname = fname;
	}




	public String getLname() {
		return lname;
	}




	public void setLname(String lname) {
		this.lname = lname;
	}




	public String getUsertype() {
		return usertype;
	}




	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}




	public String getTopic() {
		return topic;
	}




	public void setTopic(String topic) {
		this.topic = topic;
	}




	public int getPrice() {
		return price;
	}




	public void setPrice(int price) {
		this.price = price;
	}




	public course(int id, String email, String password, String fname, String lname, String usertype, String topic,
			int price) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.fname = fname;
		this.lname = lname;
		this.usertype = usertype;
		this.topic = topic;
		this.price = price;
	}

	public course()
	{
		
	}
}
