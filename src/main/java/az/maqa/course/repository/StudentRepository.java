package az.maqa.course.repository;

import org.springframework.data.repository.CrudRepository;

import az.maqa.course.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
