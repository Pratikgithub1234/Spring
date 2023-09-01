package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Student;
import com.example.repositories.StudentRepository;
@Service
public class StudentManagerImpl implements StudentManager 
{
	@Autowired
	private StudentRepository repository;
	@Override
	public List<Student> getStudents(String cname) {
		
		return repository.getStudents(cname);
	}
	@Override
	public Optional<Student> getStudentbyid(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}
	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		repository.save(student);
	}
	
	

}
