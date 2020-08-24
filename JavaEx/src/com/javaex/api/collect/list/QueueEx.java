package com.javaex.api.collect.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		// Queue 자료형
		// First In First Out (선입선출)
		// Queue는 인터페이스만 제공
		// 실체 클래스는 Linkedlist 클래스를 이용
		Queue<Integer> queue = new LinkedList<>();

		for (int i =0; i <= 10; ++i) {
			queue.offer(i);
		}
		
		System.out.println("QUEUE: " + queue);
		
		//인출 : 방향의 확인
		System.out.println("dequeue: " + queue.poll());
		System.out.println("QUEUE: " + queue);
		
		System.out.println("peek: " + queue.peek());
		System.out.println("QUEUE: " + queue);
		
		//전체 데이터의 인출
		// poll 할 떄는 isEmpty로 체크 필
		while(!queue.isEmpty()) {
			System.out.println("POLL: " + queue.poll());
		}
		}
			
}


