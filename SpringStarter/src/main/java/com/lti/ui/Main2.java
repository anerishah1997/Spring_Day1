package com.lti.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.lti.model.Employee;

public class Main2 {

	public static void main(String[] args) {

		/*Employee employee = new Employee(1000, "Aneri", 5000);
		Address address = new Address("ABC road", "Mumbai", "400706");*/
		
		// this main class is doing dependency injection manually
		//employee.setAddress(address);
		
		// here we have to ask spring to give the object of Employee.....for that use spring api.
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml"); // created the instance of spring container
		//Employee employee = (Employee) context.getBean("employee"); // for more type safety,use below one
		Employee employee = context.getBean("employee",Employee.class);
		System.out.println(employee);
		System.out.println(employee.getAddress());
		
		Employee employee2 = context.getBean("employee",Employee.class);
		System.out.println(employee2);
		System.out.println(employee2.getAddress());
		
		System.out.println(employee.hashCode());
		System.out.println(employee2.hashCode()); // both hashcode are same, so both references are pointing to same objectscope="prototype"
	}

}
