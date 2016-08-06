package entity;

public class Film {
	//film_id,title,description,language
	private Integer film_id;
	private String title;
	private String description;
	private Integer language_id;
	private String language;
	public Integer getFilm_id() {
		return film_id;
	}
	public void setFilm_id(Integer film_id) {
		this.film_id = film_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getLanguage_id() {
		return language_id;
	}
	public void setLanguage_id(Integer language_id) {
		this.language_id = language_id;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Film() {
		super();
	}
	public Film(Integer film_id, String title, String description,
			Integer language_id, String language) {
		super();
		this.film_id = film_id;
		this.title = title;
		this.description = description;
		this.language_id = language_id;
		this.language = language;
	}
	@Override
	public String toString() {
		return "Film [film_id=" + film_id + ", title=" + title
				+ ", description=" + description + ", language_id="
				+ language_id + ", language=" + language + "]";
	}
	
	
}
