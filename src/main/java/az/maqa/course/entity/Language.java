package az.maqa.course.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Language extends BaseEntity {

	@Column(length = 30)
	private String languageName;

	@Column(length = 15)
	private String languageCode;

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

}
