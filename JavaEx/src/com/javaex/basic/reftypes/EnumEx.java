package com.javaex.basic.reftypes;

public class EnumEx {

	public static void main(String[] args) {
		
		//usingEnum();
		usingEnum2();

	}
	public static void usingEnum2( ) {
		//요일 정보가 있을 때
		// sunday ->  휴식
		// monday ~ thursday => 열골
		//friday -> 불금
		//saturday -> 늦잠
		WeekDay dow = WeekDay.TUESDAY;
		String act;
		
		switch(dow) {
		case SUNDAY:
			act = "휴식";
			break;
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
			act = "열공";
			break;
		case FRIDAY:
			act = "불금";
			break;
		case SATURDAY:
			act = "늦잠";
			break;
		default:
			act = "?";
			
		}
	}
	public static void usingEnum( ) {
		WeekDay dow = WeekDay.TUESDAY;
		
		//열거형
		System.out.printf("오늘은 %s(%d)입니다%n",dow.name(),dow.ordinal());
		
		String str = "SUNDAY";
		WeekDay obj = WeekDay.valueOf(str);
		
		System.out.printf("문자열 %s는 열거상수 %d%n", str, obj.ordinal());
	}
	
}
