package Sample2;
class Msoffice extends Thread{
	public void run() {
		if(Thread.currentThread().getName().equals("typing")) {
			typing();
		}
		else if(Thread.currentThread().getName().equals("spellcheck")) {
			spellcheck();
		}
		else {
			saving();
		}
	}
	
	public void typing() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Typing.");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
	
	public void spellcheck() {
		for(; ; ) {
			System.out.println("spellcheck..");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
	
	public void saving() {
		for(; ;) {
			System.out.println("saving...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
	
}

public class Deamonthreads {
	public static void main(String[] args) {
		Msoffice M1 = new Msoffice();
		Msoffice M2 = new Msoffice();
		Msoffice M3 = new Msoffice();
		
		M1.setName("typing");
		M2.setName("spellcheck");
		M3.setName("saving");
		
		M2.setPriority(3);
		M3.setPriority(3);
		M2.setDaemon(true);
		M3.setDaemon(true);
		
		M1.start();
		M2.start();
		M3.start();
	}

}
