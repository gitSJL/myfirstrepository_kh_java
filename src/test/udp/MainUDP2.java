package test.udp;

public class MainUDP2 {
public static void main(String[] args) {
	new UDPEchoClient().clientUDP("localhost"); // 내 PC 환경에서 loopback과 localhost 같음 127.0.0.1
	
}
}
