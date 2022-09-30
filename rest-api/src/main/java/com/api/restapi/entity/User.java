package com.api.restapi.entity;
   

public class User {

	private Long id;
	private String name;
	private Integer age;
	private String Gender;
	
	public User() {
		super();
	}

	public User(Long id, String name, Integer age, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		Gender = gender;
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
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	@Override
	public String toString() {
		
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", Gender=" + Gender + "]";
	}
	
	
}
