package com.bitswilp.langLearn.api.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_language_structure")
public class UserLanguageStructureModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	@Column(name="language")
	private String languages;
	
	@Column(name="level")
	private String level;
	
	@Column(name="english_word")
	private String english_word;
	
	@Column(name="language_word")
	private String language_word;
	
	@Column(name="word_spell_in_english")
	private String word_spell_in_english;
	
		
	public UserLanguageStructureModel() {
		
	}
	public UserLanguageStructureModel(String languages, String level, String english_word, String language_word,
			String word_spell_in_english,String link_youtube_word) {
		super();
		this.languages = languages;
		this.level = level;
		this.english_word = english_word;
		this.language_word = language_word;
		this.word_spell_in_english = word_spell_in_english;
	}
	public String getLanguages() {
		return languages;
	}
	public void setLanguages(String languages) {
		this.languages = languages;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getEnglish_word() {
		return english_word;
	}
	public void setEnglish_word(String english_word) {
		this.english_word = english_word;
	}
	
	public String getLanguage_word() {
		return language_word;
	}
	public void setLanguage_word(String language_word) {
		this.language_word = language_word;
	}
	public String getWord_spell_in_english() {
		return word_spell_in_english;
	}
	public void setWord_spell_in_english(String word_spell_in_english) {
		this.word_spell_in_english = word_spell_in_english;
	}
	
}
