package Day1007_GUI_ActionListener;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Window_Ex8 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("참가자 명단 프로그램");
		frame.setPreferredSize(new Dimension(400, 200));
		frame.setLocation(500, 400);
		Container contentPane = frame.getContentPane(); //컴포넌트를 배치할 컨텓트팬배치
		//기본
		
		String colNames[] = { "이름", "나이", "성별" };
		DefaultTableModel model = new DefaultTableModel(colNames,0); //직접 모델 객체를 만든다. 모델객체를 통해 데이터 관리를 위해
		JTable  table = new JTable(model);
		contentPane.add(new JScrollPane(table), BorderLayout.CENTER);
		
		JPanel panel = new JPanel(); //사우스에 여러가지가 포함되기에 패널사용 //셋레이아웃 정의하지 않음 기본으로 사용했다(기본은 플로욷)
		JTextField text1 = new JTextField(6);
		JTextField text2 = new JTextField(3);
		JTextField text3 = new JTextField(2);
		JButton button1 = new JButton("추가");
		JButton button2 = new JButton("삭제");
		
		panel.add(new JLabel("이름"));
		panel.add(text1);
		panel.add(new JLabel("나이"));
		panel.add(text2);
		panel.add(new JLabel("성별"));
		panel.add(text3);
		panel.add(button1); //추가
		panel.add(button2);//삭제
		
		contentPane.add(panel, BorderLayout.SOUTH);  //사우스에 여러가지가 포함되기에 패널사용
		
		button1.addActionListener(new AddActionListener(table, text1, text2, text3)); //추가하는 리스너 테이블객체 전달 가능 접근가능하게하기위해 4개항목을 파라메터로 전달
		button2.addActionListener(new RemoveActionListener(table)); //삭제하는 리스너 객체
		//이벤트 번튼 2개
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
		

	}

}
