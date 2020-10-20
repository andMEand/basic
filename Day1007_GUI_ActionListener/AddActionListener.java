package Day1007_GUI_ActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AddActionListener implements ActionListener {
	JTable table;
	JTextField text1, text2, text3;
	
	AddActionListener(JTable table, JTextField text1, JTextField text2, JTextField text3){
		this.table= table;
		this.text1= text1;
		this.text2= text2;
		this.text3= text3;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String arr[] = new String[3];
		//스트링 대신 오브젝트로 사용해도 된다
		arr[0] = text1.getText();  //읽어옴 숫자로 입력해도 문자로 읽어온다
		arr[1] = text2.getText();
		arr[2] = text3.getText();
		DefaultTableModel model =(DefaultTableModel) table.getModel(); //모델객체를 구하는 작업
		model.addRow(arr);//구한 모델객체를 마지막 위치에 저장

	}//사우스에 여러가지가 포함되기에 패널사용

}
