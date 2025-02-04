package org.abelalmeida.springbootcoursera.student.config;

import org.abelalmeida.springbootcoursera.student.dao.StudentDao;
import org.abelalmeida.springbootcoursera.student.dao.StudentDaoImpl;
import org.abelalmeida.springbootcoursera.student.service.StudentService;
import org.abelalmeida.springbootcoursera.student.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:application.properties")
public class ApplicationConfig {

    @Bean(name = "studentDao")
    StudentDao studentDao() {
        return new StudentDaoImpl();
    }

    @Value("${max}")
    private int numberOfStudents;

    @Bean(name = "studentService")
    StudentService service() {
        StudentServiceImpl service = new StudentServiceImpl();
        service.setStudentDao(studentDao());
        service.setNumberOfStudents(numberOfStudents);
        return service;

    }
    @Bean
    static PropertySourcesPlaceholderConfigurer getConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}

