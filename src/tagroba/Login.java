package tagroba;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField passwordField;
	
	
	Image img = Toolkit.getDefaultToolkit().getImage("E:\\rahul.jpg");
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	
	

	static Login frame;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					 frame = new Login();
					 frame.setResizable(true);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("deprecation")
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(70, 70, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		  
		
	   

		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		//txtUsername.setText("USERNAME");
		txtUsername.setBounds(304, 462, 424, 82);
		
		txtUsername.setForeground(Color.LIGHT_GRAY);
		txtUsername.setBackground(Color.WHITE);
		contentPane.add(txtUsername);
		txtUsername.setColumns(30);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font(getName(), Font.PLAIN, 15));
		passwordField.setBounds(304, 576, 424, 89);
		//passwordField.setText("********");
		passwordField.setForeground(Color.LIGHT_GRAY);
		passwordField.setBackground(Color.WHITE);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBounds(768, 166, 121, 82);
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setForeground(Color.WHITE);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.addActionListener(new ActionListener() {
		

			public void actionPerformed(ActionEvent e) {
				
				System.out.println("hiii");
				
				
				custentry custentry = new custentry(1);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(740, 51, 162, 82);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.BLUE);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel = new JLabel("NewUser ?");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(632, 67, 93, 50);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/project_Package/images/login1.jpg")));
		lblNewLabel_1.setBounds(-11, 0, 1010, 689);
		contentPane.add(lblNewLabel_1);
		
		
		
		
		btnNewButton.addActionListener((e)->{
			
			
		
if(!txtUsername.getText().toString().isEmpty() & !passwordField.getText().toString().isEmpty())
		{
			
			
			
			
       Connection con;
				  
       String url = "jdbc:sqlserver://localhost:1433;databaseName=I3305;integratedSecurity=true;encrypt=false;";
        try {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(url);
			
			
		            
							 					 
	       if (con != null)
	       {
												             
		       System.out.println( "Your are connected");
		       String username,passwordString;
		       username=txtUsername.getText().toString();
		       passwordString=passwordField.getText();
	
		       Statement statement = con.createStatement();
		       String query = "select * from login";
		       
               
	
		      ResultSet rSet= statement.executeQuery(query);
		      int count = 0;
		      while(rSet.next())
		      {
		    	  	 
		    	  if(rSet.getString("Email").equals(txtUsername.getText()) && rSet.getString("password").equals(passwordField.getText())                                              )
		    	  {
		    		  JOptionPane.showMessageDialog(null, "successfulllllllllll login !!!!!");
		    		  PMSSwing f2 = new PMSSwing(1);
					// form1 f1 = new form1(rSet.getString("Email"),(rSet.getInt("password")));
		    		  frame.setVisible(false);
                      count++;
                     
		    	  }
		    	 
		    	  
		      }
		      if(count==0)  JOptionPane.showMessageDialog(null, "email or pass error");

	       }
	       
	       
             } catch (SQLException | ClassNotFoundException ex) {

  
      JOptionPane.showMessageDialog(null, "Impossible to connect "+ex.toString() );

 }

	
		}		

		else 
			{
			JOptionPane.showMessageDialog(null, "Please enter your login");
			}
		
		});
		
	}
	
	
	
	
}
