package com.cts.demo.model;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setId(1);
		employee.setName("Ashish");
		employee.setDesig("Manager");
		employee.setDept("Sales");
		
		Employee employee2=new Employee();
		employee2.setId(1);
		employee2.setName("Ashish");
		employee2.setDesig("Manager");
		employee2.setDept("Sales");
		
		System.out.println(employee);
		System.out.println(employee2);
		System.out.println(employee.hashCode());
		System.out.println(employee2.hashCode());
		
	}

}
