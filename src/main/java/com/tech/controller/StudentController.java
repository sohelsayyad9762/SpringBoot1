package com.tech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.dto.Student;
import com.tech.service.StudentService;

@RestController
@RequestMapping("/service1")
public class StudentController {

	public StudentController() {
		System.out.println("inside StudentController cont port=6061");
	}

	@Autowired
	StudentService studentService;

	@GetMapping("/test")
	public String test() {
		return "this is test1";
	}

	@PostMapping("/createAllStudent")
	public List<Student> creatStudent(@RequestBody List<Student> std) {
		return studentService.creatStudent(std);

	}

	@GetMapping("/getAll")
	public List<Student> getAllStudent() {
		return studentService.getAllStudent();
	}

	@DeleteMapping("/deleteStudent/{id}")
	public void deleteStudent(@PathVariable("id") int id) {
		studentService.deleteStudent(id);
	}

	@PostMapping("/creatSingleStudent")
	public Student creatSingleStudent(@RequestBody Student student) {
		return studentService.creatSingleStudent(student);
	}

	@GetMapping("/finById/{id}")
	public Student findById(@PathVariable("id") int id) {
		System.out.println("I'm in findById");
		return studentService.findById(id);

	}
	
	
	
	@GetMapping("/findByName/{name}")
	public List<Student> findByname(@PathVariable("name") String name) {
	return	studentService.findByname(name);
	}
	
	
	
	
}
