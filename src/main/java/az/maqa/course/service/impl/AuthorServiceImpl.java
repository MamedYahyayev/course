package az.maqa.course.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Type;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import az.maqa.course.dto.AuthorDTO;
import az.maqa.course.entity.Author;
import az.maqa.course.repository.AuthorRepository;
import az.maqa.course.service.AuthorService;

public class AuthorServiceImpl implements AuthorService {

	@Autowired
	private AuthorRepository authorRepository;

	@Override
	public List<AuthorDTO> getAuthor(int page, int limit) {
		List<AuthorDTO> returnValue = new ArrayList<AuthorDTO>();
		ModelMapper modelMapper = new ModelMapper();

		if (page > 0)
			page = page - 1;

		Pageable pageable = PageRequest.of(page, limit);

		Page<Author> authorsPage = authorRepository.findAllByActive(pageable, 1);

		List<Author> authors = authorsPage.getContent();

		Type listType = new TypeToken<List<AuthorDTO>>() {
		}.getType();

		returnValue = modelMapper.map(authors, listType);

		return returnValue;
	}

}
