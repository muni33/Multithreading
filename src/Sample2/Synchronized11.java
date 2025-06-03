package Sample2;
class Warriors extends Thread{
	static String res1 = "Book";
	static String res2 = "Pencil";
	static String res3 = "Eraser";
	
	public void run() {
		if(Thread.currentThread().getName().equals("student1")) {
			try {
				Student1acq();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			
			try {
				Student2acq();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	
	public static void Student1acq() throws InterruptedException {
		synchronized(res1) {
			System.out.println("Student1 have"+res1);
			Thread.sleep(2000);
		synchronized(res2) {
			System.out.println("Student1 have"+res2);
			Thread.sleep(2000);
		synchronized(res3) {
			System.out.println("Student1 have"+res3);
			Thread.sleep(2000);		
		}
	}
	}
	}
	
	public static void Student2acq() throws InterruptedException {
		synchronized(res1) {
			System.out.println("Student2 have"+res1);
			Thread.sleep(2000);
		synchronized(res2) {
			System.out.println("Student2 have"+res2);
			Thread.sleep(2000);
		synchronized(res3) {
			System.out.println("Student2 have"+res3);
			Thread.sleep(2000);		
		}
	}
	}
	}
	
}


public class Synchronized11 {

	public static void main(String[] args) {
		Warriors w1 = new Warriors();
		Warriors w2 = new Warriors();
		
		w1.setName("student1");
		w2.setName("student2");
		
		w1.start();
		w2.start();
		
		
	}

}
