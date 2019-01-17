package com.PreparedStatement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeDao employee = (EmployeeDao)context.getBean("employee");
		employee.saveEmployeeByPreparedStatement(new Employee(1,"chaitanya",35000));
	}

}
