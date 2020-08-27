package com.javaex.network.echoserver.v1;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		// 1. Socket 생성
		Socket socket = null;
		
		try {
			socket = new Socket();
			
			System.out.println("<클라이언트 시작>");
			System.out.println("[연결을 요청합니다.]");
			
			// 2. 서버 정보 확보
			InetSocketAddress remote = new InetSocketAddress("127.0.0.1", 10000);
			
			// 3. 서버에 접속 시도
			socket.connect(remote); // connect 시도
			
			System.out.println("[서버에 연결 되었습니다.]");
			
			//종료
			System.out.println("<클라이언트 종료>");
		} catch (ConnectException e) {
			System.err.println("[접속이 거부되었습니다.]");
		} catch (IOException e) {
			e.printStackTrace();
		}  finally {
			try {
				socket.close();	// 자원 정리
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		}
	}
}

	

