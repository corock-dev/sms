package com.nhnacademy.sms.service;

import com.nhnacademy.sms.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class NhnStudentServiceTest {

    // NOTE: 테스트할 때는 Autowired 가 필요함
    @Autowired
    StudentService studentService;

    @Test
    void getStudents() {
        // test
        List<Student> students = studentService.getStudents();

        // Assertion
        assertThat(students).hasSize(2);
    }

}
