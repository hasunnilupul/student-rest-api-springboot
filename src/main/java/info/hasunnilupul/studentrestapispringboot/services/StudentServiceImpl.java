package info.hasunnilupul.studentrestapispringboot.services;

import info.hasunnilupul.studentrestapispringboot.model.Student;
import info.hasunnilupul.studentrestapispringboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    private StudentRepository repository;

    @Autowired
    public StudentServiceImpl(StudentRepository repository){
        this.repository = repository;
    }

    @Override
    public void saveStudent(Student student) {
        this.repository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return this.repository.findAll();
    }

    @Override
    public Student findStudentById(Long id) {
        return this.repository.findById(id).get();
    }

    @Override
    public void updateStudent(Student student) {
        this.repository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        this.repository.deleteById(id);
    }
}
