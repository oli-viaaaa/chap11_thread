package com.javalab.thread.pkg05;

public class ThreadSyncAfter {

	public static void main(String[] args) {
		Runnable r = new RunnableEx22();
		// 두 개의 스레드를 생성/실행시켜서 경쟁적으로 출금
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
	}
}

// 은행 계정 클래스
class AAccount {
	private int balance = 1000; //초기 잔액을 1000으로 세팅
	
	// 잔액 확인 메소드
	public int getBalance() {
		return balance;
	}
	
	/**
	 * [동기화(synchronized)]
	 * 	 - 하나의 스레드가 출금 메소드를 사용중이면 다른 스레드가 잠시 대기하도록 synchronized(동기화) 한다.
	 * 		실행중인 작업이 끝나야 다음 스레드가 출금을 진행한다
	 * 
	 */
	public synchronized void withdraw(int money) {
		if (balance >= money) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			balance -= money; // 잔액 - 출금액 차감
		}
	}
}

// 출금을 실행하는 스레드 클래스
class RunnableEx22 implements Runnable{
	Account1 acc = new Account1(); // 은행 계정 객체 생성
	
	public void run() {
		while(acc.getBalance() > 0) { // 은행 계정 클래스에서 잔액 확인
			int money = (int)(Math.random()*3+1)*100;
			 acc.withdraw(money);
			System.out.println("balance : " + acc.getBalance());
		}
	}
}