package Day1007_GUI_ActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.table.TableModel;

public class PrintActionListener implements ActionListener {
	JTable table;
	PrintActionListener(JTable table){
		this.table = table;
	}
	

	@Override
	public void actionPerformed(ActionEvent arg0) { //출력버트 클릭시 명시적 호출이 없더라도 이벤트통해 자동 호출됨
		TableModel model = table.getModel(); //테이블 객체내에서 실제 데이터를 관리하는 객체
		int rowNum = model.getRowCount(); //행수
		int colNum = model.getColumnCount();//열의 갯수 구하기
		for(int col=0; col <colNum; col++) { //이름 나이 성별
			String colName = model.getColumnName(col);
			System.out.print(colName + "\t");
		}
		System.out.println();
		for(int row =0; row<rowNum; row++) {
			for( int col =0; col<colNum; col++) {
				Object obj = model.getValueAt(row, col);//김철수 0행ㅎ0열
				System.out.print(obj+"\t");
			}
			System.out.println(); //다음칸
			
		}
		System.out.println("----------------------------");

	}

}
