package basicPractice.hr.controller.implement;

import basicPractice.hr.controller.MainController;
import basicPractice.hr.dto.PatchEmployeeRequestDto;
import basicPractice.hr.dto.PostEmployeeRequestDto;

public class MainControllerImplement implements MainController {

	@Override
	public void postEmployee(PostEmployeeRequestDto dto) {
		// 필수로 입력해야하는 입력 값이 모두 입력 되었는지 확인
		boolean validated = dto.isValidate();
		
		// 만약에 필수 입력이 모두 입력되지 않았으면 알림 출력 후 메서드 종료
		if (!validated) {
			System.out.println("모든 값을 입력하세요.");
			return;
		}
		
		// 입력 값이 모두 입력되었다면 실제 비즈니스 로직을 실행하여 결과를 반환 받음
		
		// 결과를 출력
		
	}

	@Override
	public void getEmployeeList() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getEmployee(String employeeNumber) {
		// TODO Auto-generated method stub

	}

	@Override
	public void patchEmployee(PatchEmployeeRequestDto dto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEmployee(String employeeNumber) {
		// TODO Auto-generated method stub

	}

}
