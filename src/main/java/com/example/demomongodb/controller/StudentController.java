package com.example.demomongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demomongodb.model.Student;
import com.example.demomongodb.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping(value = "/")
	public List<Student> getAllStudents() {
		return studentService.findAll();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@PostMapping(value = "/")
	public ResponseEntity<?> saveOrUpdateStudent(@RequestBody Student student) {
		studentService.saveOrUpdateStudent(student);
		return new ResponseEntity("Student added successfully", HttpStatus.OK);
	}

	@DeleteMapping(value = "/{studentNumber}")
	public void deleteStudent(@PathVariable Long studentNumber) {
	//	studentService.deleteStudent(studentService.findByStudentNumber(studentNumber).getId());
	}
}
