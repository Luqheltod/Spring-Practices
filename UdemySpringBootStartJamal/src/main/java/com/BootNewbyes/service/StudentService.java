package com.BootNewbyes.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.BootNewbyes.dao.StudentDao;
import com.BootNewbyes.model.Student;

@Service
public class StudentService {

	private final StudentDao studentDao;
	
	
	public StudentService(StudentDao studentDao) {
	
		this.studentDao = studentDao;
	}

	public int persistNewStuden(UUID studentId, Student student) {
		UUID studentUid = studentId == null ? UUID.randomUUID() : studentId;
		student.setId(studentId);
		return studentDao.insertNewStuden(studentUid, student);
	}

	public Student getStudentByID(UUID studentId) {
		return studentDao.selectStudentByID(studentId);
	}

	public List<Student> getAllStudents(){
		return studentDao.selectAllStudents();
	}

	public int updateStudentById(UUID studentId, Student studentUpdate) {
		studentUpdate.setId(studentId);
		return studentDao.updateStudentById(studentId, studentUpdate);
	}

	public int deleteStudentById(UUID studentId) {
		return studentDao.deleteStudentById(studentId);
	}
}
