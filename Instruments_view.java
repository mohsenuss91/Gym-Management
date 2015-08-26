import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;


public class Instruments_view extends javax.swing.JFrame implements ActionListener {

	
	public Instruments_view() {
		initComponents();
	}
	
	
	String Bench=new String();
	String Barbell=new String();
	String Dumbbell=new String();
	String Rack=new String();
	String Trademill=new String();
	String Pulley=new String();
	
	
	private void initComponents() {
		
		jLabel1=new javax.swing.JLabel();
		jLabel2=new javax.swing.JLabel();
		jLabel3=new javax.swing.JLabel();
		jLabel4=new javax.swing.JLabel();
		jLabel5=new javax.swing.JLabel();
		jLabel6=new javax.swing.JLabel();
		jLabel7=new javax.swing.JLabel();
		jLabel8=new javax.swing.JLabel();
		jLabel9=new javax.swing.JLabel();
		jLabel10=new javax.swing.JLabel();
		jLabel11=new javax.swing.JLabel();
		jLabel12=new javax.swing.JLabel();
		jLabel13=new javax.swing.JLabel();
		
		jButton1=new javax.swing.JButton();
		jButton2=new javax.swing.JButton();
		jButton3=new javax.swing.JButton();
		jButton4=new javax.swing.JButton();
		jButton5=new javax.swing.JButton();
		jButton6=new javax.swing.JButton();
		Back=new javax.swing.JButton();
		
		add(jLabel1);
		add(jLabel2);
		add(jLabel3);
		add(jLabel4);
		add(jLabel5);
		add(jLabel6);
		add(jLabel7);
		add(jLabel8);
		add(jLabel9);
		add(jLabel10);
		add(jLabel11);
		add(jLabel12);
		add(jLabel13);
		add(jButton1);
		add(jButton2);
		add(jButton3);
		add(jButton4);
		add(jButton5);
		add(jButton6);
		add(Back);
		
		MongoClient mongo;
		try {
			mongo = new MongoClient("localhost", 27017);
			DB db = mongo.getDB("Gym");
			DBCollection Instruments = db.getCollection("Instruments");
			DBCursor cursor = Instruments.find();
			cursor.next();
			Bench=cursor.curr().get("Bench").toString();
			Barbell=cursor.curr().get("Barbell").toString();
			Dumbbell=cursor.curr().get("Dumbbell").toString();
			Rack=cursor.curr().get("PowerRack").toString();
			Trademill=cursor.curr().get("Trademill").toString();
			Pulley=cursor.curr().get("Pulley").toString();
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		jLabel1.setFont(new java.awt.Font("SansSerif", 3, 30)); // NOI18N
		jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel1.setText(" Instruments ");
		jLabel1.setForeground(new java.awt.Color(51, 0, 51));
		jLabel1.setBounds(503, 31, 250, 51);
		
		
		jButton1.setBackground(new java.awt.Color(255, 255, 255));
		jButton1.setForeground(new java.awt.Color(255, 255, 255));
		jButton1.setBounds(50, 150, 270, 180);
		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bench.jpg")));
		jButton1.addActionListener(this);
		
		jLabel2.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
		jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel2.setText("Bench : ");
		jLabel2.setForeground(new java.awt.Color(51, 0, 51));
		jLabel2.setBounds(60,340, 200,40 );
		
		jLabel8.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
		jLabel8.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel8.setText(Bench);
		jLabel8.setForeground(new java.awt.Color(51, 0, 51));
		jLabel8.setBounds(205,340, 50,40 );
				  
		jButton2.setBackground(new java.awt.Color(255, 255, 255));
		jButton2.setForeground(new java.awt.Color(255, 255, 255));
		jButton2.setBounds(450, 165, 330, 135);
		jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barbell.jpg")));
		jButton2.addActionListener(this);
		
		jLabel3.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
		jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel3.setText("Barbell : ");
		jLabel3.setForeground(new java.awt.Color(51, 0, 51));
		jLabel3.setBounds(500,340, 200,40 );
		

		jLabel9.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
		jLabel9.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel9.setText(Barbell);
		jLabel9.setForeground(new java.awt.Color(51, 0, 51));
		jLabel9.setBounds(655,340, 50,40 );
		
		jButton3.setBackground(new java.awt.Color(255, 255, 255));
		jButton3.setForeground(new java.awt.Color(255, 255, 255));
		jButton3.setBounds(950, 150, 260, 170);
		jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dumbbell.jpg")));
		jButton3.addActionListener(this);
		
		jLabel4.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
		jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel4.setText("Dumbbell : ");
		jLabel4.setForeground(new java.awt.Color(51, 0, 51));
		jLabel4.setBounds(960,340, 200,40 );
		
		jLabel10.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
		jLabel10.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel10.setText(Dumbbell);
		jLabel10.setForeground(new java.awt.Color(51, 0, 51));
		jLabel10.setBounds(1125,340, 50,40 );
		
		jButton4.setBackground(new java.awt.Color(255, 255, 255));
		jButton4.setForeground(new java.awt.Color(255, 255, 255));
		jButton4.setBounds(50, 410,260 , 170);
		jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rackstation.jpg")));
		jButton4.addActionListener(this);
		
		jLabel5.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
		jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel5.setText("Power Rack : ");
		jLabel5.setForeground(new java.awt.Color(51, 0, 51));
		jLabel5.setBounds(60,600, 200,40 );
		
		jLabel11.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
		jLabel11.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel11.setText(Rack);
		jLabel11.setForeground(new java.awt.Color(51, 0, 51));
		jLabel11.setBounds(230,600, 50,40 );

		
		jButton5.setBackground(new java.awt.Color(255, 255, 255));
		jButton5.setForeground(new java.awt.Color(255, 255, 255));
		jButton5.setBounds(500, 410, 245, 200);
		jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trademill.jpg")));
		jButton5.addActionListener(this);
		
		jLabel6.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
		jLabel6.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel6.setText("Trademill : ");
		jLabel6.setForeground(new java.awt.Color(51, 0, 51));
		jLabel6.setBounds(510,615, 200,40 );
		
		jLabel12.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
		jLabel12.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel12.setText(Trademill);
		jLabel12.setForeground(new java.awt.Color(51, 0, 51));
		jLabel12.setBounds(665,615, 50,40 );
		
		jButton6.setBackground(new java.awt.Color(255, 255, 255));
		jButton6.setForeground(new java.awt.Color(255, 255, 255));
		jButton6.setBounds(950, 410, 225, 215);
		jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/latpulley.jpg")));
		jButton6.addActionListener(this);
		
		jLabel7.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
		jLabel7.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel7.setText("Pulley : ");
		jLabel7.setForeground(new java.awt.Color(51, 0, 51));
		jLabel7.setBounds(960,625, 200,40 );
		
		jLabel13.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
		jLabel13.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel13.setText(Pulley);
		jLabel13.setForeground(new java.awt.Color(51, 0, 51));
		jLabel13.setBounds(1110,625, 50,40 );

		
		Back.setBackground(new java.awt.Color(51, 0, 51));
		Back.setForeground(new java.awt.Color(255, 255, 255));
		Back.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
		Back.setText("Back");
		Back.setBounds(20, 20, 150, 50);
		Back.addActionListener(this);
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		getContentPane().setBackground(new java.awt.Color(255, 255, 255));
		setLayout(null);
		setSize(1300, 730);
		
	}
		public static void main(String args[]) {
			/* Set the Nimbus look and feel */
			// <editor-fold defaultstate="collapsed"
			// desc=" Look and feel setting code (optional) ">
			/*
			 * If Nimbus (introduced in Java SE 6) is not available, stay with the
			 * default look and feel. For details see
			 * http://download.oracle.com/javase
			 * /tutorial/uiswing/lookandfeel/plaf.html
			 */
			try {
				for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
						.getInstalledLookAndFeels()) {
					if ("Nimbus".equals(info.getName())) {
						javax.swing.UIManager.setLookAndFeel(info.getClassName());
						break;
					}
				}
			} catch (ClassNotFoundException ex) {
				java.util.logging.Logger.getLogger(Add_train.class.getName()).log(
						java.util.logging.Level.SEVERE, null, ex);
			} catch (InstantiationException ex) {
				java.util.logging.Logger.getLogger(Add_train.class.getName()).log(
						java.util.logging.Level.SEVERE, null, ex);
			} catch (IllegalAccessException ex) {
				java.util.logging.Logger.getLogger(Add_train.class.getName()).log(
						java.util.logging.Level.SEVERE, null, ex);
			} catch (javax.swing.UnsupportedLookAndFeelException ex) {
				java.util.logging.Logger.getLogger(Add_train.class.getName()).log(
						java.util.logging.Level.SEVERE, null, ex);
			}
			// </editor-fold>

			/* Create and display the form */
			java.awt.EventQueue.invokeLater(new Runnable() {
				@Override
				public void run() {
					new Instruments_view().setVisible(true);
				}
			});
		}

		
		private JLabel jLabel1;
        private JButton jButton1;
        private JButton jButton2;
        private JButton jButton3;
        private JButton jButton4;
        private JButton jButton5;
        private JButton jButton6;
        private JLabel jLabel2;
        private JLabel jLabel3;
        private JLabel jLabel4;
        private JLabel jLabel5;
        private JLabel jLabel6;
        private JLabel jLabel7;
        private JLabel jLabel8;
        private JLabel jLabel9;
        private JLabel jLabel10;
        private JLabel jLabel11;
        private JLabel jLabel12;
        private JLabel jLabel13;
        private JButton Back;
        private JButton Submit;
		
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==Back)
		{
			this.setVisible(false);
			new Instruments().setVisible(true);
		}
	}
	
}
