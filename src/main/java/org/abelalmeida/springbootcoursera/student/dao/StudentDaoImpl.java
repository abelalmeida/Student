package org.abelalmeida.springbootcoursera.student.dao;

import org.abelalmeida.springbootcoursera.student.core.Student;
import java.util.*;
public class StudentDaoImpl implements StudentDao {

    private Map<Long, Student> students; {
        students = new HashMap<>();

        students.put(1L, new Student(1L, "John", "Doe", "Computer Science", 1200.0));
        students.put(2L, new Student(2L, "Jane", "Doe", "Mathematics", 1000.0));
        students.put(3L, new Student(3L, "James", "Doe", "Physics", 800.0));
    };


    @Override
    public Student getOneStudent(long id) {
        return students.get(id);
    }

    public Collection<Student> getAllStudents() {
        return students.values();
    }
}
