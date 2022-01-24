package test.thread1;

public class ThreadC extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("ThreadC run()");

		for (int i = 1; i <= 10; i++) {
			System.out.println("*" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
