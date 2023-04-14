package info.hasunnilupul.studentrestapispringboot.controller;

import info.hasunnilupul.studentrestapispringboot.model.Student;
import info.hasunnilupul.studentrestapispringboot.services.StudentService;
import info.hasunnilupul.studentrestapispringboot.services.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentControllerImpl implements StudentController {
    private final StudentServiceImpl service;

    @Autowired
    public StudentControllerImpl(StudentServiceImpl service) {
        this.service = service;
    }

    @Override
    public void saveStudent(Student student) {
        this.service.saveStudent(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return this.service.getAllStudents();
    }

    @Override
    public Student findStudentById(Long id) {
        return this.service.findStudentById(id);
    }

    @Override
    public void updateStudent(Student student) {
        this.service.updateStudent(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        this.service.deleteStudentById(id);
    }
}
