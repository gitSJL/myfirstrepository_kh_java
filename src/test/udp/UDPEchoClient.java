package test.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPEchoClient {
	public void clientUDP(InetAddress ip, int port) {
		DatagramSocket ds = null;
		DatagramPacket dp = null;
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			ds = new DatagramSocket();
			while(true) {
			String msg = br.readLine();
			if(msg.equals("exit")) {
				break;
			}
			dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length, ip, 9007);
			ds.send(dp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ds != null && !ds.isClosed()) {
				ds.close();
			}
		}
	}
}





//여기 밑은 일차원 소통일 때
//public class UDPEchoClient {
//	public void clientUDP(InetAddress ip, int port) {
//		DatagramSocket ds = null;
//		DatagramPacket dp = null;
//		BufferedReader br = null;
//		try {
//			br = new BufferedReader(new InputStreamReader(System.in));
//			ds = new DatagramSocket();
//			while(true) {
//			String msg = br.readLine();
//			if(msg.equals("exit")) {
//				break;
//			}
//			dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length, ip, 9007);
//			ds.send(dp);
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			if (ds != null && !ds.isClosed()) {
//				ds.close();
//			}
//		}
//	}
//}
