package com.javalab.thread.pkg02;

/*
 * Runnable 인터페이스를 구현한 구현 클래스
 * 	- 별도의 파일로 생성
 */

public class MyThread implements Runnable {
	
	// Runnable 인터페이스의 run()메소드 오버라이딩
	@Override
	public void run() {
		// 스레드가 작업할 내용 정의
		System.out.println("MyThread run() 메소드");
	}
}
