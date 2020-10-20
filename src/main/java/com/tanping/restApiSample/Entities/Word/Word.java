package com.tanping.restApiSample.Entities.Word;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "whole_word", schema = "rest_api_sample")
public class Word {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;

	@Column(name="name")
	private String name;

	@Column(name="final_letter")
	private String finalLetter;

	@Column(name="initial_word")
	private String initialWord;

	@Column(name="comma")
	private Boolean comma;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFinalLetter() {
		return finalLetter;
	}

	public void setFinalLetter(String finalLetter) {
		this.finalLetter = finalLetter;
	}

	
	public String getInitialWord() {
		return initialWord;
	}

	public void setInitialWord(String initialWord) {
		this.initialWord = initialWord;
	}

	public Boolean getComma() {
		return comma;
	}

	public void setComma(Boolean comma) {
		this.comma = comma;
	}
	
	
}
