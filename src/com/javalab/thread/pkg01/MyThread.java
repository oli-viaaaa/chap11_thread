package com.javalab.thread.pkg01;

/**
 * 자바의 Thread(스레드) 클래스를 상속받은 자식 클래스
 * 	- 별도의 파일로 생성
 */

public class MyThread extends Thread{

	// 생성자
	public MyThread() {
		System.out.println("MyThread 생성자");
	}
	
	// Thread 클래스의 run()메소드 오버라이딩
	@Override
	public void run() {
		// 스레드가 작업할 내용 정의
		System.out.println("MyThread run() 메소드");
	}
}

