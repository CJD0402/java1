package basicPractice.hr.repository;

import java.util.ArrayList;
import java.util.List;

import basicPractice.hr.entity.EmployeeEntity;

public interface EmployeeRepository {
	
	List<EmployeeEntity> employeeList = new ArrayList<>();

	boolean save(EmployeeEntity employeeEntity);
	boolean delete(EmployeeEntity employeeEntity);
	
	List<EmployeeEntity> findAll();
	EmployeeEntity findByEmployeeNumber(String employeeNumber);
	
}
