package info.hasunnilupul.studentrestapispringboot.services;

import info.hasunnilupul.studentrestapispringboot.model.Student;

import java.util.List;

public interface StudentService {
    void saveStudent(Student student);
    List<Student> getAllStudents();
    Student findStudentById(Long id);
    void updateStudent(Student student);
    void deleteStudentById(Long id);
}
