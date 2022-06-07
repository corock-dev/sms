package com.nhnacademy.sms.service.student;

import com.nhnacademy.sms.domain.Student;

import java.util.List;

public interface StudentService {

    List<Student> getStudents();

    // TODO #3: CRUD

    Student getStudent(Long id);

    Student createStudent(Student student);

    void deleteStudent(Long id);

}
