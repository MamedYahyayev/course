package az.maqa.course.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Section extends BaseEntity {

	private String sectionName;

	private String sectionSize;

	private String sectionTime;

	@OneToMany(mappedBy = "section")
	private List<Lecture> lectures = new ArrayList<>();
	
	@ManyToOne
	private Content content;

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public String getSectionSize() {
		return sectionSize;
	}

	public void setSectionSize(String sectionSize) {
		this.sectionSize = sectionSize;
	}

	public String getSectionTime() {
		return sectionTime;
	}

	public void setSectionTime(String sectionTime) {
		this.sectionTime = sectionTime;
	}

	public List<Lecture> getLectures() {
		return lectures;
	}

	public void setLectures(List<Lecture> lectures) {
		this.lectures = lectures;
	}

}
