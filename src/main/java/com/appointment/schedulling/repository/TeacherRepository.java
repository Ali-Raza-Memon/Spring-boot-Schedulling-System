package com.appointment.schedulling.repository;

import com.appointment.schedulling.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository  extends JpaRepository<Teacher,Long> {
}
