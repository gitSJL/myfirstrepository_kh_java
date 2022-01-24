package test.thread1;

public class ThreadA implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// 다른 스래드가 동작하지 않는 구간에서 이 부분 처리함, 그냥 보기에는 동시에 처리되는 것처럼 보일 수 있음
		System.out.println("ThreadA run()");

		for (int i = 1; i <= 10; i++) {
			System.out.println("*");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
