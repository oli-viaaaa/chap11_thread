package com.javalab.thread.pkg03;

public class ThreadEx03 {

	public static void main(String[] args) {
//		ThreadEx2_1 t1 = new ThreadEx3_1();
//
//		Runnable r = new ThreadEx3_2();
//		Thread t2 = new Thread(r); // 생성자 Thread(Runnable target)
//
//		t1.start(); // 스레드 이름 : Thread-0
//		t2.start(); // 스레드 이름 : Thread-1
		
		// 싱글스레드
		for (int i = 0; i < 100; i++) {
			System.out.print(0); // 조상인 Thread의 getName()을 호출
		}
		System.out.println();
		
		for (int i = 0; i < 100; i++) {
			System.out.print(1);
		}
		
		
	}

}
