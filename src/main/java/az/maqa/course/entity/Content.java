package az.maqa.course.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Content extends BaseEntity {

	@OneToMany(mappedBy = "content")
	private List<Section> sections = new ArrayList<>();

	@OneToOne
	@JoinColumn(name = "course_id")
	private Course course;

	public List<Section> getSections() {
		return sections;
	}

	public void setSections(List<Section> sections) {
		this.sections = sections;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

}
