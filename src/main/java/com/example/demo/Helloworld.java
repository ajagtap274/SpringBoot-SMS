package com.example.demo;

import java.lang.annotation.Target;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:3000")
@RestController
public class Helloworld {

	@GetMapping("/hel")
	public String hello()
	{
		return "Hello World";
	}
}
//Annotations: 
//In spring boot we use annotation for configurations, there are different annotations
//@RestController- this annotation specifies the class as controller.A controller can map different methods to ceratin urls.
//There are different types of mapping.
//@GetMapping - GetMapping annotation is used to map the get requests.
//@PostMapping - PostMapping annotation is used to map the post request.
//@PutMapping - PutMapping annotation is used to map the put request.
//@DeleteMapping - DeleteMapping annotation is used to map the delete request.
//
//HTTP requests:
//      HTTP - (Hypertext Transfer Protocol) 
//      This is the protocol used to communicate between frontend/browser/user/ux and backend(server). Frontend and backend can
//      communicate through different HTTP methods.
//      HTTP Methods:
//    	  1. get method: when the frontend want to get something
//    	  2. post method: when frontend/users/browser wants to post something
//    	  3. put method: when frontend/users/browser wants to put something
//    	  4. delete method: when frontend/users/browser wants to delete something
//    	  (This methods are named by the perspective of front end)
//    	  These are CRUD operations, C-Create: post method
//    	   							 R-Read: get method
//    	   							 U-Update:put method
//    	   							 D-Delete:delete method
//      
//
//    	   							 
//    	   							 
//  Spring boot contains four things:
//	  Model class: This is represented as a table in the database
//	  Repository/Repo/JPA(Connection with database): This is an interface which implements JPARepository. It is for the connection with the database
//	  It provides some built-in methods for processing database, e.g findById(ID), findAll(), save()
//	  Service class: This is like an intermediary between JPA and Controller
//	  Controller(It helps to map different request using annotations)
//	  
//    	   							 
//    	   							 
    	   							 

//base url of spring boot application localhost:8080
//localhost-We are hosting this in our local machine, thats why our server is localhost
//8080- port address of the backend/spring boot process
//4200- port address of the frontend(angular)
//3306- port address of the mysql server
//port address- process id(by which we can identify processes uniquely)