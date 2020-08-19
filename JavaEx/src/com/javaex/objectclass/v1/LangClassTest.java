package com.javaex.objectclass.v1;

public class LangClassTest {

	public static void main(String[] args) {
		Point p = new Point(10, 20);
		
		// java의 최상위 클래스는 object
		// 모든 클래스는 object 클래스의 모든 기능을 물려 받는다.
		//object로부터 물려받은 내용들
		System.out.println(p.getClass().getSimpleName());
		System.out.println(p.hashCode()); // 객체 식별 코드
		System.out.println(p.toString());
		System.out.println(p); // toString() 코드와 동일
		
		// 부모 정보의 확인
		System.out.println(p.getClass().getSuperclass().getName());
	}
	

}
