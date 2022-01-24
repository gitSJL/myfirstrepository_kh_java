package test.thread1;

public class TestThread {
	public static void main(String[] args) {

		Thread t1 = new Thread(new ThreadA());
		Thread t2 = new Thread(new ThreadB());
		ThreadC t3 = new ThreadC();

		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);

		t1.start();
		t2.start();
		t3.start();

		return;
	}
}
