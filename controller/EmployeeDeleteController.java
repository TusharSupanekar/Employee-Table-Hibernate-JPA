package controller;


import service.EmployeeService;

public class EmployeeDeleteController {
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		boolean e = employeeService.deleteEmployeeById(2);
		System.out.println(e);
	}

}
