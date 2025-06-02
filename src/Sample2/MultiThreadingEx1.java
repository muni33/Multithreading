package Sample2;


class Mythread extends Thread{
	public void run() {
	for (int i = 0;i < 5; i++) {
		System.out.println("Printing....");
	}
}
}

public class MultiThreadingEx1 {

	public static void main(String[] args) {
		Mythread mt = new Mythread();
		mt.start();
		for(int i = 0; i < 5; i++) {
			System.out.println("Main method...");
		}

	}

}
