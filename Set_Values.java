import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Set_Values extends javax.swing.JFrame implements ActionListener {

	public Set_Values() {
		initComponents();
	}

	private void initComponents() {
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		jTextField4 = new javax.swing.JTextField();
		jTextField5 = new javax.swing.JTextField();
		jTextField6 = new javax.swing.JTextField();
		jTextField7 = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		add(jLabel1);
		add(jLabel2);
		add(jLabel3);
		add(jLabel4);
		add(jLabel5);
		add(jLabel6);
		add(jLabel7);
		add(jLabel8);
		add(jTextField1);
		add(jTextField2);
		add(jTextField3);
		add(jTextField4);
		add(jTextField5);
		add(jTextField6);
		add(jTextField7);
		jLabel1.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
		jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel1.setText("Edit Values");
		jLabel1.setForeground(new java.awt.Color(204, 255, 204));
		jLabel1.setBounds(203, 31, 213, 51);

		jLabel2.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
		jLabel2.setForeground(new java.awt.Color(204, 255, 204));
		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel2.setText("1 Month(Price): ");
		jLabel2.setBounds(0, 113, 120, 40);

		jTextField1.setBounds(134, 118, 100, 30);

		jLabel3.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
		jLabel3.setForeground(new java.awt.Color(204, 255, 204));
		jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel3.setText("2 Months(Price) : ");
		jLabel3.setBounds(290, 113, 120, 40);

		jTextField2.setBounds(410, 118, 100, 30);
		
		jLabel4.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
		jLabel4.setForeground(new java.awt.Color(204, 255, 204));
		jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel4.setText("3 Months(Price) : ");
		jLabel4.setBounds(0, 183, 120, 40);

		jTextField3.setBounds(134, 188, 100, 30);
		
		jLabel5.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
		jLabel5.setForeground(new java.awt.Color(204, 255, 204));
		jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel5.setText("1 Year(Price) : ");
		jLabel5.setBounds(290, 188, 120, 40);

		jTextField4.setBounds(410, 188 ,100, 30);
		
		getContentPane().setBackground(new java.awt.Color(88, 0, 0));
		setLayout(null);
		setSize(610, 500);
	}

	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Delete_Trainer.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Delete_Trainer.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Delete_Trainer.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Delete_Trainer.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Set_Values().setVisible(true);
			}
		});

	}

	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JLabel jLabel8;
	private JTextField jTextField1;
	private JTextField jTextField2;
	private JTextField jTextField3;
	private JTextField jTextField4;
	private JTextField jTextField5;
	private JTextField jTextField6;
	private JTextField jTextField7;
	private JButton jButton1;

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
        
	}
}