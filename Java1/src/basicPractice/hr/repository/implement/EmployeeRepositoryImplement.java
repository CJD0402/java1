package basicPractice.hr.repository.implement;

import basicPractice.hr.entity.EmployeeEntity;
import basicPractice.hr.repository.EmployeeRepository;

public class EmployeeRepositoryImplement implements EmployeeRepository {
	
	@Override
	public boolean save(EmployeeEntity employeeEntity) {
		EmployeeEntity[] list = EmployeeRepository.employeeList;
		
		boolean result = false;
		
		for (int index = 0; index < list.length; index++) {
			if (list[index] == null) {
				list[index] = employeeEntity;
				result = true;
				break;
			}
			
			EmployeeEntity item = list[index];
			boolean isEqualEmployeeNumber = 
					item.getEmployeeNumber().equals(employeeEntity.getEmployeeNumber());
			if (isEqualEmployeeNumber) {
				list[index] = employeeEntity;
				result = true;
				break;
			}
		}
		
		return result;
	}

	@Override
	public boolean delete(EmployeeEntity employeeEntity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EmployeeEntity[] findAll() {
		EmployeeEntity[] result = EmployeeRepository.employeeList;
		return result;
	}

	@Override
	public EmployeeEntity findByEmployeeNumber(String employeeNumber) {
		EmployeeEntity result = null;
		
		EmployeeEntity[] employeeList = EmployeeRepository.employeeList;
		for (EmployeeEntity employeeEntity: employeeList) {
			if (employeeEntity == null) break;
			
			boolean isEqualEmployeeNumber = 
					employeeEntity.getEmployeeNumber().equals(employeeNumber);
			
			if (isEqualEmployeeNumber) {
				result = employeeEntity;
				break;
			}
		}
		
		return result;
	}

}


