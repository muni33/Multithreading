package Sample2;

import java.util.Scanner;

class MultiThreadedprogram extends Thread{
	Scanner sc = new Scanner(System.in);
	public void add() {
		System.out.println("Task-1 Addition Operation Started.....");
		System.out.println("Enter First Number:");
		int a = sc.nextInt();
		System.out.println("Enter Second Number:");
		int b = sc.nextInt();
		int c = a+b;
		System.out.println("Result = "+c);	
	}
	
	public void print() throws InterruptedException {
		System.out.println("Printing operation Started...");
		for(int i = 0; i < 5; i++) {
			System.out.println("Printing....");
			Thread.sleep(3000);
		}
		System.out.println("Printing operation completed...");	
	}
	public void bank() {
		System.out.println("Banking operation Started...");
		System.out.println("Enter acc Number:");
		int acc = sc.nextInt();
		System.out.println("Enter pin Number:");
		int pin = sc.nextInt();
		System.out.println("Banking operation Completed..");
	}
	public void run() {
	if(Thread.currentThread().getName().equals("add")) {
		add();
	}
	else if(Thread.currentThread().getName().equals("printing")) {
		try {
			print();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	else {
		bank();
	}
	}
}

public class ThreadinSingleclass {

	public static void main(String[] args) {
		MultiThreadedprogram M1 = new MultiThreadedprogram();
		MultiThreadedprogram M2 = new MultiThreadedprogram();
		MultiThreadedprogram M3 = new MultiThreadedprogram();
		
		M1.setName("add");
		M2.setName("printing");
		M3.setName("bank");
		
		M1.start();
		M2.start();
		M3.start();		

	}

}
