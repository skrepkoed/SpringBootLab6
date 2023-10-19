package com.example.demo6.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo6.entity.Student;
@Repository
public class StudentDaoImpl implements StudentDao {
    @Autowired
    private EntityManager entityManager;

    public List<Student> getAllStudents(){
        Query query=entityManager.createQuery("from Student");
        List<Student> allStudents=query.getResultList();
        return allStudents;
    }

    public Student saveStudent(Student student){
        return entityManager.merge(student);
    }


    @Override
    public Student getStudent(int id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public void deleteStudent(int id) {
        Query query = entityManager.createQuery("delete from Student"+
        " where id =:studentId");
        query.setParameter("studentId", id);
        query.executeUpdate();
    }
}
