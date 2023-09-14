package service;

import java.util.List;

import dao.EmployeeDao;
import dto.EmployeeDto;

public class EmployeeService {
	EmployeeDao employeeDao = new EmployeeDao();

	public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
		EmployeeDto e = employeeDao.saveEmployee(employeeDto);
		return e;
	}

	public boolean deleteEmployeeById(int id) {
		EmployeeDao employeeDao = new EmployeeDao();
		boolean e = employeeDao.deleteEmployeeById(id);
		return e;
	}

	public boolean getEmployeeById(int id) {
		EmployeeDao employeeDao = new EmployeeDao();
		boolean e = employeeDao.getEmployeeById(id);
		return e;
	}

	public boolean updateEmployee(int id, long cno) {
		EmployeeDao employeeDao = new EmployeeDao();
		boolean e = employeeDao.updateEmployee(id, cno);
		return e;
	}

	public List<EmployeeDto> getAllEmployeeDto() {
		EmployeeDao employeeDao = new EmployeeDao();
		List<EmployeeDto> e = employeeDao.getAllEmployeeDto();
		return e;
	}

}
