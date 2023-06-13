package chapter3;

// 다형성
// 하나의 객체 혹은 기능을 다양한 형태로 표현하는 것
// 클래스의 확장, 인터페이스의 확장 및 구현을 통해서 이루어질 수 있음

// Java에서 다루는 다형성에는 오버로딩, 오버라이딩, 업캐스팅, 다운캐스팅
// 오버로딩 : 메서드를 하나의 이름으로 여러 개 생성하는 것
// 오버라이딩 : 상위 클래스에 정의된 메서드를 재정의하는 것

// 업캐스팅 : 자손 클래스의 인스턴스를 부모 클래스의 참조 타입으로 변환 (자동)
// 다운캐스팅 : 부모 클래스의 인스턴스를 자손 클래스의 참조 타입으로 변환 (명시)
class SmartPhone {
	String telNumber;
	boolean power;
}

class Galaxy extends SmartPhone {
	String bixby;
}

class IPhone extends SmartPhone {
	int shiri;
}

public class Oop8 {

	public static void main(String[] args) {
		Galaxy galaxy = new Galaxy();
		IPhone iPhone = new IPhone();
		
		System.out.println(galaxy);
		
		galaxy.bixby = "bixby";
		iPhone.shiri = 1111;
		
		SmartPhone smartPhone = null;
		SmartPhone smartPhone2 = new SmartPhone();
		
		smartPhone = galaxy;
		// smartPhone.bixby = "b";
		System.out.println(smartPhone);
		
		smartPhone2 = iPhone;
		// smartPhone2.shiri = 1;
		
		
		Galaxy galaxy2 = (Galaxy) smartPhone;
		IPhone iPhone2 = (IPhone) smartPhone2;

		System.out.println(galaxy2);
		System.out.println(galaxy2.bixby);
		System.out.println(iPhone2.shiri);
	}

}





