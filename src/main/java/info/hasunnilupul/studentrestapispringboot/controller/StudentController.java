package info.hasunnilupul.studentrestapispringboot.controller;

import info.hasunnilupul.studentrestapispringboot.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface StudentController {
    @PostMapping
    void saveStudent(@RequestBody Student student);

    @GetMapping
    List<Student> getAllStudents();

    @GetMapping(path = "/{id}")
    Student findStudentById(@PathVariable("id") Long id);

    @PutMapping
    void updateStudent(@RequestBody Student student);

    @DeleteMapping(path = "/{id}")
    void deleteStudentById(@PathVariable("id") Long id);
}
