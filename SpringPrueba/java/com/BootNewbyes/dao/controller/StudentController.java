package com.BootNewbyes.dao.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.BootNewbyes.model.Student;
import com.BootNewbyes.service.StudentService;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

	private final StudentService studentService;
    @Autowired
	public StudentController(StudentService studentService) {
		
		this.studentService = studentService;
	}
    
    
	@RequestMapping(
		method = RequestMethod.GET,
		produces = MediaType.APPLICATION_JSON_VALUE,
		path = "{studentId}"	)
    public Student getStudentById(@PathVariable("studentId") UUID studentId) {
    	return studentService.getStudentByID(studentId);
    }
	
	@RequestMapping(
			method = RequestMethod.PUT,
			produces = MediaType.APPLICATION_JSON_VALUE,
			path = "{studentId}"	)
	    public int updateStudentById(@PathVariable("studentId") UUID studentId , @RequestBody Student studentUpdate) {
	    	return studentService.updateStudentById(studentId, studentUpdate);
	    }
		
	
	@RequestMapping(
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE
				)
	    public List<Student> getAllStudents() {
	    	return studentService.getAllStudents();
	    }
	@RequestMapping(
			method= RequestMethod.POST,
			consumes= MediaType.APPLICATION_JSON_VALUE)
	
	
	public void insertNewStudent(@RequestBody Student student) {
		
		studentService.persistNewStuden(UUID.randomUUID() , student);
		
	}
	
	@RequestMapping(
			method= RequestMethod.DELETE,
			path = "{studentId}"
			)
	public int deleteStudentById(@PathVariable("studentId") UUID studentId ) {
    	return studentService.deleteStudentById(studentId);
    }
	
	
}
