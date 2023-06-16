package com.appointment.schedulling.service;

import com.appointment.schedulling.models.Student;
import com.appointment.schedulling.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;


    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }


    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }


    public Optional<Student> findById(Long id){
        return studentRepository.findById(id);
    }


}
