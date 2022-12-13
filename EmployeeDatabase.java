package org.percholas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeDatabase {
	public static void main(String args[]) {
		String[] firstName = { "Harold", "Luciano", "Tyree", "Nyla", "Natalie", "Quincy", "Devyn", "Aliana" };

		String[] lastName = { "Riddle", "Zavala", "Ho", "Saunders", "Morgan", "Schroeder", "Nolan", "Orr" };

		String[] department = { "production", "r&d", "sales", "marketing", "human resources", "accounting", "sales",
				"r&d" };
		ArrayList<Employee> list = new ArrayList<>();
		Employee e = new Employee(null,null,null);
		list = e.addEmployes(firstName, lastName, department);
		for (Employee values : list) {
			System.out.println(values);
		}
		System.out.println();
		System.out.println(e.firstName);

		e.removeEmployes("Harold", "Riddle");
		System.out.println(e);
	}
}

class Employee {
	// fields
	String firstName, lastName, department;
	ArrayList<Employee> employees = new ArrayList<>();

	// constructor
	public Employee(String firstName, String lastName, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
	}

	// methods
	void setLastname(String lastName) {
		this.lastName = lastName;
	}

	String getDepartment() {
		return this.department;
	}

	void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	String getFirstName() {
		return this.firstName;
	}

	String getLastName() {
		return this.lastName;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", department=" + department + "]";
	}

	void setDepartment(String department) {
		this.department = department;
	}

	public ArrayList<Employee> addEmployes(String[] first, String[] last, String[] department) {

		for (int i = 0; i < first.length; i++) {
			Employee e = new Employee(first[i], last[i], department[i]);
			employees.add(e);
		}

		return employees;

	}

	public void removeEmployes(String first,String last) {
		Iterator<Employee> iter = employees.iterator();
		while (iter.hasNext()) {
			Employee s = iter.next();
			if (s.firstName=="Harold" && "Riddle" == s.lastName) {
				iter.remove();

			} else
				System.out.println(s);
		}

	}
}
