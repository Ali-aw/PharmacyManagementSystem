package tagroba;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import jdk.management.jfr.RemoteRecordingStream;

public class frr extends DefaultTableModel{
	

Object columns[] = { "Email", "password"};
Object data[][];

@Override
public Class<?> getColumnClass(int c)
{
	if(c==4)
		return Boolean.class;
	return String.class;
}

	public static void main(String[] args) {
		new frr();
	
	}
	

		public frr() {
			    JFrame f1 = new JFrame();
				f1.setLocationRelativeTo(null); f1.setLayout( new FlowLayout() );
				JButton b1 = new JButton("connect");
				
				
				
			     
				f1.add(b1);
				f1.pack();f1.setVisible(true);
			
			
			
			b1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
															
						Connection con;
								  
 String url = "jdbc:sqlserver://localhost:1433;databaseName=I3305;integratedSecurity=true;encrypt=false;";
		try {
			 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	            con = DriverManager.getConnection(url);
	 
			  if (con != null)
			  {
								             
		            System.out.println( "Your are connected");
		            
		            DefaultTableModel model1 = new DefaultTableModel(data,columns);
					JTable t1 = new JTable(model1);
					JScrollPane  pane = new JScrollPane(t1);					
					f1.add(pane);
					f1.pack();f1.setVisible(true);
				
		            Statement statement= con.createStatement();

		            ResultSet rs= statement.executeQuery( "select * from login" ); //executequery l2n fe result
		            
		                         
					               
		            while( rs.next() ) //returns true if aret line malen else false so bttl3 mn lloop d8re
		            { 
		            	model1.addRow(new Object[] {
		            			rs.getString( "Email" ),rs.getInt("password")
		            			});	
		            	
		            }
		            
		            
	               
					 rs.close();						 
					 
				}
			  

			   
				               
				           
		    	
		    	
		    	
		    	
				
				
				
					
			
			  
			  
		 } 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		catch (SQLException | ClassNotFoundException ex) {
								JOptionPane.showMessageDialog(null, "Impossible to connect " + ex.toString());
								         } 
								    }
															
						});
						
		}	
						
	}






















