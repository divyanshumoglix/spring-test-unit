package com.mgiglione.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Manga {
    private String title;
    private String description;
    private Integer volumes;
    private Double score;
	public Manga() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manga(String title, String description, Integer volumes, Double score) {
		super();
		this.title = title;
		this.description = description;
		this.volumes = volumes;
		this.score = score;
	}
	public Manga(String title, String description) {
		super();
		this.title = title;
		this.description = description;
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
	public Integer getVolumes() {
		return volumes;
	}
	public void setVolumes(Integer volumes) {
		this.volumes = volumes;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
}
