package Sample2;
class Queue1{
	static boolean is_value_present = false;
	synchronized public void put(int i) throws InterruptedException {
	if (is_value_present == true) {
		wait();
	}
	else {
		System.out.println("Data added, the data is"+i);
			is_value_present = true;
			notify();
		}
	}
	
	synchronized public void get(int i) throws InterruptedException {
		if(is_value_present == false) {
			wait();
		}
		else {
			System.out.println("Data consumed, the data is"+i);
			is_value_present = false;
			notify();
		}
	}
}

class Producer1 extends Thread{
	Queue1 a;
	int i = 1;
	Producer1(Queue1 q1){
		a = q1;
	}
	@Override 
	public void run() {
	while(true) {
		try {
			a.put(i++);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
class Consumer1 extends Thread{
	Queue1 b;
	int i =1;
	Consumer1(Queue1 q1){
		b = q1;
	}
	public void run() {
	while(true) {
		try {
			b.get(i++);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
public class Producerconsumersolution {
	public static void main(String[] args) {
		Queue1 q1 = new Queue1();
		Producer1 P = new Producer1(q1);
		Consumer1 C = new Consumer1(q1);
		P.start();
		C.start();
		
	}

}
