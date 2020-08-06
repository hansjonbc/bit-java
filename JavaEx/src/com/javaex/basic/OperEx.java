package com.javaex.basic;

// 연산자 연습
public class OperEx {

	public static void main(String[] args) {
		//arithOper();
		//incDecOper();
		logicalOper();

	}

	//비교, 논리 연산
	public static void logicalOper() {
		// 비교 연산자 >, >=, <, <=
		// ==(같다), !=(같지않다)
		
		// 논리연산자: &&(논리곱:AND)
		//          ||(논리합:OR)
		//          !(논리부정)
		int n = 5;
		// n은 0초과 10미만인가?
		// 조건1: n>0이고
		// 조건2: n<10
		boolean b1= n > 0;
		boolean b2 = n < 10;
		boolean r = b1 && b2;		
		System.out.println("n < and n < 10 ?" + r);
		
		// n은 0이하이거나, 10 이상인가?
		// 조건1: n <= 0이거나(or)
		// 조건2: n >= 10
		b1 = n <= 0;
		b2 = n >= 10;
		r = b1 || b2;
		
		System.out.println("n <= 0 or b >= 10 ? " + r);
	}
	// 증가, 감소 연산자
	public static void incDecOper() {
		int a = 5; // a++
		int b = 5;// ++b
		
		// 후위연산자
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		
		// 전위 연산자
		System.out.println(b);
		System.out.println(++b);
		System.out.println(b);
	}
	// 산술 연산자
	public static void arithOper() {
		// 사칙연산 : +,-,*,/
		int a = 7;
		int b = 3;
		
		System.out.println("7/3 => "+(7/3));
		
		//int /int => int(몫)
		System.out.println("7/3의  나머지 =>" +(7%3));
		
		//나머지 연산자%
		System.out.println("7 / 3 실수 =>" + ((float)a / (float)b));
		
		// 만약 정수를 0으로 나누면
		// ArithmetickExcepion 에러
		//System.out.println("정수 나누기0 =>" +);
		
		//실수를 0으로 나눈다. => 무한대
		System.out.println("실수 / 0 =>" + (4.0 / 0));
		//무한대에 산술 연산
		System.out.println("무한대의 산술 =>"+ (4.0/0 + 10));
		// 연산 => 계산할 수 없는 값(NaN -> Not a Number)
		System.out.println("0.0 / 0.0 =>" +(0.0 / 0.0));
		//NaN 포함된 산술 연산 -> NaN(계산 불가) 
		System.out.println("NaN 산술 =>" + (0.0 / 0.0 + 20));
		//유한수인지 확인
		System.out.println("유한수의 확인 :"+ Double.isFinite(4.0 / 0));
		//NaN인지 확인
		//System.out.println("NaN 확인  =>"+ Double.i);
	}
}
