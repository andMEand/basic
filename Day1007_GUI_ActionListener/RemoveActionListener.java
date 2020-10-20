package Day1007_GUI_ActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RemoveActionListener implements ActionListener {
	JTable table;
	RemoveActionListener(JTable table){
			this.table = table;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int row = table.getSelectedRow(); //***getSelectedRow 행위치값을 구하는 메소드
		//선택된 행이 없을때 삭제클시함ㄴ -1을 반환한다
		if(row == -1)//선택된 행이 없다는 뜻
			return;
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.removeRow(row);

	}

}
