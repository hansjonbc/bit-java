package com.javaex.oop.staticmembers;

//scope 연습
public class StaticEx {

	public static int refCount; // 클래스 변수 : static
	public static String classVar; // 클래스 변수
	public String instanceVar; // 인스턴스 변수
	
	//static 영역의 초기화
	static {
		refCount = 0;
		classVar = "Static Member";
		//instanceVar = "Static Member";
		//static 영역에서 instance 영역에 접근 불가
		// instance 영억에는 static 영역에 접근 가능
		System.out.println("Static Block");
	}
	// 생성자
	public StaticEx() {
		refCount++;
		instanceVar = "Instance Member";
		System.out.println("refCount:" + refCount);
		System.out.println("인스턴스 생성");
	}
	// 소멸자
	protected void finalize() throws Throwable {
		refCount--;
		super.finalize();
		System.out.println("소멸자 호출");
	}
}
