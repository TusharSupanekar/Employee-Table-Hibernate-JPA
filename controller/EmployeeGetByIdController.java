package controller;

import service.EmployeeService;

public class EmployeeGetByIdController {
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		employeeService.getEmployeeById(1);
	}
}
