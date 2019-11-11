package com.lti.dao;

import java.util.ArrayList;
import java.util.List;

import com.lti.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private static List<Employee> employees = new ArrayList<Employee>(); // creating in-memory db i.e when appln stops data will be gone..
	// usually it should be static

	public EmployeeDaoImpl()
	{
		System.out.println("Dao object is created");
		employees = new ArrayList<Employee>();
	}
	
	

	public boolean createEmployee(Employee employee) {
		boolean result = employees.add(employee);
		return result;	}



	public List<Employee> readAllEmployees() {
		return null;
	}
}
