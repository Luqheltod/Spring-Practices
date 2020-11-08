package com.BootNewbyes.dao;

import java.util.List;
import java.util.UUID;

import com.BootNewbyes.model.Student;

public interface StudentDao {

	int insertNewStuden(UUID studentId, Student student);

	Student selectStudentByID(UUID studentId);

	List<Student> selectAllStudents();

	int updateStudentById(UUID studentId, Student studentUpdate);

	int deleteStudentById(UUID studentId);
}
