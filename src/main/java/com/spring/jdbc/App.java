package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;
//import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
   
	public static void main( String[] args )
    {
        System.out.println( "My program is Started!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/Student.xml");
        //JdbcTemplate template=context.getBean("JdbcTemplate",JdbcTemplate.class);
        
        //insert query
        
        //String query="insert into Student(sid,sname,scity) values(?,?,?)";
        //fire query
        //int result=template.update(query,556,"Ritik Kishor","Dhanbad");
        //System.out.println("Number of record inserted..."+result);
        
        StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
        
//        Student student=new Student();
//        student.setStudentId(601);
//        student.setStudentName("John Elva Eddision");
//        student.setStudentCity("Instagram");
//        Student student=new Student();
//        student.setStudentId(703);
//	    student.setStudentName("Amids Elva Eddision");
//	    student.setStudentCity("Facebook");
//	    int result=studentDao.insert(student);
//	    System.out.println("Result is inserted......."+result);
	    
//	    Student student1=new Student();
//        student1.setStudentId(809);
//	    student1.setStudentName("Nins Elva Eddision");
//	    student1.setStudentCity("Whatsapp");
//	    int result1=studentDao.insert(student1);
//	    System.out.println("result1 is inserted......."+result1);
//	    
//        
//        int result=studentDao.insert(student);
//        System.out.println("Student Added "+result);
//        Student student=studentDao.getStudent(601);
//        System.out.println(student);
        
        //update
//        Student student=new Student();
//        student.setStudentId(556);
//        student.setStudentName("Anish Mahato");
//        student.setStudentCity("lucknow");
//        int result=studentDao.update(student);
//        System.out.println("Result is updated....."+result);
        
        //delete
        
//        Student student=new Student();
//        student.setStudentId(596);
//        int result=studentDao.delete(student);
//        System.out.println("Result is Delted....."+result);
        
        List<Student> student=studentDao.getAllStudent();
       // Student sa;
        for(Student sa:student)
        {
			System.out.println(sa);
        }
        
    }
}
