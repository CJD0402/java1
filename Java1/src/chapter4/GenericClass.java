package chapter4;

// Generic
// 클래스나 메서드에서 사용할 데이터 타입을 내부에서 지정하는 것이 아니라
// 외부에서 지정하도록 하는 기능
// 사용하는 이유 : 코드의 재사용성을 보장, 타입의 안정성을 보장
class PersonalInfo1 {
	private String name;
	private int age;
	private int weight;
	private int height;
}

class PersonalInfo2 {
	private String name;
	private int age;
	private double weight;
	private double height;
}

class PersonalInfo3 {
	private String name;
	private int age;
	private double weight;
	private int height;
}

class PersonalInfo4 {
	private String name;
	private int age;
	private int weight;
	private double height;
}

class PersonalInfo5 {
	String name;
	int age;
	Object weight;
	Object height;
}

// Generic class
// 클래스에서 사용할 타입을 클래스 외부에서 받아오는 클래스
// 선언 방법 :
// class 클래스명<매개타입> { ... }
class PersonalInfo<W, H> {
	String name;
	int age;
	private W weight;
	H height;
	
	void setWeight(W weight) {
		this.weight = weight;
	}
	
	W getWeight() {
		return this.weight;
	}
}

public class GenericClass {

	public static void main(String[] args) {
		
		// 속성의 타입을 Object로 지정하여 코드 재사용성 향상
		PersonalInfo5 personalInfo5 = new PersonalInfo5();
		personalInfo5.weight = 10.1;
		personalInfo5.height = 10.15;
		
//		int weight = (Integer) personalInfo5.weight;
		PersonalInfo<Integer, Double> personalInfo = new PersonalInfo<>();
		personalInfo.weight = 10;
		int weight = personalInfo.weight;
		
	}

}



