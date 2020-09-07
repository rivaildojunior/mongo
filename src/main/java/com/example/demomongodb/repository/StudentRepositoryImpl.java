package com.example.demomongodb.repository;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;

import com.example.demomongodb.model.Student;

public class StudentRepositoryImpl {

	@Autowired
	private MongoTemplate mongoTemplate;

	public List<Student> findAll() {
		// Query query = new Query(where("name").is("rivaildo"));
		// List<Student> lista = mongoTemplate.findAll(Student.class, "students");
		// System.out.println(lista);
		// return lista;

		Criteria criteria = where("name").is("rivaildo").and("studentNumber").is(13);
		List<Student> result = mongoTemplate.find(query(criteria), Student.class);

		return result;
	}
}
