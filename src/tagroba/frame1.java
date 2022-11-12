package tagroba;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class frame1 extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1 frame = new frame1();
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
	public frame1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		table = new JTable();
		contentPane.add(table);
		JScrollPane scrollPane = new JScrollPane(table);
		contentPane.add(scrollPane);
		
		JButton btnNewButton = new JButton("connect-printdata");
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
	Connection con;
			  
         String url = "jdbc:sqlserver://localhost:1433;databaseName=I3305;integratedSecurity=true;encrypt=false;";
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url);
            
            DefaultTableModel model1 = new DefaultTableModel();
            model1.addRow(new Object[] { "ali",22  });




         if (con != null)
         {
			             
            System.out.println( "Your are connected");
            Statement statement= con.createStatement();

            ResultSet rs= statement.executeQuery( "select * from login" ); //executequery l2n fe result
            model1=(DefaultTableModel)table.getModel();
			               
			               
            while( rs.next() ) //returns true if aret line malen else false so bttl3 mn lloop d8re
            { 
	
        	//Access the data using the indices (the first index is 1, not zero) 
	        String email= rs.getString(1); 
	        int pass = rs.getInt(2); 
	
	        model1.addRow(new Object[] {email,pass});
	
	
	       //System.out.println(" Email: " + email); 
	       //System.out.println("password: " + pass); 
           }
            
            
            table.setModel(model1);
	        rs.close();		               
			               
			               
		               
			      								               
      }
} 





catch (SQLException | ClassNotFoundException ex) {
			JOptionPane.showMessageDialog(null, "Impossible to connect " + ex.toString());
			         } 
			    }
										
	});
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	
				
						
		contentPane.add(btnNewButton);
		
		
	
	}

}
