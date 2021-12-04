package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:4200")
@RestController
public class teacherController {
	
	@Autowired    //creates object of jpa interface
	teacherJPA tjpa;
	
	@GetMapping("/{username}")	//we are fetching the username from the path using the path variable annotation
	public Optional<Teacher> findUser(@PathVariable String username)
	{
		Optional<Teacher> t=tjpa.findById(username);
		return t;
	}
	
	
	@GetMapping("/{username}/{password}")
	@ResponseBody
	public int valTeacher(@PathVariable String username, @PathVariable String password)
	{
		Teacher t= tjpa.getById(username);
		if(password.equals(t.getPassword()))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	@GetMapping("/heythere")
	public String hey()
	{
		System.out.println("Hey");
		return "Hello";
	}

}
