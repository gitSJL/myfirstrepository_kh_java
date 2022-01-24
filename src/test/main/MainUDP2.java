package test.main;

import java.net.InetAddress;
import java.net.UnknownHostException;
import test.udp.UDPEchoClient;

public class MainUDP2 {
public static void main(String[] args) {
	
	String ip = "local host";
	InetAddress iAddr = null;
	try {
		iAddr = InetAddress.getByName("localhost");
	} catch (UnknownHostException e) {
		e.printStackTrace();
	}
	new UDPEchoClient().clientUDP(iAddr, 9007);
	
//	try {
//		new UDPEchoClient().clientUDP(InetAddress.getByName("localhost"), 9007);
//	} catch (UnknownHostException e) {
//		e.printStackTrace();
//	}
}
}