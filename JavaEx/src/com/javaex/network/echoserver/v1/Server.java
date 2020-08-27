package com.javaex.network.echoserver.v1;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		// 1. 서버 소켓 생성
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			// 2. bind(주소, 포트 연결)
			InetSocketAddress local = 
					new InetSocketAddress ("127.0.0.1", 10000);// localhost, port
					
			System.out.println("<서버 시작>");
			System.out.println("[연결을 기다립니다.]");
			// 3. 접속 대기
			Socket socket = serverSocket.accept();
			// 접속 후 처리 : 클라이언트 정보 확인
			
			InetSocketAddress client = (InetSocketAddress) socket.getRemoteSocketAddress();
			
			System.out.println("[클라이언트가 연결되었습니다.]");
			System.out.println(client.getAddress() + ":" + client.getPort());
			
			//후처리
			System.out.println("================");
			System.out.println("<서버 종료>");
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			//서버 소캣 닫기
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
