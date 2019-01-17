package com.simpleJdbc;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

public class EmployeeDao {
	SimpleJdbcTemplate template;
	
	public EmployeeDao(SimpleJdbcTemplate template) {
		this.template = template;
	}

	public int update(Employee employee) {
		// TODO Auto-generated method stub
		String query = "update employee set name=? salary=? where id=?";
		return template.update(query,employee.getName(),employee.getSalary(),employee.getId());
	}

}
