package com.appointment.schedulling.controller;

import com.appointment.schedulling.models.Student;
import com.appointment.schedulling.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    //add Student
    //get All Student
    //get by id

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @GetMapping("/allStudents")
    public List<Student> allStudents(){
        return studentService.getAllStudent();
    }


    @GetMapping("/{id}")
    public Optional<Student> findById(@PathVariable Long id){
        return studentService.findById(id);
    }



}
