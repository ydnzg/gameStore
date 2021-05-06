package Entities;



import java.util.Date;

import Abstract.Entity;

public class Customer implements Entity{
	
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String nationalityId;
	
	public Customer() {
		
	}
	//public Customer(String firstName, String lastName, java.util.Date date, String nationalityId) {
	//	
	//	this.firstName = firstName;
	//	this.lastName = lastName;
	//	this.dateOfBirth = (Date) date;
	//	this.nationalityId = nationalityId;
	//}


	


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(java.util.Date dateOfBirth) {
		this.dateOfBirth = (Date) dateOfBirth;
	}


	public String getNationalityId() {
		return nationalityId;
	}


	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	

}
