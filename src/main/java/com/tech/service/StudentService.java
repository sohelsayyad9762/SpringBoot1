package com.tech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.tech.dao.StudentDao;
import com.tech.dto.Student;

@Service
public class StudentService {

	public StudentService() {
		System.out.println("inside StudentService cont port=6061");
	}

	@Autowired
	StudentDao studentDao;

	public List<Student> creatStudent(List<Student> std) {
		System.out.println("inside creatStudent()  port=6061");
		return studentDao.saveAll(std);
	}

	public List<Student> getAllStudent() {
		return studentDao.findAll();
	}

	public void deleteStudent(int a) {
		studentDao.deleteById(a);
	}

	public Student creatSingleStudent(Student student) {
		return studentDao.save(student);
	}

	public Student findById(int id) {
		return studentDao.findById(id).get();
	}

	public List<Student> findByname(String name) {

		return studentDao.findByName(name);
	}
}
