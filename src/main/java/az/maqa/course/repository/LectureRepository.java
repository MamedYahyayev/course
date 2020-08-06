package az.maqa.course.repository;

import org.springframework.data.repository.CrudRepository;

import az.maqa.course.entity.Lecture;

public interface LectureRepository extends CrudRepository<Lecture, Long>{

}
