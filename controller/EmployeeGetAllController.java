package controller;

import java.util.List;

import dto.EmployeeDto;
import service.EmployeeService;

public class EmployeeGetAllController {
	public static void main(String[] args) {

		EmployeeService employeeService = new EmployeeService();
		List<EmployeeDto> e = employeeService.getAllEmployeeDto();
		for (EmployeeDto emp : e) {
			System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getEmail() + " " + emp.getCno());

			System.out.println("=========================");
		}

	}

}
