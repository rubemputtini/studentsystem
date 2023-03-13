package com.rubemputtini.studentsystem.service;

import com.rubemputtini.studentsystem.model.Student;

import java.util.List;

public interface StudentService {

    Student saveStudent(Student student);
    List<Student> getAllStudents();
}
