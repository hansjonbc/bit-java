package com.javaex.basic;
//데이터 타입을 다른 데이터 타입으로 변경(Casting)
//1. 좁은 범위 데이터 -> 넓은 범위 데이터 (promotion)
//2. 넓은 범위 데이터 -> 좁은 범위 데이터 (Casting)
public class CastingEx {

	//자료형
	//byte(1)<short(2)<int(4)<long(8)
	  // <<float (4)<<double(8)
	public static void main(String[] args) {
		//promotionEx();
		castingEx();

	}
	public static void castingEx() {
		// explicit casting(명시적 변환)
		// 표현 범위 넓은 타입 -> 좁은 타입으로의 변환
		// 개발자가 명시적으로 변활할 자료형을 지정
		
		float f = 1234.5678F;
		System.out.println("flaot:" +f);
		
		long l = (long)f;
		System.out.println("-> long:" +l);
		
		byte b = (byte)l;
		System.out.println("-> byte:" +b);
	}
	
	public static void promotionEx() {
		//implicit casting(암묵적 변환)
		//표현 범위가 좁은 타입 -> 넓은 타입으로의 변환
		byte b = 25;
		System.out.println("바이트:"+b);
		
		short s = b;
		System.out.println("short:" +s);
		
		int i = s;
		System.out.println("int:" +i);
		
		long l = i;
		System.out.println("long:" +l);
		
		
	}

}
