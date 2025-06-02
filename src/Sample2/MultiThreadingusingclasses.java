package Sample2;
import java.util.Scanner;
class Thread1 extends Thread{
	Scanner sc = new Scanner(System.in);
	public void run() {
		System.out.println("Task-1 Addition Operation Started.....");
		System.out.println("Enter First Number:");
		int a = sc.nextInt();
		System.out.println("Enter Second Number:");
		int b = sc.nextInt();
		int c = a+b;
		System.out.println("Result = "+c);
	}
}

class Thread2 extends Thread{
	Scanner sc = new Scanner(System.in);
	public void run() {
	System.out.println("Printing operation Started...");
	for(int i = 0; i < 5; i++) {
		System.out.println("Printing....");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	System.out.println("Printing operation completed...");
}
}

class Thread3 extends Thread{
	public void run() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Banking operation Started...");
	System.out.println("Enter acc Number:");
	int acc = sc.nextInt();
	System.out.println("Enter pin Number:");
	int pin = sc.nextInt();
	System.out.println("Banking operation Completed..");
}
}
public class MultiThreadingusingclasses {
	public static void main(String args[]) throws InterruptedException {
	
	Thread1 t1 = new Thread1();
	Thread2 t2 = new Thread2();
	Thread3 t3 = new Thread3();
	
	t1.start();
	t1.join();
	t2.start();
	t2.join();
	t3.start();
	t3.join();

}
}
