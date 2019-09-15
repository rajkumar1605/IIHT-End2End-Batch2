package com.example.Employee.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User {

	private int id;
	private String country;
	private String name;
	private int salary;
	
	public User(){
		id=0;
	}
	public User(int id, String name, String country,int salary){
		this.id = id;
		this.name = name;
		this.country = country;
		this.salary=salary;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String toString()
	{
		return"name:"+name;
	}

}
