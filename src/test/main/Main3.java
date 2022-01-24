package test.main;

import test.tcp.TCPEchoServer;

public class Main3 {

	public static void main(String[] args) {
		new TCPEchoServer().tcpServer(9007);
		// 위에 9007은 4자리 임의로 암거나 한 것임 0~1023만 아니면 된다고 했지?
		
	}
	
}
