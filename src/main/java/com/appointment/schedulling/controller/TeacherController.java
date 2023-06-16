package com.appointment.schedulling.controller;

import com.appointment.schedulling.models.Teacher;
import com.appointment.schedulling.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping("/addTeacher")
    public Teacher addTeacher(@RequestBody Teacher teacher){
        return teacherService.saveTeacher(teacher);
    }

    @GetMapping("/allTeacher")
    public List<Teacher> allTeacher(){
        return teacherService.getAllTeacher();
    }


    @GetMapping("/teacher/{id}")
    public Optional<Teacher> findById(@PathVariable Long id){
        return teacherService.findById(id);
    }



}
