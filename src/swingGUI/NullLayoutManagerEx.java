package swingGUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullLayoutManagerEx extends JFrame {
	public NullLayoutManagerEx() {
		setTitle("배치관리자 없는 컨테이너 예제");
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null); // 배치 관리자 제거
		JLabel label = new JLabel("배치관리자 없는 컨테이너");
		label.setLocation(150, 50); // 컨테이너 위치 설정
		label.setSize(200, 20); // 컨테이너 크기 설정
		for (int i = 1; i <= 10; i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setBounds(i * 10, i * 10, 50, 20); // 컨테이너의 크기와 위치를 한번에 설정
			add(b);
		}
		add(label);
		setVisible(true);
	}
}