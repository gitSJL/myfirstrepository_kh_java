package swingGUI;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame {
	// 버튼 생성
	JButton b1 = new JButton("버튼1");
	JButton b2 = new JButton("버튼2");
	JButton b3 = new JButton("버튼3");

	public FlowLayoutEx() {
		setTitle("FlowLayout 예제");
		setSize(250, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30)); // 배치 관리자 변경
		// 버튼 추가
		add(b1);
		add(b2);
		add(b3);
		setVisible(true);
	}
}
