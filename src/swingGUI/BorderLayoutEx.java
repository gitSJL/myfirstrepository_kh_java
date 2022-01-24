package swingGUI;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame {
	// 버튼 생성
	JButton btnAdd = new JButton("Add");
	JButton btnSub = new JButton("Sub");
	JButton btnMul = new JButton("Mul");
	JButton btnDiv = new JButton("Div");
	JButton btnCalc = new JButton("Calculate");

	public BorderLayoutEx() {
		setTitle("BorderLayout 예제");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout()); // 배치 관리자 설정
// 버튼 추가
		add(btnSub, "East");
		add(btnAdd, "West");
		add(btnDiv, "South");
		add(btnMul, "North");
		add(btnCalc, "Center");
		setVisible(true);
	}
}