package basicPractice.hr.service;

import basicPractice.hr.dto.PatchEmployeeRequestDto;
import basicPractice.hr.dto.PostEmployeeRequestDto;

// 인사등록 : 사번, 이름, 주소, 생년월일, 이메일, 부서를 입력하면 
//          입력한 데이터를 기반으로 저장소에 저장됨
// 직원 조회 (전체) : 저장소에 저장된 직원 정보 리스트를 출력
// 직원 조회 (특정 직원) : 사번을 입력하면 입력한 사번에 해당하는 직원 정보를 출력
// 직원 정보 수정 : 사번을 입력하고 이름, 주소, 생년월일, 이메일, 부서를 입력하면
//               입력한 데이터를 기반으로 해당 사번의 직원 정보를 수정
// 직원 삭제 : 사번을 입력하면 해당하는 사번의 직원 정보를 저장소에서 제거
public interface MainService {

	boolean postEmployee(PostEmployeeRequestDto dto);
	void getEmployeeList();
	void getEmployee(String employeeNumber);
	boolean patchEmployee(PatchEmployeeRequestDto dto);
	boolean deleteEmployee(String employeeNumber);
	
}





