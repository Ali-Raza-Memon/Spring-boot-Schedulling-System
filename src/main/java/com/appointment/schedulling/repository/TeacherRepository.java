package com.appointment.schedulling.repository;

import com.appointment.schedulling.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository  extends JpaRepository<Teacher,Long> {
    public Teacher findById(long id);
}
