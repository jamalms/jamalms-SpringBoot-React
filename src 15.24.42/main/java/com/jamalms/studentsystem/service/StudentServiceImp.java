package com.jamalms.studentsystem.service;

import java.util.List;

import com.jamalms.studentsystem.model.Student;
import com.jamalms.studentsystem.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class StudentServiceImp implements StudentService{
   
    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    
}
