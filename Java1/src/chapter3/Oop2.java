package chapter3;

class OopTest2 {
	
	int instanceInt;
	String instanceString;
	
}

public class Oop2 {
	
	// 기본형 데이터타입의 매개변수를 받는 메서드
	// 기본형 데이터타입의 매개변수는 값을 직접 복사해서 받기 때문에
	// 호출부에서는 영향을 받지 않음
	static void basicParameterMethod(int argument) {
		argument = 99;
		System.out.println("in method : " + argument);
	}
	
	// 참조형 데이터타입의 매겨변수를 받는 메서드
	// 참조현 데이터타입의 매개변수는 값을 가지고 있는 '주소'를 복사해서 받기 때문에
	// 호출부에서 참조하는 인스턴스에도 영향을 미침
	static void refferencePramenterMethod(OopTest2 argument) {
		argument.instanceInt = 99;
		System.out.println("in method : " + argument.instanceInt);
	}

	public static void main(String[] args) {
		
		int number = 0;
		basicParameterMethod(number);
		System.out.println("out method : " + number);
		
		System.out.println("==================================================");
		OopTest2 object = new OopTest2();
		object.instanceInt = 10;
		object.instanceString = "문자열";
		refferencePramenterMethod(object);
		System.out.println("out method : " + object.instanceInt);
		
	}

}


