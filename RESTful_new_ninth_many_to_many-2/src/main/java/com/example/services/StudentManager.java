package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.entities.Student;

public interface StudentManager 
{
	List<Student> getStudents(String cname);
	Optional<Student> getStudentbyid(int id);
public void addStudent(Student student);
}
