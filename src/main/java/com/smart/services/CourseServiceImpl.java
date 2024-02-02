package com.smart.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.smart.dao.CourseDao;
import com.smart.entity.Course;
@Service
public class CourseServiceImpl implements CourseService {
	
	List<Course> list;
	@Autowired
	private CourseDao coursedao;
/*	
	public CourseServiceImpl()
	{
		list = new ArrayList<>();
		list.add(new Course((long) 123,"maths","mathametic book"));
		list.add(new Course((long) 234,"englidh","enlish vocab book"));
		
		
		//list.add(new Course(124,"spring","this is spring class"));
	}

	@Override
	public List<Course> getCourse() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourseid(Long id) {
		
		Course c = null;
		for(Course course : list)
		{
			if(course.getId()==id)
			{
				c=course;
				break;
			}
		}
		
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		
		list.add(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) 
	{
		
		list.forEach(e->
		{
		if(	e.getId()==course.getId())
		{
			e.setTitle(course.getTitle());
			e.setDescription(course.getDescription());
		}
					
		});
		
		return course;
	}

	@Override
	public void deleteCourse(Long id) {
		list = this.list.stream().filter(e-> e.getId()!=id).collect(Collectors.toList());
		
	}
*/
//implement using database
	
	@Override
	public List<Course> getCourse() {
		
		return coursedao.findAll();
	}

	@Override
	public Course getCourseid(Long id) {

		return coursedao.getOne(id);
	}

	@Override
	public Course addCourse(Course course) {
	
		coursedao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		coursedao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(Long id) {
	  Course course=coursedao.getOne(id);
	  coursedao.delete(course);
	}
	

	
	
	

}
