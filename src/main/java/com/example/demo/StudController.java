package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin("http://localhost:4200")
@RestController
public class StudController {
	
	@Autowired //necessary for object injection (dependency injection for loose coupling)
	StudService ser;
	
	@GetMapping("/getStud/{id}")
	public Optional<Student> getStudent(@PathVariable("id")Long id)//this is standard format to add pathVariable
	{
		return ser.getStud(id);
	}
	
	@GetMapping("/heyt")
	public String hey()
	{
		return "Hello";
	}
	
	@GetMapping("/getAllStuds")
	public List<Student> getEmployees()
	{
		
		return ser.getStudents(); //findAll() is a builtin method in repository...also there are other builtin methods
	}
	
	@PostMapping("/student")//to test postmapping we need to use postman
	public Student saveStud(Student stud)
	{
		ser.saveStud(stud);
		return stud;
	}
	
	@PostMapping("/postStud")
	public void getSt(@RequestBody Student std)
	{
		double tempPerc = (std.getMaths()+std.getEng()+std.getSci())/3;
		
		boolean tempFail=false;
		if(std.getEng()<35 || std.getMaths()<35 || std.getSci()<35)
		{
			tempFail=true;
		}
		Student newStud = new Student(std.getRollNo(), std.getFname(), std.getLname(), std.getMaths(), std.getSci(),
				std.getEng(), tempPerc, tempFail);
		
		System.out.println("Hello");
		
		ser.saveStud(newStud);
		
		
//		System.out.println(std);
	}
	
	
}







// insert into student values ('Abhi','Jagtap',98,87,67,65.4,True,12);
