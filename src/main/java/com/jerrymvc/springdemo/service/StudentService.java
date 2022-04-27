package com.jerrymvc.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jerrymvc.springdemo.model.Students;
import com.jerrymvc.springdemo.model.StudentsDao;

@Service
@Transactional
public class StudentService {

	@Autowired
	private StudentsDao studentDao;

	public Students addStudent(Students student) {
		return studentDao.insertStudent(student);
	}

	public List<Students> getAllStudent() {
		return studentDao.listStudents(); 

	}
	public boolean deleteStudent(Integer id) {
		return studentDao.deleteStudent(id);

	}
	public Students updateStudent(Students student) {
		return studentDao.updateStudent(student); 

	}
	public Students getStudentById(Integer id) {
		return studentDao.findStudentById(id);
	}


}
