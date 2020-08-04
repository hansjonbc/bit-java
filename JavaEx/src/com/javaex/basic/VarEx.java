package com.javaex.basic;

// 변수 선언 연습
/**
 * @author MSDN
 *
 */
public class VarEx {
 
	public static void main(String[] arge) {
		//변수 식별자
		// 문자, 숫자, $,_ 의 조합
		//다만, 숫자로 시작하면 안됨
		
		/*
		 * 변수명 관례
		 * - 변수명은 소문자로 작성
		 * - 단어의 조합일 경우  두 번째 단어는 대문자로 시작
		 */
		// 선언
		int myAge; // myAge라는 이름의 int (4byte) 변수 공간을 만든다.
		//초기화
		myAge = 29;
		
		int myAge2 = 29; // 선언과 초기화를 동시에 할 수 있다 추천
		
		//변수의 경우 선언시 지정한 데이터 타입 이외의 데이터는 넣을 수 없다.
		//myAge = 13245677899012341//error
				
		//조회와 변경
		System.out.println("myAge의 내용:" + myAge);
		myAge = myAge +1;
		
		System.out.println("변경된 myAge의 내용:" + myAge);
	}
}
