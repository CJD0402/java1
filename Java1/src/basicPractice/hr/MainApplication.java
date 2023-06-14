package basicPractice.hr;

import basicPractice.hr.controller.MainController;

// 간단한 인사관리 프로그램
// 인사 등록, 직원 조회(전체, 특정 직원), 직원 정보 수정, 직원 삭제
// [CRUD] : Create, Read, Update, Delete

// 관리할 데이터
// 직원 : 사번, 이름, 주소, 생년월일, 이메일, 부서

// 기능의 세부사항
// 인사등록 : 사번, 이름, 주소, 생년월일, 이메일, 부서를 입력하면 
//          입력한 데이터를 기반으로 저장소에 저장됨
// 직원 조회 (전체) : 저장소에 저장된 직원 정보 리스트를 출력
// 직원 조회 (특정 직원) : 사번을 입력하면 입력한 사번에 해당하는 직원 정보를 출력
// 직원 정보 수정 : 사번을 입력하고 이름, 주소, 생년월일, 이메일, 부서를 입력하면
//               입력한 데이터를 기반으로 해당 사번의 직원 정보를 수정
// 직원 삭제 : 사번을 입력하면 해당하는 사번의 직원 정보를 저장소에서 제거

public class MainApplication {

	public static MainController mainController; 
	
	public static void main(String[] args) {
		
		
		
	}

}


