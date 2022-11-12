package tagroba;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

 class bill extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	bill(int choice){

		switch(choice)
		{
			case 1:
				setResizable(true);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 450, 300);
				contentPane = new JPanel();
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane);
				contentPane.setLayout(null);
				
				textField = new JTextField();
				textField.setBounds(10, 11, 96, 20);
				contentPane.add(textField);
				textField.setColumns(10);
				
				textField_1 = new JTextField();
				textField_1.setColumns(10);
				textField_1.setBounds(10, 42, 96, 20);
				contentPane.add(textField_1);
				
				textField_2 = new JTextField();
				textField_2.setColumns(10);
				textField_2.setBounds(304, 42, 96, 20);
				contentPane.add(textField_2);
				
				textField_3 = new JTextField();
				textField_3.setColumns(10);
				textField_3.setBounds(384, 99, 42, 20);
				contentPane.add(textField_3);
				
				textField_4 = new JTextField();
				textField_4.setColumns(10);
				textField_4.setBounds(304, 11, 96, 20);
				contentPane.add(textField_4);
				
				textField_5 = new JTextField();
				textField_5.setColumns(10);
				textField_5.setBounds(159, 83, 96, 20);
				contentPane.add(textField_5);
				
				JTextArea textArea = new JTextArea();
				textArea.setBounds(10, 121, 338, 142);
				contentPane.add(textArea);
				
				JButton btnNewButton = new JButton("Generate");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						String title= textField.getText();//drugname
						String cusname= textField_1.getText();
						int qty= Integer.parseInt(textField_4.getText());
						String city= textField_2.getText();
						int total = 0;

					       Connection con;							  
					       String url = "jdbc:sqlserver://localhost:1433;databaseName=I3305;integratedSecurity=true;encrypt=false;";
					        try {
					           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
								con = DriverManager.getConnection(url);
								 					 
						       if (con != null)
						       {															             
							       System.out.println( "Your are connected");
							       Statement statement = con.createStatement();
							       String query = "select * from MediInfo where title='"+title+"'";				       
							       ResultSet rSet= statement.executeQuery(query);						       
							       while(rSet.next())
								      {						    						    	
							    	  if(rSet.getInt("price") >0)   
							    	  {					    		  
							    		  total+=qty*(rSet.getInt("price")  );
							    		  textField_3.setText(
							  					"" + total);
							    	
							    	  }
							    	  else System.out.println("price not available");		
						        }
							       
							       String query1 = "insert into orderr values("+textField_5.getText()+",'"+
							    		   textField.getText()+"',"+textField_4.getText()+",'"+textField_2.getText()+"',"+textField_3.getText()+")" ;
							       statement.executeUpdate(query1);
							       
						       }
						       
					             } catch (SQLException | ClassNotFoundException ex) {

					  
					      JOptionPane.showMessageDialog(null, "Impossible to connect "+ex.toString() );

					 }

						
						textArea.setText("Invoice No:  " + textField_5.getText()
								+ "\nDrugName:  Price      City  Total\n" + textField.getText()
								+ "\t" +total+"        "+textField_2.getText()+" \t"+textField_3.getText()+"\n*************************************");

					}
				});
				btnNewButton.setBounds(347, 195, 89, 23);
				contentPane.add(btnNewButton);
				
				JButton btnNewButton_1 = new JButton("Clear");
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						textField.setText("");
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						textField_4.setText("");
						textArea.setText("");
						textField_5.setText("");

					}
				});
				btnNewButton_1.setBounds(347, 240, 89, 23);
				contentPane.add(btnNewButton_1);
				
				JLabel lblNewLabel = new JLabel("Drug");
				lblNewLabel.setBounds(118, 14, 49, 14);
				contentPane.add(lblNewLabel);
				
				JLabel lblCusname = new JLabel("Cust-name");
				lblCusname.setBounds(118, 45, 68, 14);
				contentPane.add(lblCusname);
				
				JLabel lblQuantity = new JLabel("City");
				lblQuantity.setBounds(255, 45, 49, 14);
				contentPane.add(lblQuantity);
				
				JLabel lblRate = new JLabel("Total");
				lblRate.setBounds(338, 102, 49, 14);
				contentPane.add(lblRate);
				
				JLabel lblAmount = new JLabel("Quantity");
				lblAmount.setBounds(245, 14, 49, 14);
				contentPane.add(lblAmount);
				
				JLabel lblInvoiceNo = new JLabel("Invoice No.");
				lblInvoiceNo.setBounds(83, 86, 66, 14);
				contentPane.add(lblInvoiceNo);
				
				
				
				
		}
		setDefaultCloseOperation(HIDE_ON_CLOSE);
	    setVisible(true);
				
	}			
				
				
				
				
				
	public static void main(String[] args) {
		bill b = new bill(1);
	}
		
	



}
