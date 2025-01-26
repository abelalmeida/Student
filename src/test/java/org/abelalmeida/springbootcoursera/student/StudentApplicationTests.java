package org.abelalmeida.springbootcoursera.student;

import org.abelalmeida.springbootcoursera.student.service.StudentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class StudentApplicationTests {
    private ApplicationContext context;
    private StudentService service;

    @BeforeEach
    void setUp() {
        context = new ClassPathXmlApplicationContext("Beans.xml");

    }
    @Test
    void testGetOneStudent() {
        service = (StudentService) context.getBean("studentService", StudentService.class);
        assertNotNull(service);
    }

}
