package com.ResultSet;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeDao employee = (EmployeeDao)context.getBean("employee");
		List<Employee> list = employee.getAllEmployees();
		
		for(Employee e:list)
			System.out.println(e);
	}

}
