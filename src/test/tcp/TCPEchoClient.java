package test.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPEchoClient {
	public void clientTCP(String ip, int port) {
		Socket s = null;
		InputStream in = null;
		OutputStream out = null;
		BufferedReader br = null;
		PrintWriter wr = null;
		//
		BufferedReader stdin = null;//콘솔창 입력을 받아들이는 용도
		
		try {
			s = new Socket(ip, port); // 서버에 연결 요청
			System.out.println("접속성공");
			
			//서버와 통신을 위한 문자형 stream-InputS, OutputS, String Line 형태로 읽고 쓸 수 있는 보조 스트림-BufferR, PrintW
			in=s.getInputStream();
			out=s.getOutputStream();
			br=new BufferedReader(new InputStreamReader(in));
			wr = new PrintWriter(new OutputStreamWriter(out));
			
			//콘솔창에 키보드로 입력한 것을 받아들일 수 있는 stream
			stdin = new BufferedReader(new InputStreamReader(System.in));
			//
			String msg = null;
			String echo = null;
			
			while(true) {
			System.out.print("보낼 메세지: ");
			msg = stdin.readLine();
			if(msg.equals("exit"))
				break;
			//
			wr.println(msg); //서버로 메세지 전달
			wr.flush();
			
			echo = br.readLine();
			System.out.println(echo);
			
			}
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		System.out.println("연결 종료");
	}

}
