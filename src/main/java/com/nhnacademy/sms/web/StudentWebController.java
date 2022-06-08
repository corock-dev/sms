package com.nhnacademy.sms.web;

import com.nhnacademy.sms.config.StudentProperties;
import com.nhnacademy.sms.service.student.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// TODO #2: 컨트롤러 작성
@Controller
@RequiredArgsConstructor
public class StudentWebController {

    // MEMO: lombok 의 Value 아님!
    @Value("${nhn.student.name}")
    private String studentName;

    private StudentService studentService;

    private StudentProperties studentProperties;

    @GetMapping("/web/students/{id}")
    public String getStudent(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentService.getStudent(id));
        model.addAttribute("studentName", studentName);
        model.addAttribute("properties", this.studentProperties);

        return "student";
    }

}
