import java.awt.Dimension;
import java.awt.*;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

public class Customer_Table extends JPanel {
	JPanel contentPane;

	public Customer_Table(String[][] listData) {
		super();

		String[] columnnames = { "First_Name", "Last_Name","Batch", "Total Fees",
				"Age", "Weight", "Height", "Phone_Number", "Attended", "Total",
				"Address"};
		final JTable table = new JTable(listData, columnnames);
		table.setPreferredScrollableViewportSize(new Dimension(1300, 300));
		table.setFillsViewportHeight(true);
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane);
		TableColumn column = null;
		for (int k = 0; k <= 10; k++) {
			column = table.getColumnModel().getColumn(k);
			if(k==2||k==4||k==5||k==6||k==9)
			{
				column.setPreferredWidth(50);
			}
			else if (k == 10) {
				column.setPreferredWidth(150);
			}
			else if(k==8){
				column.setPreferredWidth(90);
			}
			else {
				column.setPreferredWidth(130);
			}
		}
	}

}
