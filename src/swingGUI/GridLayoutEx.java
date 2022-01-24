package swingGUI;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx extends JFrame {
// 버튼 생성
	JButton b1 = new JButton("버튼1");
	JButton b2 = new JButton("버튼2");
	JButton b3 = new JButton("버튼3");
	JButton b4 = new JButton("버튼4");
	JButton b5 = new JButton("버튼5");

	public GridLayoutEx() {
		setTitle("GridLayout 예제");
		setSize(200, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3, 2)); // 3행 2열 GridLayout 설정
//버튼 추가
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		setVisible(true);
	}
}