package com.tech.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tech.dto.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer>{

//	List<Student> findByName(String name);
	
//	List<Student> findByName(String name);
	
	List<Student> findByName(String name);
}
