package com.spring.jdbc.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Student;

public  class StudentDaoImp implements StudentDao {
	


	public int insert(Student student) {
		String query="insert into student(sid,sname,scity) values(?,?,?)";
		int r=this.jdbcTemplate.update(query,student.getStudentId(),student.getStudentName(),student.getStudentCity());
		return r;
	}
	
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Student getStudent(int studentId) {
		String query="Select * from student where sid=?";
		RowMapper<Student>rowMapper=new RowMapperImpl();
		Student student=this.jdbcTemplate.queryForObject(query,rowMapper,studentId);
		return student;
	}

	public int update(Student student) {
		String query="update student set sname=?,scity=? where sid=?";
		int update=this.jdbcTemplate.update(query,student.getStudentName(),student.getStudentCity(),student.getStudentId());
		return update;
	}

	public int delete(Student student) {
		String query="delete from student where sid=?";
		int delete=this.jdbcTemplate.update(query,student.getStudentId());
		return delete;
	}

	public List<Student> getAllStudent() {
		String query="select * from student";
		RowMapper<Student>rowMapper=new RowMapperImpl();
		List<Student> student=this.jdbcTemplate.query(query,new RowMapperImpl());
		return student;
	}

	
	

	
	

	
}
