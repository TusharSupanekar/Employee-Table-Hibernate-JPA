package controller;

import dto.EmployeeDto;
import service.EmployeeService;

public class EmployeeSaveController {
	public static void main(String[] args) {
		EmployeeDto employeeDto = new EmployeeDto();
		employeeDto.setName("Tushar");
		employeeDto.setEmail("Tush@mail.com");
		employeeDto.setCno(8549842498l);

		EmployeeService employeeService = new EmployeeService();
		EmployeeDto e = employeeService.saveEmployee(employeeDto);
		if (e != null) {
			System.out.println(e.getId() + " saved Successfully");
		}
	}

}
