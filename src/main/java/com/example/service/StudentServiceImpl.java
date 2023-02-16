package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentRepo repo;

	@Override
	public Student saveAnStudent(Student stud) {
		Student save=repo.save(stud);
		return save;
	}

	@Override
	public List<Student> getAllStudent() {
    List<Student> getAllStud=repo.findAll();
		
		return  getAllStud;
	}

	@Override
	public Student getById(int studId) {
		Student getStudById=repo.findById(studId).get();
		return getStudById;
	}

	@Override
	public void deleteAnStudent(Integer studId) {
		 repo.deleteById(studId);
		
	}

	

	

}
