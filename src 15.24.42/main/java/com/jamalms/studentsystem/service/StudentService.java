package com.jamalms.studentsystem.service;

import java.util.List;

import com.jamalms.studentsystem.model.Student;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
