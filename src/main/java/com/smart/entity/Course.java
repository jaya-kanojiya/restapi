package com.smart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	@Id
	Long id;
	String title;
	String description;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(Long i, String title, String description) {
		super();
		this.id = i;
		this.title = title;
		this.description = description;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", description=" + description + ", getId()=" + getId()
				+ ", getTitle()=" + getTitle() + ", getDescription()=" + getDescription() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
