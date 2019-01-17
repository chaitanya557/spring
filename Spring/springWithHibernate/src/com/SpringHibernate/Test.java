package com.SpringHibernate;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		EmployeeDao employee = (EmployeeDao)factory.getBean("employee");
		
		Employee e= new Employee();
		e.setId(1);
		e.setName("chaitanya");
		e.setSalary(50000);
		
		employee.saveEmployee(e);
	}

}
