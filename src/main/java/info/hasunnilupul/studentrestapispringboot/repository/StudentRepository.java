package info.hasunnilupul.studentrestapispringboot.repository;

import info.hasunnilupul.studentrestapispringboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
