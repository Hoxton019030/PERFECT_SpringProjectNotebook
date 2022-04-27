package com.jerrymvc.springdemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Students {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;//這邊的id,name,grade,notes都會跟addPage的path對應到

	@Column(name = "studentname") 
	private String name; //這邊的id,name,grade,notes都會跟addPage的path對應到

	@Column(name = "grade")
	private String grade;//這邊的id,name,grade,notes都會跟addPage的path對應到

	@Column(name = "notes")
	private String notes;//這邊的id,name,grade,notes都會跟addPage的path對應到

	public Students() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Students(int id, String name, String grade, String notes) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", grade=" + grade + ", notes=" + notes + "]";
	}

	

}
