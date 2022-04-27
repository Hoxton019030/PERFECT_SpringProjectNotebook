package com.jerrymvc.springdemo.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentsDao {

	@Autowired
	private SessionFactory factory;

	public Students insertStudent(Students student) {
		Session session = factory.getCurrentSession();
		session.save(student);
		return student;
	}

	public List<Students> listStudents() {
		Session session = factory.getCurrentSession();
		Query<Students> query = session.createQuery("from Students", Students.class);
		List<Students> resultList = query.getResultList();
		return resultList;
	}

	public boolean deleteStudent(Integer id) {
		Session session = factory.getCurrentSession();
		Students tempStudent = session.get(Students.class, id);

		if (tempStudent != null) {
			session.delete(tempStudent);
			return true;
		}
		return false;

	}

	public Students updateStudent(Students student) {
		Session session = factory.getCurrentSession();
		session.saveOrUpdate(student);
		return student;
	}

	public Students findStudentById(Integer id) {
		Session sessison = factory.getCurrentSession();
		Students tempStudent = sessison.get(Students.class, id);
		return tempStudent;
	}

}
