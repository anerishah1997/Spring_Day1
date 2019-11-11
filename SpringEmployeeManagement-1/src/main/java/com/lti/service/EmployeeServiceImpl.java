package com.lti.service;

import java.util.ArrayList;
import java.util.List;

import com.lti.dao.EmployeeDao;
import com.lti.dao.EmployeeDaoImpl;
import com.lti.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao dao;
	
	public EmployeeServiceImpl(){
		System.out.println("Service object created");
	}
	
	public EmployeeDao getDao() {
		return dao;
	}

	public void setDao(EmployeeDao dao) {
		this.dao = dao;
	}

	public boolean addEmployee(Employee employee) {
		return dao.createEmployee(employee);
	}

	public List<Employee> findAllEmployees() {
		return dao.readAllEmployees();
	}
	

}
