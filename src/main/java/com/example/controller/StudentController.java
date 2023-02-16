package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService studentServiceRepo;
	
	@GetMapping("/fetch")
	public String getAll(){
		return "hello";
	}
	@PostMapping("/save")
	public  ResponseEntity<Student> saveStud(@RequestBody Student stud){
		Student saveAnstudent = studentServiceRepo.saveAnStudent(stud);
		return new ResponseEntity<Student>(saveAnstudent,HttpStatus.CREATED);
		
	}
	@GetMapping("/fetch-All")
	public ResponseEntity<List<Student>> getAllStudents(){
	List<Student> getAlltudent = studentServiceRepo.getAllStudent();
	return new ResponseEntity<List<Student>>(getAlltudent,HttpStatus.OK);
		
	}
	@GetMapping("/getById")
	public ResponseEntity<Student> getStudById(@RequestParam Integer studId){
		Student getId = studentServiceRepo.getById(studId);
		return new ResponseEntity<Student>(getId,HttpStatus.OK);
	}
	@PutMapping("/update")
	public ResponseEntity<Student> updateAStudent(@RequestBody Student stud){
		Student updAnstudent = studentServiceRepo.saveAnStudent(stud);
		return new ResponseEntity<Student>(updAnstudent,HttpStatus.CREATED);
	}
	@DeleteMapping("/delete")
	public  ResponseEntity<Void> deleteAnStudent(@RequestParam Integer studId){
		studentServiceRepo.deleteAnStudent(studId);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
		
	}
}
