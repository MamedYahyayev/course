package az.maqa.course.service;

import java.util.List;

import az.maqa.course.dto.AuthorDTO;

public interface AuthorService {

	List<AuthorDTO> getAuthor(int page, int limit);

}
