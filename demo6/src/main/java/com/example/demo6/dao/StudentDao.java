package com.example.demo6.dao;

import java.util.List;

import com.example.demo6.entity.Student;

public interface StudentDao {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student getStudent(int id);
    void deleteStudent(int id);
}
