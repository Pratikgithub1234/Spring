package com.example.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Student;
import com.example.services.StudentManager;

@RestController
public class StudentController 
{
	@Autowired
	private StudentManager manager;
	
	@GetMapping("api/students/{cname}")
	public List<Student> getStudents(@PathVariable String cname)
	{
		return manager.getStudents(cname);
	}
	
	@GetMapping("api/getStudent/{id}")
	public Optional<Student> getStudentbyid(@PathVariable int id) {
		// TODO Auto-generated method stub
		return manager.getStudentbyid(id);
	}
	@PostMapping("api/addstudent")
	public void addStudent(@RequestBody Student student)
	{
		manager.addStudent(student);
		
	}
}
