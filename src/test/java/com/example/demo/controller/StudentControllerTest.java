package com.example.demo.controller;

import static org.mockito.Mockito.when;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@SpringBootTest
@AutoConfigureMockMvc
public class StudentControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private StudentService studentService;
	
	@Test
	public void testGetById() throws Exception {
		
		//RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/students/3");
		
		//mockMvc.perform((org.springframework.test.web.servlet.RequestBuilder) requestBuilder)
		//        .andExpect(MockMvcResultMatchers.status().is(200));
		//==============================================================================
		
		@SuppressWarnings("deprecation")
		Date createDate = new Date(2021,9,5, 12,19,48);
		Student student = new Student();
		student.setId(3)
		       .setName("Judy")
		       .setScore(100.0)
		       .setGraduate(true)
		       .setCreateDate(createDate);
		when(studentService.getById(3)).thenReturn(student);

		mockMvc.perform(MockMvcRequestBuilders.get("/students/3"))
				.andExpect(MockMvcResultMatchers.status().is(200));
	}

}
