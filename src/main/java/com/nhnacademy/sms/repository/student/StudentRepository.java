package com.nhnacademy.sms.repository.student;

import com.nhnacademy.sms.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findAll();

}
