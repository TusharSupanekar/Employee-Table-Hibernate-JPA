package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.EmployeeDto;

public class EmployeeDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tushar");

	EntityManager entityManager = entityManagerFactory.createEntityManager();

	EntityTransaction entityTransaction = entityManager.getTransaction();

	// To save employee
	public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
		employeeDto.getName();
		employeeDto.getEmail();
		employeeDto.getCno();

		entityTransaction.begin();
		entityManager.persist(employeeDto);
		entityTransaction.commit();
		return employeeDto;
	}

	// To delete employeeById
	public boolean deleteEmployeeById(int id) {
		EmployeeDto employeeDto = entityManager.find(EmployeeDto.class, id);
		if (employeeDto != null) {
			entityTransaction.begin();
			entityManager.remove(employeeDto);
			entityTransaction.commit();
		} else {
			System.out.println("Not deleted");
		}
		if (id > 0) {
			return true;
		} else {
			return false;
		}

	}
	
	//to get employee by id
	public boolean getEmployeeById(int id) {
		EmployeeDto employeeDto = entityManager.find(EmployeeDto.class, id);
		System.out.println(employeeDto.getId());
		System.out.println(employeeDto.getName());
		System.out.println(employeeDto.getEmail());
		System.out.println(employeeDto.getCno());
		if (id > 0) {
			return true;
		} else {
			return false;
		}
	}

	//to update employee by id
	public boolean updateEmployee(int id, long cno) {
		EmployeeDto employeeDto = entityManager.find(EmployeeDto.class, id);
		employeeDto.setCno(cno);
		entityTransaction.begin();
		entityManager.merge(employeeDto);
		entityTransaction.commit();
		if (id > 0) {
			return true;
		} else {
			return false;
		}
	}

	//to get all employee
	public List<EmployeeDto> getAllEmployeeDto() {
		String sql = "SELECT e FROM EmployeeDto e";
		Query query = entityManager.createQuery(sql);
		List<EmployeeDto> employeeDto = query.getResultList();
		return employeeDto;
	}
}
