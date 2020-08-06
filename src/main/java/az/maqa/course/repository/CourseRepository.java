package az.maqa.course.repository;

import org.springframework.data.repository.CrudRepository;

import az.maqa.course.entity.Course;

public interface CourseRepository extends CrudRepository<Course, Long>{

}
