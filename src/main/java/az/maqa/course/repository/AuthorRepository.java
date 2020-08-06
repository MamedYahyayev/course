package az.maqa.course.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import az.maqa.course.entity.Author;

public interface AuthorRepository extends PagingAndSortingRepository<Author, Long> {

	Page<Author> findAllByActive(Pageable pageable, Integer active);

}
