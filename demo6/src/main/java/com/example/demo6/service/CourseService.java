package com.example.demo6.service;

import java.util.List;

import com.example.demo6.entity.Course;

public interface CourseService {
    List<Course> getAllCourses();
    Course saveCourse(Course course);
    Course getCourse(int id);
    void deleteCourse(int id);
}
