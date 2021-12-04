package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





@Service
public class StudService {

	@Autowired
	StudJPA repo;
	
	public List<Student> getStudents()
	{
		
		return repo.findAll(); 
	}
	


	public Optional<Student> getStud(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}
	
	public Student saveStud(Student stud)
	{
		repo.save(stud);
		return stud;
	}
	
	
}
