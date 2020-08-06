package az.maqa.course.request;

import java.util.ArrayList;
import java.util.List;

import az.maqa.course.entity.Course;
import lombok.Data;

@Data
public class RequestAuthor {
	
	private String username;
	
	private String name;
	
	private String surname;
	
	private String email;
	
	private String password;
	
	private Integer experience;

	private Integer reviews; 
	
	private List<Course> courses = new ArrayList<>();

	private Integer active;
}
