package com.appointment.schedulling.repository;

import com.appointment.schedulling.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

    public Student findById(long id);
}
