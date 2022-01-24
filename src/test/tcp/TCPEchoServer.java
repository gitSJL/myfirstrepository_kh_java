package test.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPEchoServer {

	//내가 말한 것을 내가 듣게 되는 상황 만들 것임
	public void tcpServer(int port) {
		ServerSocket ss = null;
		Socket s = null;
		//NullPointException 이 있을테니 아예 null 주고 시작함
		InputStream in = null;
		OutputStream out = null;
		BufferedReader br = null;
		PrintWriter wr = null;
		BufferedReader stdin = null;//콘솔창 입력을 받아들이는 용도
		
		try {
			//서버 소켓 생성
			ss = new ServerSocket(port);
			//콘솔창에 키보드로 입력한 것을 받아들일 수 있는 stream
			stdin = new BufferedReader(new InputStreamReader(System.in));
			
			
			while(true) {
			//생성된 서버 소켓에 연결을 시도하는 클라이언트를 대기했다가 수락해주는 코드가 바로 밑의 부분
			// 근데 이게 반복적으로 대기하면서 접근과 맞물려야 하니 반복문 입력 필요(그래서 위에 while문 씀)
			s = ss.accept();
			
			System.out.println(" 접속");
			
			//클라이언트가 접속을 요청하는 코드, 접속할 곳의 ip 알아오기
//			InetAddress inetAddr = ss.getInetAddress();
//			System.out.println(inetAddr.getHostAddress()  + " 접속");
			
			//클라이언트와 서버 간의 통신 Stream 생성
			in = s.getInputStream();  //여기까지 서버쪽 완료
			out = s.getOutputStream();
			//이제 인풋스트림에서 문자 단위로 읽을 수 있도록 버퍼 리더가 필요하다
			br = new BufferedReader(new InputStreamReader(in));
			wr = new PrintWriter(new OutputStreamWriter(out));
			
			//쓴 내용을 읽어들이고 뿌리는 구간임 + 반대로도 가능하도록 해놓았음
			String msg = null;
			String answer = null;
			while((msg=br.readLine()) != null) {
				System.out.println("읽은 메세지: " + msg);
				System.out.println("응답메세지: ");
				answer = stdin.readLine();
				wr.println(msg+"의 응답메세지"+answer);
				wr.flush();
			}
						
			
			}
		} catch (IOException e) { //Unhandled exception type IOException 오류 발생으로 
			e.printStackTrace();
		} finally {
			try {
				if(ss != null) ss.close(); // close 할 때 또 try catch로 묶어주는 것 기억하기
				// 위에처럼 null이 아닐 때 닫는 것으로 하기
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}
	
}
