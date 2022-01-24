package test.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPEchoServer {
	public void serverUDP() {
		DatagramSocket ds = null;
		DatagramPacket dp = null;
		DatagramPacket dpSend = null;
		try {
			ds = new DatagramSocket(9007);
			while(true) {
			byte[] buf = new byte[1024];
			dp = new DatagramPacket(buf, buf.length);
			ds.receive(dp);
			//dp-buf 에 데이터 채워져 있음
			//dp-buf 를 읽어 나오는 방법 dp.getData();
			//System.out.println(dp.getData());
			System.out.println(new String(dp.getData()));
			//위에서 String.value를 안 쓰는 이유 : 기본자료형, Char 까지만 가능해서 byte 배열 불가해서
			
			
			//여기서 받은 메세지 에코로 돌려주는 부분
			dpSend = new DatagramPacket(dp.getData(), dp.getData().length,dp.getAddress(), dp.getPort());
			ds.send(dpSend);
			
			
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(ds != null && !ds.isClosed())
			ds.close();
		}
	}
}











//서버에서 클라이언트로 보내는 내용은 아직 없는 코딩

//public class UDPEchoServer {
//	public void serverUDP() {
//		DatagramSocket ds = null;
//		DatagramPacket dp = null;
//
//		try {
//			ds = new DatagramSocket(9007);
//			while(true) {
//			byte[] buf = new byte[1024];
//			dp = new DatagramPacket(buf, buf.length);
//			ds.receive(dp);
//			//dp-buf 에 데이터 채워져 있음
//			//dp-buf 를 읽어 나오는 방법 dp.getData();
//			//System.out.println(dp.getData());
//			System.out.println(new String(dp.getData()));
//			//위에서 String.value를 안 쓰는 이유 : 기본자료형, Char 까지만 가능해서 byte 배열 불가해서
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			if(ds != null && !ds.isClosed())
//			ds.close();
//		}
//	}
//}
