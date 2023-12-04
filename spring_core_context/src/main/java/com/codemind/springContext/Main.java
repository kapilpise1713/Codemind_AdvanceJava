package com.codemind.springContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Main {
	public static void main(String[] args) {
		
		ApplicationContext cntxt = new ClassPathXmlApplicationContext("Beans.xml");
		
		System.out.println(cntxt.getBean(Employee.class));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Without Spring
	/*	Employee emp = new Employee();
		
		emp.setName("Ajit");
		emp.setSalary(40000);
		
		
		Address add = new Address();
		add.setCity("Mumbai");
		add.setState("Maharashtra");
		emp.setAdd(add);
		System.out.println(emp);   */
	}

}
