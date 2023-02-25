package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entities.Student;

public interface StudentDao {
	public int insert(Student student);
	public int update(Student student);
	public int delete(Student student);
	public Student getStudent(int studentId);
	public List<Student> getAllStudent();
}
