package az.maqa.course.controller;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import az.maqa.course.dto.AuthorDTO;
import az.maqa.course.response.ResponseAuthorV1;
import az.maqa.course.response.ResponseAuthorV2;
import az.maqa.course.service.AuthorService;

@RestController
@RequestMapping("/authors")
public class AuthorController {

	@Autowired
	private AuthorService authorService;

	@GetMapping(headers = "X_AUTHOR_VERSION = 1", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public List<ResponseAuthorV1> getAllAuthorForWebCite(@RequestParam(value = "page", defaultValue = "1") int page,
			@RequestParam(value = "limit", defaultValue = "25") int limit) {
		ModelMapper modelMapper = new ModelMapper();

		List<AuthorDTO> authorDTO = authorService.getAuthor(page, limit);

		Type listType = new TypeToken<List<ResponseAuthorV1>>() {
		}.getType();

		List<ResponseAuthorV1> response = modelMapper.map(authorDTO, listType);

		return response;
	}

	@GetMapping(headers = "X_AUTHOR_VERSION = 2", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public List<ResponseAuthorV2> getAllAuthor(@RequestParam(value = "page", defaultValue = "1") int page,
			@RequestParam(value = "limit", defaultValue = "25") int limit) {
		ModelMapper modelMapper = new ModelMapper();

		List<AuthorDTO> authorDTO = authorService.getAuthor(page, limit);

		Type listType = new TypeToken<List<ResponseAuthorV1>>() {
		}.getType();

		List<ResponseAuthorV2> response = modelMapper.map(authorDTO, listType);

		return response;
	}

}
