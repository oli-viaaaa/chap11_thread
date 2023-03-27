package com.javalab.thread.pkg02;

/*
 * 실행 클래스
 * 	- 별도의 Runnable 인터페이스를 구현한 클래스를 만들지 않고 익명 구현 객체를 만들어서 스레드 구현
 */

public class ThreadMain02 {

	public static void main(String[] args) {

		// 1. 위에서 정의 해놓은 MyThread 클래스를 객체로 생성
		// Runnable rb = new MyThread();

		// 2. Runnable을 구현하는 구현 객체를 Thread 클래스의 생성자로 전달
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Runnable을 구현한 익명 구현 객체");
			}
		});

		// 스레드 실행
		t1.start();

	}

}
