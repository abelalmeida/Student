package org.abelalmeida.springbootcoursera.student.service;

import org.abelalmeida.springbootcoursera.student.core.Student;
import org.abelalmeida.springbootcoursera.student.dao.StudentDao;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

//@Named(value="studentService")
public class StudentServiceImpl implements StudentService {

    //@Inject @Qualifier("studentDao")
    private StudentDao studentDao;



    //@Value("2")
    private int numberOfStudents;
    @Override
    public Student get(long id) {
        return studentDao.getOneStudent(id);
    }

    @Override
    public Collection<Student> getAllStudents() {
        return studentDao.getAll().stream().limit(numberOfStudents).collect(Collectors.toList());
    }

    @Value("#{studentDao.getAll().?[dept.equals('${department}')]}")
    private Collection<Student> departments = new ArrayList<Student>();
    public Collection<Student> getAllStudentForDepartment() {
        return departments;
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
