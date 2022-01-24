package test.synch;

public class Account {

	// Field
	private static int balance; // 잔액
	// 입금스래드와 출금스래드가 함께 사용할 공유자원이 됨
	// Method

	public /* synchronized */ void withDraw(int money) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 출금하는 메소드
		synchronized (this) {
			if (balance >= money)
				balance -= money;
		}
	}

	public static void setBalance(int balance) {
		Account.balance = balance;
	}

	public static int getBalance() {
		return balance;
	}
}