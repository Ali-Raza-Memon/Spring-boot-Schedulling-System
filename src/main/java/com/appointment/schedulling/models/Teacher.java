package com.appointment.schedulling.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Teacher")
@ToString
public class Teacher {
    @Id
    @GeneratedValue
    private Long teacher_id;
    private String first_name;
    private String last_name;
    private String gender;
    private String email;
    private String phone;
    private String dept;
    private String role;
    private String password;

    @OneToMany(mappedBy = "teacher")
    private List<Student> students;

}
