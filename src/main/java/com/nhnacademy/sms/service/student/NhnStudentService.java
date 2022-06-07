package com.nhnacademy.sms.service.student;

import com.nhnacademy.sms.domain.Student;
import com.nhnacademy.sms.repository.student.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

// TODO #5:
@Service
@RequiredArgsConstructor
public class NhnStudentService implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudent(Long id) {
        return studentRepository.findById(id).orElseThrow();
    }

    @Override
    @Transactional
    public Student createStudent(Student student) {
        boolean present = studentRepository.findById(student.getId()).isPresent();
        if (present) {
            throw new IllegalStateException("already exists " + student.getId());
        }

        return studentRepository.save(student);
    }

    @Override
    @Transactional
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

}
