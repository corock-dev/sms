package com.nhnacademy.sms.repository.student;

import com.nhnacademy.sms.domain.Student;
import com.nhnacademy.sms.repository.student.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

// @DataJpaTest
@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    // JUnit5 부터는 접근 제어자를 지정하지 않아도 됨
    @Test
    void testStudentRepository() {
        // data
        Student corock = new Student(1L, "corock", 100);
        studentRepository.save(corock);

        Optional<Student> student = studentRepository.findById(1L);

        // Assertions
        assertThat(student).isPresent();
        assertThat(student.orElse(null)).isEqualTo(corock);
    }

}
