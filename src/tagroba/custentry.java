package tagroba;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

class custentry extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

custentry(int choice){

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
			
			JLabel lblNewLabel = new JLabel("Password:");
			lblNewLabel.setBounds(257, 217, 63, 17);
			contentPane.add(lblNewLabel);
			
			textField = new JTextField();
			textField.setBounds(330, 11, 96, 20);
			contentPane.add(textField);
			textField.setColumns(10);
			
			JLabel lblCustomerName = new JLabel("Name:");
			lblCustomerName.setBounds(29, 14, 49, 14);
			contentPane.add(lblCustomerName);
			
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(100, 214, 96, 20);
			contentPane.add(textField_1);
			
			JLabel lblNewLabel_1_1 = new JLabel("Email:");
			lblNewLabel_1_1.setBounds(29, 217, 49, 14);
			contentPane.add(lblNewLabel_1_1);
			
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(100, 11, 96, 20);
			contentPane.add(textField_2);
			
			JLabel lblLastName = new JLabel("L Name:");
			lblLastName.setBounds(257, 14, 49, 14);
			contentPane.add(lblLastName);
			
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(330, 214, 96, 20);
			contentPane.add(textField_3);
			
			JLabel lblNewLabel_1_1_1 = new JLabel("Age:");
			lblNewLabel_1_1_1.setBounds(138, 112, 49, 14);
			contentPane.add(lblNewLabel_1_1_1);
			
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(192, 109, 96, 20);
			contentPane.add(textField_4);
			
			JButton btnNewButton = new JButton("==>");
			
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
			
					if(!textField.getText().toString().isEmpty() && !textField_1.getText().toString().isEmpty()
							&&!textField_2.getText().toString().isEmpty() && !textField_3.getText().toString().isEmpty()
							&& !textField_4.getText().toString().isEmpty())
							
							{
					
					       Connection con;									  
					       String url = "jdbc:sqlserver://localhost:1433;databaseName=I3305;integratedSecurity=true;encrypt=false;";
					        try {
					           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
								con = DriverManager.getConnection(url);
								
					 					 
						       if (con != null)
						       {
						
							       Statement statement = con.createStatement();
							       String query = "insert into customer values('"+textField_2.getText().toString()+"','"+
							       textField.getText().toString()+"','"+textField_4.getText()+"','"+textField_1.getText().toString()+"',"+
							       textField_3.getText()+")";
							       String query1 ="insert into login values('"+textField_1.getText().toString()+"',"+textField_3.getText()+")";							      
							       statement.executeUpdate(query);
							       //statement.executeUpdate(query1);
							       
							       bill b1 = new bill(1);
							       setVisible(false);
							       
							       
    	  
							    }
			
						       
					             } catch (SQLException | ClassNotFoundException ex) {

					  
					      JOptionPane.showMessageDialog(null, "Impossible to connect "+ex.toString() );

					 }

						
							}		

							else 
								{
								  JOptionPane.showMessageDialog(null, "Please enter your login");
								}

	
				}
			});
			btnNewButton.setBounds(337, 106, 89, 23);
			contentPane.add(btnNewButton);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
	setDefaultCloseOperation(HIDE_ON_CLOSE);
    setVisible(true);
}



	
	public static void main(String arg[]) {
		custentry c = new custentry(1);

	}
}
