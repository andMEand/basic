package Day1007_GUI_ActionListener;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Window_Ex {

	public static void main(String[] args) {
		JFrame frame = new JFrame("참가자 명단 프로그램");
		frame.setPreferredSize(new Dimension(300, 150));
		frame.setLocation(500,  400);
		Container contentPane = frame.getContentPane();
		String colNum[]= {"이름","나이","성별"};
		Object data[][]= {	{"김철수",24,'남'},
							{"이순히",21,'여'},
							{"박지영",25,'여'},
							{"이순히",21,'여'},
							{"박지영",25,'여'}};
		JTable table = new JTable(data, colNum);
		JScrollPane scrollPane = new JScrollPane(table);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JButton button = new JButton("출력");		
		button.addActionListener(new PrintActionListener(table));
		contentPane.add(button, BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

	}

}
