package com.appointment.schedulling.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Student")
@ToString

public class Student {
    @Id
    @GeneratedValue
    private Long cms_id;
    private String first_name;
    private String last_name;
    private String gender;
    private String email;
    private String phone;
    private String dept;
    private String role;
    private String password;


    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;


}
