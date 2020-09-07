package com.example.demomongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demomongodb.model.Student;

public interface StudentRepository extends MongoRepository<Student, String> {

	
}
