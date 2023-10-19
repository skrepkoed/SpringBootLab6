package com.example.demo6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo6.dao.CourseDAO;
import com.example.demo6.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    CourseDAO courseDAO;
    @Override
    public List<Course> getAllCourses() {
        return courseDAO.getAllCourses();
    }

    @Override
    public Course saveCourse(Course course) {
        return courseDAO.saveCourse(course);
    }

    @Override
    public Course getCourse(int id) {
        return courseDAO.getCourse(id);
    }

    @Override
    public void deleteCourse(int id) {
        courseDAO.deleteCourse(id);
    }
    
}
