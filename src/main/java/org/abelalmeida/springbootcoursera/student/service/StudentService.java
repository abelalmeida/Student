package org.abelalmeida.springbootcoursera.student.service;

import org.abelalmeida.springbootcoursera.student.core.Student;
import java.util.Collection;
public interface StudentService {

    Student get(long id);
    Collection<Student> getAllStudents();
    Collection<Student> getAllStudentForDepartment();
}
