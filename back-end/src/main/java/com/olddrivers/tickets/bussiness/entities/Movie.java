package com.olddrivers.tickets.bussiness.entities;

import java.io.Serializable;

public class Movie implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String cover;
	private String date;
	private String description;
	private Float score;
	
	public Movie() {
		super();
		
	}
	
	public long getId() {
		return this.id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getCover() {
		return this.cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Float getScore() {
		return this.score;
	}
	public void setScore(Float score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{")
		.append("\"id\":").append(id).append(",")
		.append("\"name\":\"").append(name).append("\",")
		.append("\"cover\":\"").append(cover).append("\",")
		.append("\"date\":\"").append(date).append("\",")
		.append("\"description\":\"").append(description).append("\",")
		.append("\"score\":\"").append(score).append("\"")
		.append("}");
		return builder.toString();	
	}
}
