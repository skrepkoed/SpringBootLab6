package com.example.demo6.dao;

import java.util.List;

import com.example.demo6.entity.Course;

public interface CourseDAO {
    public List<Course> getAllCourses();
    public Course getCourse(int id);
    public Course saveCourse(Course course);
    public void deleteCourse(int id);
}
