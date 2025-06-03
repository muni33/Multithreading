package Sample2;
class Queue{
	int data;
	public void put(int i) {
		data = i;
		System.out.println("Data added, The value is"+data);
	}
	public void get(int i) {
		System.out.println("Data consumed, The value is"+i);
	}
}

class Producer extends Thread{
	Queue a;
	Producer(Queue q){
		a = q;
	}
	@Override
	public void run() {
		int i = 1;
		while(true) {
			a.put(i++);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Consumer extends Thread{
	Queue b;
	Consumer (Queue q){
		b = q;
	}
	@Override
	public void run() {
		int i = 1;
		while(true) {
			b.get(i++);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ProducerConsumer {

	public static void main(String[] args) {
		Queue q = new Queue();
		Producer P = new Producer(q);
		Consumer C = new Consumer(q);
		
		P.start();
		C.start();
	}

}
