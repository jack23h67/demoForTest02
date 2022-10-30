package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.mapper.StudentAccountMapper;
import com.example.demo.model.Student;

@Component
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentAccountMapper studentAccountMapper;

    @Override
    public Integer insert(Student student) {
        return studentAccountMapper.insert(student);
    }

    @Override
    public void update(Student student) {
    	studentAccountMapper.update(student);
    }

    @Override
    public void deleteById(Integer id) {
    	studentAccountMapper.deleteById(id);
    }

    @Override
    public Student getById(Integer id) {
        return studentAccountMapper.getById(id);
    }
}
