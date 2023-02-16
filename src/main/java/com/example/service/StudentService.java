package com.example.service;

import java.util.List;

import com.example.entity.Student;

public interface StudentService {

	Student saveAnStudent(Student stud);

	List<Student> getAllStudent();

	Student getById(int studId);

	void deleteAnStudent(Integer studId);

	

	
	
}
