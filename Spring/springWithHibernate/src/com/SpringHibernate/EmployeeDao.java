package com.SpringHibernate;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class EmployeeDao {
	HibernateTemplate hibernatetemplate;
	
	public void setTemplate(HibernateTemplate hibernatetemplate) {
		this.hibernatetemplate = hibernatetemplate;
	}

	public void saveEmployee(Employee e) {
		// TODO Auto-generated method stub
		hibernatetemplate.save(e);
	}
	
}
