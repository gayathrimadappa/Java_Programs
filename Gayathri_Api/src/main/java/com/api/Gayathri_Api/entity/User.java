package com.api.Gayathri_Api.entity;

import javax.persistence.*;

@Entity 
public class User {
	
	
	private Long id;
	
	@Column(name = "user_name")  
	private String name;
	private Integer age;
	private String gender;
	private String city;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long id, String name, Integer age, String gender, String city) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.city = city;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", city=" + city + "]";
	}

}
	

