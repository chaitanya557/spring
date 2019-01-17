package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeDao dao = (EmployeeDao)context.getBean("employee");
		int status = dao.saveEmployee(new Employee(102,"chaitanya",35000));
		System.out.println(status);
	}

}
