package com.appointment.schedulling.service;

import com.appointment.schedulling.models.Student;
import com.appointment.schedulling.models.Teacher;
import com.appointment.schedulling.repository.StudentRepository;
import com.appointment.schedulling.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;


    public Teacher saveTeacher(Teacher teacher){
        return teacherRepository.save(teacher);
    }


    public List<Teacher> getAllTeacher(){
        return teacherRepository.findAll();
    }


    public Optional<Teacher> findById(Long id){
        return teacherRepository.findById(id);
    }



}
