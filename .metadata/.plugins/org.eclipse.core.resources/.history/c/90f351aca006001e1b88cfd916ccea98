package chapter3;

// 상속
// 하나의 클래스가 다른 클래스의 속성과 메서드를 이어받는 것
// 상속해주는 클래스를 super / parent class라고 함 (상위, 부모, 조상 클래스)
// 상속받는 클래스를 sub / child class라고 함 (하위, 자식, 자손 클래스)

// 상속을 통해 코드의 중복을 제거하여 유지 보수성을 향상 시킬 수 있음

// 상속을 하는 방법
// 접근제어자 class 자식클래스명 extends 부모클래스명 { 필드, ..., 메서드, ... }

class Human {
	String name;
	String address;
	String telNumber;
	
	// 생성자는 상속하지 못함
	Human() {}
	
	Human(String name, String address, String telNumber) {
		this.name = name;
		this.address = address;
		this.telNumber = telNumber;
	}
}

// 직업군에 관련된 클래스 3개
class Police extends Human {
	String classes;
	
	void print() {
		System.out.println("name : " + this.name);
		System.out.println("address : " + this.address);
		System.out.println("telNumber : " + this.telNumber);
		System.out.println("classes : " + this.classes);
	}
}

// class의 상속은 단일 상속만 지원함
// 다중 상속을 허용했을 때 발생 가능한 다이아몬드 문제의 원인을 제거할 수 있음
// 다이아몬드 문제 : 두 개 이상의 클래스를 상속했을 때, 각 클래스가 동일한 이름의 
// 속성 혹은 메서드를 가지고 있다면 어떤 속성 혹은 메서드를 호출할지 모호해 지는 문제 

//class DutyPolice extends Police, Developer {
//	int periodMonth;
//	
//	void print() {
//		System.out.println("name : " + this.name);
//		System.out.println("address : " + this.address);
//		System.out.println("telNumber : " + this.telNumber);
//		System.out.println("classes : " + this.classes);
//	}
//}

class Developer extends Human {
	String position;
}

class SalesMan extends Human {
	int salesAmount;
}

public class Oop3 {

	public static void main(String[] args) {
		
		Police police = new Police();
		police.address = "부산광역시";
		police.classes = "상경";
		
	}

}





