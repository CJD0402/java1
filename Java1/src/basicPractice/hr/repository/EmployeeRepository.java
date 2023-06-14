package basicPractice.hr.repository;

import basicPractice.hr.entity.EmployeeEntity;

public interface EmployeeRepository {
	
	EmployeeEntity[] employeeList = new EmployeeEntity[5]; 

	boolean save(EmployeeEntity employeeEntity);
	boolean delete(EmployeeEntity employeeEntity);
	
	EmployeeEntity[] findAll();
	EmployeeEntity findByEmployeeNumber(String employeeNumber);
	
}
