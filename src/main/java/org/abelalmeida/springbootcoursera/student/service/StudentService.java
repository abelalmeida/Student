package org.abelalmeida.springbootcoursera.student.service;

import org.abelalmeida.springbootcoursera.student.core.Student;
import java.util.Collection;
public interface StudentService {

    Student getOneStudent(long id);
    //Collection<Student> getAllStudents();
}
