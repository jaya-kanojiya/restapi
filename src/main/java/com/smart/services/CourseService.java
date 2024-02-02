package com.smart.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.smart.entity.Course;

public interface CourseService {
	
	public List<Course> getCourse();
	
	public Course getCourseid(Long id);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);
	
	public void deleteCourse(Long id);
	

}
