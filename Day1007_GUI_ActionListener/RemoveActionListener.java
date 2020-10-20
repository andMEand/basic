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
		int row = table.getSelectedRow(); //***getSelectedRow ����ġ���� ���ϴ� �޼ҵ�
		//���õ� ���� ������ ����Ŭ���Ԥ� -1�� ��ȯ�Ѵ�
		if(row == -1)//���õ� ���� ���ٴ� ��
			return;
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.removeRow(row);

	}

}
