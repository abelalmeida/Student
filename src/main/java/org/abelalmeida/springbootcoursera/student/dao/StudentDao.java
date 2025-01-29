package org.abelalmeida.springbootcoursera.student.dao;

import org.abelalmeida.springbootcoursera.student.core.Student;

import java.util.Collection;

public interface StudentDao {
    Student getOneStudent(long id);
    Collection<Student> getAllStudents();

}
