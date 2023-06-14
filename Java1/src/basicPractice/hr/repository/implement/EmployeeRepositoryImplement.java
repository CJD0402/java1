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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeEntity findByEmployeeNumber(String employeeNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
