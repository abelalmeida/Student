package org.abelalmeida.springbootcoursera.student.service;

import org.abelalmeida.springbootcoursera.student.core.Student;
import org.abelalmeida.springbootcoursera.student.dao.StudentDao;
import org.abelalmeida.springbootcoursera.student.dao.StudentDaoImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import javax.inject.Inject;
import javax.inject.Named;

import java.util.Collection;
import java.util.stream.Collectors;

@Named(value="studentService")
public class StudentServiceImpl implements StudentService {
    @Inject @Qualifier("studentDao")
    private StudentDao studentDao;
    @Value("2")
    private int numberOfStudents;



    @Override
    public Student getOneStudent(long id) {
        return null;
    }

    @Override
    public Collection<Student> getAllStudents() {
        return studentDao.getAllStudents().stream().limit(numberOfStudents).collect(Collectors.toList());
    }

    public StudentDao getStudentDao() {
        return studentDao;
    }

//    public void setStudentDao(StudentDao studentDao) {
//        this.studentDao = studentDao;
//    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

//    public void setNumberOfStudents(int numberOfStudents) {
//        this.numberOfStudents = numberOfStudents;
//    }
}
