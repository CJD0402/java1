package chapter3;

// 외부 패키지에 선언된 클래스를 사용하기 위해서는 import 키워드로
// 해당 클래스에 불러와야함
import chapter3etc.ExampleClass1;

// 접근 제어자
// 클래스의 필드와 메서드에 대한 접근을 제한하는 것

// public : 같은 프로젝트 내부의 모든 패키지에서 접근이 가능
// protected : 같은 패키지 내부의 모든 클래스에서 접근이 가능하고 해당 클래스를 상속받은 다른 패키지의 클래스에서 접근이 가능
// default (지정하지 않음) : 같은 패키지 내부의 모든 클래스에서 접근이 가능
// private : 같은 클래스 내부에서만 접근이 가능
public class Oop4 {

	public static void main(String[] args) {
		
		ExampleClass1 exampleClass1 = new ExampleClass1();
		ExampleClass2 exampleClass2 = new ExampleClass2();
		
		// chapter3etc 패키지에 선언된 ExampleClass1의 publicVariable 필드는
		// 접근 제어자가 public 이기 때문에 어떤 패키지에서도 접근이 가능
		exampleClass1.publicVariable = "public";
		// chapter3etc 패키지에 선언된 ExampleClass1의 protectedVariable 필드는
		// 접근 제어자가 protected 이기 때문에 외부 패키지에서는 접근이 불가능
		exampleClass1.protectedVariable = "protected";
		exampleClass2.protectedVariable = "protected";
		// 같은 패키지에 선언된 ExampleClass2의 protectedVariable2 필드는
		// 접근 제어자가 protected 이기 때문에 접근이 가능
		exampleClass2.protectedVariable2 = "protected";
		// chapter3etc 패키지에 선언된 ExampleClass1의 defaultVariable 필드는
		// 접근 제어자가 default 이기 때문에 외부 패키지에서는 접근이 불가능
		exampleClass1.defaultVariable = "default";
		exampleClass2.defaultVariable = "default";
		// 같은 패키지에 선언된 ExampleClass2의 defaultVariable2 필드는
		// 접근 제어자가 default 이기 때문에 접근이 가능
		exampleClass2.defaultVariable2 = "default";
		// chapter3etc 패키지에 선언된 ExampleClass1의 privateVariable 필드는
		// 접근 제어자가 private 이기 때문에 외부 클래에서는 접근이 불가능
		exampleClass1.privateVariable = "private";
		exampleClass2.privateVariable = "private";
		// 같은 패키지에 선언된 ExampleClass2의 privateVariable2 필드는
		// 접근 제어자가 private 이기 때문에 같은 패키지 내부라 해도 접근이 불가능
		exampleClass2.privateVariable2 = "private";
		
	}

}

class ExampleClass2 extends ExampleClass1 {
	
	protected String protectedVariable2;
	String defaultVariable2;
	private String privateVariable2;
	
	ExampleClass2 () {
		// ExampleClass1에 protected로 지정되어있는 protectedVariable은
		// 해당 클래스가 ExampleClass1을 상속받았기 때문에 접근 가능
		super.protectedVariable = "protected";
		// ExampleClass1에 default로 지정되어있는 defaultVariable은
		// 해당 클래스가 ExampleClass1을 상속받았더라도 접근이 불가능
		super.defaultVariable = "default";
		// private으로 지정되어 있는 privateVariable2는
		// 해당 클래스 내에서만 접근 가능
		this.privateVariable2 = "private";
	}
	
	void print() {
		System.out.println(super.protectedVariable);
	}
	
}














