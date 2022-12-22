package com.jamalms.studentsystem.controller;

import java.util.List;

import com.jamalms.studentsystem.model.Student;
import com.jamalms.studentsystem.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student ) {
        studentService.saveStudent(student);
        return "New student is added";
    }
    
    @GetMapping("/getAll")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
}
