package com.javaex.basic;

public class TypeEx {

	public static void main(String[] args) {
		//intLongTest();
		//floatDoubleTest();]
	    //booleanEx();
		//charEx();
		 constantEx();
	}
	//상수 연습(Constant)
	public static void constantEx() {
		// 변하지 않는 값
		// final을 선언부 앞에 붙이면 된다.
		// 상수 식별자는 모두 대문자, 여러 단어 결합시 단어 사이에 _
		final double PI = 3.14159;
		// 1. 코드의 가독성
		// 2. 코드의 유지 보수의 장점
		final int SPEED_LIMIT = 110;
		
		System.out.println("PI = " + PI);
		System.out.println("제한속도  = " + SPEED_LIMIT);
		
		//System.out.println("제한 속도=" + 110);
	}
	

	//chat 형 연습
	public static void charEx() {
		//2바이트(부호 없음)
		//유니코드 한 글자의 수치화된 코드
		// ' <- char
		//""<- string
		char ch1 = 'A';
		char ch2 = '한';
		
		System.out.println("A -> " + ch1);
		System.out.println("한 -> " + ch2);
		
		System.out.println(ch1 + ch2);
	}
	// boolean 연숩
	public static void booleanEx() {
		// 논리값 true or false
		// 비교 연산, 논리 연산의 흐름의 결과를 반환
		// 흐름 제어, 반복에서 흐름을 제어할 때 이 값을 사용한다.
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1);
		System.out.println(b2);
		
		int v1 = 3;
		int v2 = 5;
		
		boolean result = v1 < v2;
		
		System.out.println("v1 < v2 ?" +result);
	}
	public static void floatDoubleTest() {
		//정밀도를 포기하고 표현 범위를 넓힌 자료형.
		float fVar = 3.14159F;
		double dVar = 3.14159;
		
		fVar = 0.1234567890123456789F;
		dVar = 0.1234567890123456789;
		
		System.out.println("flaot:" + fVar);
		System.out.println("double:" + dVar);
		
		//지수 표기법
		fVar =1234567890E-10F; // 0.1234567890 E-10F는 10의 -10승이다.
		System.out.println(fVar);
		// 실수 자료형의 처리는 정밀도가 떨어진다.(표현 범위를 넓힘 )
		System.out.println(0.1*3);
	}
	
	// 정수형 연습
	// byte short int long
	public static void intLongTest() {
		
		int intVar1; // 변수 선언
		intVar1 = 2020; //초기화 작업
		
		int intVar2 = 2020;
		
		System.out.println(intVar1);
		System.out.println(intVar2);
		
		//long:8byte
		long longVar1;
		longVar1 = 2020;
		long longVar2 =1234567890123455667L;//long은 L꼭 붙혀야함.
		
		System.out.println(longVar1);
		System.out.println(longVar2);
		
		// 2진수(1bit 사용), 8진수, 16진수
		int bin = 0b1100; // 2진수 0b로 시작
		int oct = 010;  //8진수 0으로 시작
		int hex = 0xFF; // 16진수는 0x 시작
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
	}
}
