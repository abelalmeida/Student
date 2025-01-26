package org.abelalmeida.springbootcoursera.student.service;

import org.abelalmeida.springbootcoursera.student.core.Student;
import org.abelalmeida.springbootcoursera.student.dao.StudentDao;

import java.util.Collection;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;
    private int numberOfStudents;

    @Override
    public Student getOneStudent(long id) {
        return null;
    }

    public StudentDao getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
}
