package org.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student_Driver {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Student.xml");
		Student student = (Student) context.getBean("hiiStudent");
		student.fullName();
		student.address();
		
	}

}
