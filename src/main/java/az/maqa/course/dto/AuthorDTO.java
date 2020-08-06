package az.maqa.course.dto;

import java.util.ArrayList;
import java.util.List;

import az.maqa.course.entity.Course;
import lombok.Data;

@Data
public class AuthorDTO {

	private Long id;

	private String username;

	private String name;

	private String surname;

	private String email;

	private String password;

	private String encryptedPassword;

	private Integer experience;

	private Integer reviews;

	private List<Course> courses = new ArrayList<Course>();

	private Integer active;

}
