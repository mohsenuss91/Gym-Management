
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mongodb.*;

/**
 * 
 * @author yogesh
 */
public class Add_cust extends javax.swing.JFrame implements ActionListener {

	/**
	 * Creates new form Add_cust
	 */
	
	public static String Success=new String();
	
	public Add_cust() {
		initComponents();
	}
    
	public Add_cust(String s){
	    	Success=s;
	}
	public boolean isAlpha(String name) {
		char[] chars = name.toCharArray();

		for (char c : chars) {
			if (!Character.isLetter(c)) {
				return false;
			}
		}
   
		return true;
	}
    
	
	
	
	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jTextField4 = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox();
		jComboBox2 = new javax.swing.JComboBox();
		jComboBox3 = new javax.swing.JComboBox();
		jComboBox5 = new javax.swing.JComboBox();
		jLabel6 = new javax.swing.JLabel();
		jTextField5 = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();
		jTextField6 = new javax.swing.JTextField();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();

		jTextField4.setText("jTextField4");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(102, 255, 204));

		jLabel1.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(204, 255, 204));
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("Customer Details");
		jLabel1.setBounds(159, 23, 283, 77);
		add(jLabel1);

		jLabel2.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
		jLabel2.setForeground(new java.awt.Color(204, 255, 204));
		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel2.setText("First Name : ");
		jLabel2.setBounds(20, 113, 100, 40);
		add(jLabel2);

		jTextField1.setBounds(134, 118, 140, 30);
		add(jTextField1);

		jLabel3.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
		jLabel3.setForeground(new java.awt.Color(204, 255, 204));
		jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel3.setText("Last Name : ");
		//jLabel3.setBounds(310, 113, 120, 40);
		jLabel3.setBounds(5, 183, 120, 40);
		add(jLabel3);

		//jTextField2.setBounds(450, 118, 140, 30);
		jTextField2.setBounds(134, 188, 140, 30);
		add(jTextField2);

		jLabel4.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
		jLabel4.setForeground(new java.awt.Color(204, 255, 204));
		jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel4.setText("Phone Number : ");
		jLabel4.setBounds(5, 253, 120, 40);
		add(jLabel4);

		jTextField3.setBounds(134, 258, 140, 30);
		add(jTextField3);

		jLabel5.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
		jLabel5.setForeground(new java.awt.Color(204, 255, 204));
		jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel5.setText("Age : ");
		jLabel5.setBounds(307, 113, 120, 40);
		add(jLabel5);

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"18", "19", "20", "21", "22", "23", "24", "25", "26", "27",
				"28", "29", "30", "31", "32", "33", "34", "35", "36", "37",
				"38", "39", "40", "41", "42", "43", "44", "45", "46" }));
		jComboBox1.setBounds(450, 118, 80, 30);
		add(jComboBox1);
		jComboBox1.addActionListener(this);

		jLabel6.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
		jLabel6.setForeground(new java.awt.Color(204, 255, 204));
		jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel6.setText("Height(in cm) : ");
		jLabel6.setBounds(9, 323, 120, 40);
		add(jLabel6);

		jTextField5.setBounds(134, 328, 140, 30);
		add(jTextField5);

		jLabel10.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
		jLabel10.setForeground(new java.awt.Color(204, 255, 204));
		jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel10.setText("Subscription : ");
		jLabel10.setBounds(307, 183, 120, 40);
		add(jLabel10);

		jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"1 Month", "2 Months", "3 Months", "1 YEAR" }));
		jComboBox2.setBounds(450, 188, 90, 30);
		add(jComboBox2);

		jLabel11.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
		jLabel11.setForeground(new java.awt.Color(204, 255, 204));
		jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel11.setText("History : ");
		jLabel11.setBounds(307, 253, 120, 40);
		add(jLabel11);
  
		jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"None", "Heart Problems", "Diabatics", "Asthama" }));
		jComboBox3.setBounds(450, 258, 120, 30);
		add(jComboBox3);
		
		jLabel13.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
		jLabel13.setForeground(new java.awt.Color(204, 255, 204));
		jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel13.setText("Batches : ");
		jLabel13.setBounds(307, 323, 120, 40);
		add(jLabel13);
		
		jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Morning", "Evening", "Night" }));
		jComboBox5.setBounds(450, 328, 90, 30);
		add(jComboBox5);
		
		jLabel7.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
		jLabel7.setForeground(new java.awt.Color(204, 255, 204));
		jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel7.setText("Weight(in kg) : ");
		jLabel7.setBounds(8, 393, 120, 40);
		add(jLabel7);

		jTextField6.setBounds(134, 398, 140, 30);
		add(jTextField6);
		

		jLabel8.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
		jLabel8.setForeground(new java.awt.Color(204, 255, 204));
		jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel8.setText("Address : ");
		jLabel8.setBounds(18, 463, 100, 40);
		add(jLabel8);

		if(Success.equals("pl"))
		{
		jLabel9.setFont(new java.awt.Font("SansSerif", 3, 16)); // NOI18N
		jLabel9.setForeground(new java.awt.Color(204, 255, 204));
		jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel9.setText("Successfully Added");
		jLabel9.setBounds(200, 10, 200, 40);
		}
		add(jLabel9);
		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jScrollPane1.setViewportView(jTextArea1);
		jTextArea1.setBounds(134, 468, 300, 80);
		add(jTextArea1);

		jButton1.setBackground(new java.awt.Color(51, 0, 51));
		jButton1.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
		jButton1.setForeground(new java.awt.Color(255, 255, 255));
		jButton1.setText("Go To Workout Chart");
		jButton1.setBounds(190, 600, 230, 30);
		add(jButton1);
		jButton1.addActionListener(this);

		jButton2.setBackground(new java.awt.Color(51, 0, 51));
		jButton2.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
		jButton2.setForeground(new java.awt.Color(255, 255, 255));
		jButton2.setText("Back");
		jButton2.setBounds(20, 20, 80, 40);
		add(jButton2);
		jButton2.addActionListener(this);

		getContentPane().setBackground(new java.awt.Color(88, 0, 0));

		setLayout(null);
		setSize(650, 700);
		setTitle("Adding Customer");
	}// </editor-fold>

	/**
	 * @param args
	 *            the command line arguments
	 */
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
			java.util.logging.Logger.getLogger(Add_cust.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Add_cust.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Add_cust.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Add_cust.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Add_cust().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JComboBox jComboBox2;
	private javax.swing.JComboBox jComboBox3;
	private javax.swing.JComboBox jComboBox5;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;

	// End of variables declaration
	@Override
	/* Check The code below for insertion of values */
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		add(jLabel9);
		String History = jComboBox3.getSelectedItem().toString();
		if (ae.getSource() == jButton1) {
			try {
				MongoClient mongo = new MongoClient("localhost", 27017);
				DB db = mongo.getDB("Gym");
				DBCollection Gym_Collection = db.getCollection("Customers");
				DBCollection Allot = db.getCollection("Batch");      //Declaration of collection for Batch
				DBCursor cursor=Allot.find();
				float Slots,Morning,Evening,Night;
				cursor.next();
				Slots=Float.parseFloat(cursor.curr().get("Slots").toString());
				Morning=Float.parseFloat(cursor.curr().get("Morning").toString());
				Evening=Float.parseFloat(cursor.curr().get("Evening").toString());
				Night=Float.parseFloat(cursor.curr().get("Night").toString());
				String first_name = jTextField1.getText();
				String last_name = jTextField2.getText();
				float weight = Float.parseFloat(jTextField6.getText()
						.toString());
				float height = Float.parseFloat(jTextField5.getText()
						.toString());
				String address = jTextArea1.getText();
				int age = Integer.parseInt(jComboBox1.getSelectedItem()
						.toString());
				String Subs = jComboBox2.getSelectedItem().toString();
				
				String Batches=jComboBox5.getSelectedItem().toString();
				String phone_number = jTextField3.getText().toString();
				if (!isAlpha(first_name) || !isAlpha(last_name)) {
					JOptionPane.showMessageDialog(this, "Enter a valid name");
					jTextField1.setText("");
					jTextField2.setText("");
				} else if (weight > 150 || weight < 40) {
					JOptionPane.showMessageDialog(this,
							"Please add weight between 40 and 150");
					jTextField6.setText("");
				} else if (height > 250 || height < 50) {
					JOptionPane.showMessageDialog(this,
							"Please add height between 100 and 250");
					jTextField5.setText("");
				} else if (phone_number.length() < 8
						|| phone_number.length() > 11) {
					JOptionPane.showMessageDialog(this,
							"Enter a valid Phone no.");
					jTextField3.setText("");
				}else {
					int random_1, random_2,sub_sum = 0,days = 0;
					if (Subs.equals("1 Month")) {
						sub_sum = 1000;
						days = 30;
					} else if (Subs.equals("2 Months")) {
						sub_sum = 1500;
						days = 60;
					} else if (Subs.equals("3 Months")) {
						sub_sum = 2250;
						days = 90;
					} else if (Subs.equals("1 YEAR")) {
						sub_sum = 6000;
						days = 360;
					}
					 int flag=0,flag1=0,flag2=0,flag3=0;
                    if(Batches.equals("Morning"))
					{
						Morning+=1;
						flag1=1;
					}
					else if(Batches.equals("Evening"))
					{	
						Evening+=1;
						flag2=1;
					}
					else if(Batches.equals("Night"))
					{	
						Night+=1;
						flag3=1;
					}
                    if(Morning>Slots || Evening>Slots || Night>Slots)
                    {
                    	if(flag1==1)
                    	{
                    		Morning-=1;
                    	}
                    	else if(flag2==1)
                    	{
                    		Evening-=1;
                    	}
                    	else if(flag3==1)
                    	{
                    		Night-=1;
                    	}
                    	flag=1;
                    }
                  if(flag==1)
                  {
                	  float temp1,temp2;
                	  if(flag1==1)
                	  {
                		  temp1=Slots-Evening;
                		  temp2=Slots-Night;
                		  JOptionPane.showMessageDialog(this, "This time slot slot is full. Evening has "+temp1+" Slots. Night has "+temp2+" Slots.");
                	  }
                	  else if(flag2==1)
                	  {
                		  temp1=Slots-Morning;
                		  temp2=Slots-Night;
                		  JOptionPane.showMessageDialog(this, "This time slot slot is full. Morning has "+temp1+" Slots. Night has "+temp2+" Slots.");
                	  }
                	  else{
                		  temp1=Slots-Morning;
                		  temp2=Slots-Evening;
                		  JOptionPane.showMessageDialog(this, "This time slot slot is full. Morning has "+temp1+" Slots. Evening has "+temp2+" Slots.");
                	  }
                  }
                  else{
					do {
						random_1 = (int) Math.floor(Math.random() * 360);
						random_2 = (int) Math.floor(Math.random() * 360);
					} while (random_1 >= random_2 || days <= random_2);
					BasicDBObject doc = new BasicDBObject("First_Name",
							first_name.toLowerCase())
							.append("Last_Name", last_name.toLowerCase())
							.append("Phone_Number", phone_number)
							.append("Age", age).append("Height", height).append("History", History).append("Subscribe", days).append("Batch", Batches)
							.append("Weight", weight)
							.append("Attended", random_1)
							.append("Total", random_2)
							.append("Fees", sub_sum)
							.append("Address", address);
					Gym_Collection.insert(doc);
					jTextField1.setText("");
					jTextField2.setText("");
					jTextField3.setText("");
					jTextField5.setText("");
					jTextField6.setText("");
					jTextArea1.setText("");
					
					
					BasicDBObject newDocument = new BasicDBObject();
					newDocument.append("$set",
							new BasicDBObject().append("Morning", Morning)
									.append("Evening", Evening).append("Night",Night));

					BasicDBObject searchQuery = new BasicDBObject().append(
							"Slots", Slots);
                    
					Allot.update(searchQuery, newDocument);
					
					
					
					this.setVisible(false);
					new work(History,first_name.toLowerCase(),last_name.toLowerCase());
					this.setVisible(false);
					new work().setVisible(true);
					}
			      }
				}
			catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NumberFormatException e) {// To validate for data types
				JOptionPane.showMessageDialog(this,
						"Please Check the Data types");
				jTextField1.setText("");
				jTextField2.setText("");
				jTextField3.setText("");
				jTextField5.setText("");
				jTextField6.setText("");
				jTextArea1.setText("");
			}
		}

		else if (ae.getSource() == jButton2) {
			this.setVisible(false);
			new Receptionist().setVisible(true);
		}
	}
}

