package az.maqa.course.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Author extends BaseEntity {

	private String username;

	private String name;

	private String surname;

	private String email;

	private String encryptedPassword;

	private Integer experience;

	private Integer reviews;

	@OneToMany(mappedBy = "author")
	private List<Course> courses = new ArrayList<Course>();

}
