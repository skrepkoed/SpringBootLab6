package com.example.demo6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo6.entity.Course;
import com.example.demo6.entity.Student;
import com.example.demo6.service.CourseService;
import com.example.demo6.service.StudentService;

@RestController
@RequestMapping("/api")
public class MyController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private CourseService courseService;
    @GetMapping("/students")
    public List<Student> showAllStudents(){
        List<Student> allStudents = studentService.getAllStudents();
        return allStudents; 
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable("id") int id){
        return studentService.getStudent(id);
    }

    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return student;
    }
    @DeleteMapping("/students/{id}")
    public void updateStudent(@PathVariable("id") int id ){
        studentService.deleteStudent(id);
    }


    @GetMapping("/courses")
    public List<Course> showAllCourses(){
        List<Course> allCourses = courseService.getAllCourses();
        return allCourses; 
    }

    @GetMapping("/courses/{id}")
    public Course getcCourse(@PathVariable("id") int id){
        return courseService.getCourse(id);
    }

    @PostMapping("/courses")
    public Course saveCourse(@RequestBody Course course){
        return courseService.saveCourse(course);
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course){
        courseService.saveCourse(course);
        return course;
    }

    @DeleteMapping("/courses/{id}")
    public void updateCourse(@PathVariable("id") int id ){
        courseService.deleteCourse(id);
    }


}
