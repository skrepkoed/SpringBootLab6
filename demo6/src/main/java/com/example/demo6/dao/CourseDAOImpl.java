package com.example.demo6.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo6.entity.Course;

public class CourseDAOImpl implements CourseDAO {

    @Autowired
    EntityManager entityManager;
    @Override
    public List<Course> getAllCourses() {
        Query query =entityManager.createQuery("from Courses");
        List<Course> allCourses= query.getResultList();
        return allCourses;
    }

    @Override
    public Course getCourse(int id) {
        return entityManager.find(Course.class, id);
    }

    @Override
    public Course saveCourse(Course course) {
       return entityManager.merge(course);
    }

    @Override
    public void deleteCourse(int id) {
        Query query = entityManager.createQuery("delete from Course"+
        " where id =:courseId");
        query.setParameter("courseId", id);
        query.executeUpdate();
    }
    
}
