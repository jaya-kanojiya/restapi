package com.smart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.entity.Course;

public interface CourseDao extends JpaRepository<Course, Long>{
	

}
