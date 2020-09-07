package com.example.demomongodb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demomongodb.model.Student;
import com.example.demomongodb.repository.StudentRepository;
import com.example.demomongodb.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	@Override
	public void saveOrUpdateStudent(Student student) {
		studentRepository.save(student);
	}

	@Override
	public void deleteStudent(String id) {
		studentRepository.deleteById(id);
	}
}
