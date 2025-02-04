package org.abelalmeida.springbootcoursera.student;

import org.abelalmeida.springbootcoursera.student.config.ApplicationConfig;
import org.abelalmeida.springbootcoursera.student.service.StudentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.inject.Inject;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;


//@SpringBootTest
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = ApplicationConfig.class)
class StudentApplicationTests {

    //spring

//    private ApplicationContext context;
//    private StudentService service;
//
//    @BeforeEach
//    void setUp() {
//        context = new ClassPathXmlApplicationContext("Beans.xml");
//        service = (StudentService) context.getBean("studentService", StudentService.class);
//    }

    // javax.inject
    @Inject
    private StudentService service;
    @Test
    void testGetOneStudent() {
        assertNotNull(service);
    }

    @Test
    void testGetAllStudents() {
        service.getAllStudents().forEach(student ->
                System.out.println(student.getId() + " " + student.getFirstName() + " " + student.getSurName() + " " + student.getDept() + " " + student.getFees()));
    }

    @Test
    void testStudentsForDepartment(){
        assertThat(service.getAllStudentForDepartment().size()).isEqualTo(1);
    }
}
