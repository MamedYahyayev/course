package az.maqa.course.response;

import java.util.ArrayList;
import java.util.List;

import az.maqa.course.entity.Course;
import lombok.Data;

@Data
public class ResponseAuthorV1 {

	private String publicId;

	private String name;

	private String surname;

	private Integer experience;

	private Integer reviews;

	private List<Course> courses = new ArrayList<Course>();

	private Integer active;

}
