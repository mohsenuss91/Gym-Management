import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author yogesh
 */
public class Instruments extends javax.swing.JFrame implements ActionListener {

	/**
	 * Creates new form Admin
	 */
	public Instruments() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jToggleButton1 = new javax.swing.JToggleButton();
		jTextField1 = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();

		jLabel1.setText("jLabel1");

		jToggleButton1.setText("jToggleButton1");

		jTextField1.setText("jTextField1");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(102, 102, 255));
		setBounds(new java.awt.Rectangle(200, 300, 400, 200));

		// Border border = BorderFactory.createLineBorder(Color.BLACK, 3);
		/*
		 * Border border=BorderFactory.createRaisedBevelBorder();
		 * jLabel2.setBorder(border);
		 */
		jLabel2.setBackground(new java.awt.Color(102, 102, 255));
		jLabel2.setFont(new java.awt.Font("SansSerif", 3, 30)); // NOI18N
		jLabel2.setForeground(new java.awt.Color(204, 255, 204));
		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel2.setText(" Instruments ");
		jLabel2.setBounds(140, 20, 210, 70);
		add(jLabel2);

		jButton1.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
		jButton1.setText("Add Instrument");
		jButton1.setBackground(new java.awt.Color(51, 0, 51));
		jButton1.setForeground(new java.awt.Color(255, 255, 255));
		add(jButton1);
		jButton1.setBounds(30, 135, 180, 30);
		jButton1.addActionListener(this);

		jButton2.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
		jButton2.setText("Show Instruments");
		jButton2.setBackground(new java.awt.Color(51, 0, 51));
		jButton2.setForeground(new java.awt.Color(255, 255, 255));
		add(jButton2);
		jButton2.setBounds(270, 135, 180, 30);
		jButton2.addActionListener(this);

		jButton3.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
		jButton3.setText("Delete Instruments");
		jButton3.setBackground(new java.awt.Color(51, 0, 51));
		jButton3.setForeground(new java.awt.Color(255, 255, 255));
		jButton3.setBounds(140, 250, 180, 30);
		add(jButton3);
		jButton3.addActionListener(this);

		jButton4.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
		jButton4.setText("Back");
		jButton4.setBackground(new java.awt.Color(51, 0, 51));
		jButton4.setForeground(new java.awt.Color(255, 255, 255));
		jButton4.setBounds(20, 20, 80, 40);
		add(jButton4);
		jButton4.addActionListener(this);

		getContentPane().setBackground(new java.awt.Color(88, 0, 0));
		setLayout(null);
		setSize(510, 400);
	}// </editor-fold>

	/**
	 * @param args
	 *            the command line arguments
	 */
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
			java.util.logging.Logger.getLogger(Admin.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Admin.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Admin.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Admin.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Instruments().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JToggleButton jToggleButton1;

	// End of variables declaration
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if (ae.getSource() == jButton1) {
			this.setVisible(false);
			new Instruments_Add().setVisible(true);
		} else if (ae.getSource() == jButton2) {
			this.setVisible(false);
			new Instruments_view().setVisible(true);
		} else if (ae.getSource() == jButton4) {
			this.setVisible(false);
			new Admin().setVisible(true);
		} else if (ae.getSource() == jButton3) {
			this.setVisible(false);
			new Instruments_del().setVisible(true);
		} 
	}
}
