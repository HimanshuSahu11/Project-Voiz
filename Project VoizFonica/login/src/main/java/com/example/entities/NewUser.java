package com.example.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="user")
public class NewUser {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
	@Column(nullable = false,length=45)
private String firstname;

private String lastname;
private Date dob;
@Column(nullable = false,unique=true,length=45)
private String email;
@Column(nullable = false,length=15)
private String password;
@Column(nullable = false,length=10)
private int phoneno;

public NewUser(int id, String firstname, String lastname, Date dob, String email, String password, int phoneno) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.dob = dob;
	this.email = email;
	this.password = password;
	this.phoneno = phoneno;
}
public NewUser() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
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
public int getPhoneno() {
	return phoneno;
}
public void setPhoneno(int phoneno) {
	this.phoneno = phoneno;
}

}
