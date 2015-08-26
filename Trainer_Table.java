import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

public class Trainer_Table extends JPanel {
	JPanel contentPane;

	public Trainer_Table(String[][] listData) {
		super();

		String[] columnnames = { "First_Name", "Last_Name","Batch", "Age", "Username",
				"Password", "Phone_Number", "Address" };
		final JTable table = new JTable(listData, columnnames);
		table.setPreferredScrollableViewportSize(new Dimension(1000, 300));
		table.setFillsViewportHeight(true);

		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane);
		TableColumn column = null;
		for (int k = 0; k < 8; k++) {
			column = table.getColumnModel().getColumn(k);
			if (k == 3 || k == 4 || k == 5 || k == 6) {
				column.setPreferredWidth(130);
			} else {
				column.setPreferredWidth(100);
			}
		}
	}

}
