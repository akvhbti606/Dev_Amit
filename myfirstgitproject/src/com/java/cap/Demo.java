package com.java.cap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Hello, This is demo for git project");
		System.out.println("Hi,this is second");
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "Amit", "Pune", 40000));
		list.add(new Employee(2, "Pawan", "Delhi", 45000));
		list.add(new Employee(3, "Sanjay", "Banglore", 30000));
		
		System.out.println("**********************************");
		
		Collections.sort(list);
		for (Employee employee : list) {
			System.out.println(employee.getId() +" " +employee.getName()+ " " + employee.getCity()+" " + employee.getSalary());
		}
		
		System.out.println("**********************************");
		
		Collections.sort(list, new Comparator<Employee>(){
			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				if((o1.getSalary() - o2.getSalary()) > 0){
					return 1;
				}else if((o1.getSalary() - o2.getSalary()) < 0){
					return -1;
				}else{
					return 0;
				}
			}
			
		});;
		for (Employee employee : list) {
			System.out.println(employee.getId() +" " +employee.getName()+ " " + employee.getCity()+" " + employee.getSalary());
		}
	}

}
