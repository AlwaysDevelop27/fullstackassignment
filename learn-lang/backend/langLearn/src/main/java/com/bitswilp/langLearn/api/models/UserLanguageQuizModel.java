package com.bitswilp.langLearn.api.models;

import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "language_quiz_question")
public class UserLanguageQuizModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "level")
	private String level;
	
	@Column(name="language")
	private String language;
	
	@Column(name= "question")
	private String question;
	
	@ElementCollection
	@CollectionTable(
			name="quiz_options",
			joinColumns = @JoinColumn(name="id"))
	@Column(name = "options")
	private List<String> options;
	
	@Column(name="answer")
	private String answer;

	public long getLang_quiz_id() {
		return id;
	}

	public void setLang_quiz_id(long lang_quiz_id) {
		this.id = lang_quiz_id;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	

	public UserLanguageQuizModel(long id, String level, String language, String question, List<String> options,
			String answer) {
		super();
		this.id = id;
		this.level = level;
		this.language = language;
		this.question = question;
		this.options = options;
		this.answer = answer;
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

	public UserLanguageQuizModel() {
		
	}

	
	
	

}
