package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teacher")
public class Teacher {
    
	
	@Id
	public String username;
	public String password;
	public String name;
	public Teacher()
	{
		
	}
	
	public Teacher(String username, String password, String name) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Teacher [username=" + username + ", password=" + password + ", name=" + name + "]";
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
