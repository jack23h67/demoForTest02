package com.example.demo.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Student;
@SpringBootTest
class StudentAccountMapperTest {

	@Autowired
	private StudentAccountMapper studentAccountMapper;
	
	@Test
	public void testInsert() {
		Student student = new Student();
		student.setName("JackHsu")
		       .setScore(87.0)
		       .setGraduate(true);
		
		Integer id = studentAccountMapper.insert(student);
		System.out.println(id);
	}

	@Test
	public void testFindStudentByName() {
		String name = "Amy";
		Student student = studentAccountMapper.findStudentByName(name);
		if(student != null) { 
			System.out.println(student.toString());
		}
	}

	@Test
	public void testUpdate() {
		Student student = new Student();
		student.setId(3)
		       .setName("Jeff")
	           .setScore(99.0)
	           .setGraduate(true);
		Integer result = studentAccountMapper.update(student);
		System.out.println(result);
	}

}
