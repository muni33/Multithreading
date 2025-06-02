package Sample2;
import java.util.Scanner;
public class SingleThreadProgram {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Task-1 Addition Operation Started.....");
		System.out.println("Enter First Number:");
		int a = sc.nextInt();
		System.out.println("Enter Second Number:");
		int b = sc.nextInt();
		int c = a/b;
		System.out.println("Result = "+c);
		System.out.println("Printing operation Started...");
		for(int i = 0; i < 5; i++) {
			System.out.println("Printing....");
			Thread.sleep(3000);
		}
		System.out.println("Printing operation completed...");
		System.out.println("Banking operation Started...");
		System.out.println("Enter acc Number:");
		int acc = sc.nextInt();
		System.out.println("Enter pin Number:");
		int pin = sc.nextInt();
		System.out.println("Banking operation Completed..");
		
	}

}
