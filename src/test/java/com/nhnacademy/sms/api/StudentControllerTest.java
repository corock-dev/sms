package com.nhnacademy.sms.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nhnacademy.sms.domain.Student;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@Transactional
class StudentControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    @Order(1)
    void testGetStudents() throws Exception {
        this.mvc.perform(MockMvcRequestBuilders.get("/students"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].name", Matchers.equalTo("corock")));
    }

    @Test
    @Order(2)
    void testGetStudent() throws Exception {
        this.mvc.perform(MockMvcRequestBuilders.get("/students/{id}", 1L))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$.name", Matchers.equalTo("corock")))
                .andExpect(MockMvcResultMatchers.jsonPath("$.score", Matchers.equalTo(100)));
    }

    @Test
    @Order(3)
    void testCreateStudent() throws Exception {
        Student corock = new Student(4L, "lee", 100);
        String requestBody = new ObjectMapper().writeValueAsString(corock);

        this.mvc.perform(MockMvcRequestBuilders.post("/students")
                                               .contentType(MediaType.APPLICATION_JSON)
                                               .content(requestBody))
                .andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$.id", Matchers.equalTo(5)));
    }

    @Test
    @Order(4)
    void testDeleteStudent() throws Exception {
        this.mvc.perform(MockMvcRequestBuilders.delete("/students/{id}", 4L))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

}
