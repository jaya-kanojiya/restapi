package com.smart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.smart.entity.Course;
import com.smart.services.CourseService;

@RestController
public class MyController {
	@Autowired
	private CourseService courseService;
	@GetMapping("/home")
	public String home()
	{
		
		return "this is home page";
	}
	
	//for course for get
	@GetMapping("/course")
	public List<Course> course()
	{
		return this.courseService.getCourse();
	}
	//get specific course
	@GetMapping("/course/{id}")
	public Course courseId(@PathVariable String id)
	{
		return this.courseService.getCourseid(Long.parseLong(id));
	}
	//post
	@PostMapping("/course")
	public Course addCourse(@RequestBody Course course)
	{
		return this.courseService.addCourse(course);
	}
	//Put 
	@PutMapping("/course")
	public Course updateCourse(@RequestBody Course course)
	{
		return this.courseService.updateCourse(course);
	}
	//delete
	@DeleteMapping("/course/{id}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String id)
	{
		try {
			this.courseService.deleteCourse(Long.parseLong(id));
			return new ResponseEntity<> (HttpStatus.OK);
		}catch(Exception e)
		{
			return new ResponseEntity<> (HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}



}