package controller;

import service.EmployeeService;

public class EmployeeUpdateController {
	public static void main(String[] args) {

		EmployeeService employeeService = new EmployeeService();
		employeeService.updateEmployee(4, 9875854201l);

	}

}
