package com.example.demomongodb.service;

import java.util.List;

import com.example.demomongodb.model.Student;

public interface StudentService {
	
	List<Student> findAll();

    void saveOrUpdateStudent(Student student);

    void deleteStudent(String id);

}
