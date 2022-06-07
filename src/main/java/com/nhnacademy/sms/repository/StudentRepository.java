package com.nhnacademy.sms.repository;

import com.nhnacademy.sms.domain.Student;

import java.util.List;

public interface StudentRepository {

    List<Student> findAll();

}
