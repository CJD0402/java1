package basicPractice.hr.service.implement;

import basicPractice.hr.dto.GetEmployeeListResponseDto;
import basicPractice.hr.dto.GetEmployeeResponseDto;
import basicPractice.hr.dto.PatchEmployeeRequestDto;
import basicPractice.hr.dto.PostEmployeeRequestDto;
import basicPractice.hr.entity.EmployeeEntity;
import basicPractice.hr.repository.EmployeeRepository;
import basicPractice.hr.service.MainService;

public class MainServiceImplement implements MainService {

	private final EmployeeRepository employeeRepository;
	
	public MainServiceImplement(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	@Override
	public boolean postEmployee(PostEmployeeRequestDto dto) {
		// 입력한 데이터를 저장소에 저장
		EmployeeEntity employeeEntity = new EmployeeEntity(dto);
		boolean result = employeeRepository.save(employeeEntity);
		return result;
	}

	@Override
	public GetEmployeeListResponseDto[] getEmployeeList() {
		EmployeeEntity[] employeeEntityList = employeeRepository.findAll();
		
		GetEmployeeListResponseDto[] result = GetEmployeeListResponseDto.copyList(employeeEntityList);
		return result;
		
	}

	@Override
	public GetEmployeeResponseDto getEmployee(String employeeNumber) {
		EmployeeEntity employeeEntity = employeeRepository.findByEmployeeNumber(employeeNumber);
		if (employeeEntity == null) return null;
		
		GetEmployeeResponseDto result = new GetEmployeeResponseDto(employeeEntity);
		return result;
	}

	@Override
	public boolean patchEmployee(PatchEmployeeRequestDto dto) {
		boolean result = false;
		
		String employeeNumber = dto.getEmployeeNumber();
		// 입력한 사번에 대한 사원이 존재하는지
		EmployeeEntity employeeEntity = employeeRepository.findByEmployeeNumber(employeeNumber);
		if (employeeEntity == null) return result;
		
		employeeEntity = new EmployeeEntity(dto);
		
		result = employeeRepository.save(employeeEntity);
		return result;
	}

	@Override
	public boolean deleteEmployee(String employeeNumber) {
		// TODO Auto-generated method stub
		return false;
	}

}
