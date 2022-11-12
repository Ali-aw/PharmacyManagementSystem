package tagroba;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import sun.nio.cs.ext.AbstractCharsetProvider;

public class exo2db extends DefaultTableModel{
	
	JFrame f1 ;
	JButton b1;
	JTextField tf1,tf2,tf3,tf4;
	JLabel l1,l2,l3,l4;
	JCheckBox cBox;
	
	
	

	Object[] headersObjects={"Name","surname","age","id","vegiterian"};
    Object[][] dataObjects= {
    		{"fd","f","rge","er",true}
    		
    };

	
    
	
	public static void main(String[] args) {
		new exo2db();
	
	
	}
	
	@Override
 	public Class<?> getColumnClass(int c)
 	{
		System.out.println("hiiii");
 		if(c==4) { return boolean.class;}
 		return String.class;
 	}	
	
		public exo2db() {
		
			

			
			f1 = new JFrame();
			f1.setLocationRelativeTo(null); f1.setLayout( new FlowLayout() );
			
			//b1 = new JButton("insert");
			b1 = new JButton("Add");
			
			tf1 = new JTextField(10);tf2 = new JTextField(10);tf3 = new JTextField(10);tf4 = new JTextField(10);
			
			l1 = new JLabel("name");l2 = new JLabel("surname");l3 = new JLabel("age");l4 = new JLabel("id");
			
			cBox = new JCheckBox("vegiterian", true);
			
			f1.add(b1);f1.add(tf1);f1.add(tf2);f1.add(tf3);f1.add(tf4);
			f1.add(l1);f1.add(l2);f1.add(l3);f1.add(l4);f1.add(cBox);
			f1.pack();f1.setVisible(true);
			
			b1.addActionListener((e) -> {
				
			
	            
				
					
Connection con;
					  
String url = "jdbc:sqlserver://localhost:1433;databaseName=I3305;integratedSecurity=true;encrypt=false;";
	try {
	           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				con = DriverManager.getConnection(url);
			            
								 					 
		       if (con != null)
		       {
													             
			      System.out.println( "Your are connected");
	
			
			     DefaultTableModel mod3 = new DefaultTableModel(dataObjects, headersObjects);
			     JTable t2 = new JTable(mod3);
			
			     
			     JScrollPane pane1 = new JScrollPane(t2);
			     f1.add(pane1);f1.pack();f1.setVisible(true);
			

			     Statement statement = con.createStatement();
			     String query = "select * from person";
			
			     ResultSet rSet = statement.executeQuery(query);
			
			
			     while(rSet.next())
			     {
				
			    
				    mod3.addRow(new Object[] {
				    		
				    		
				    		rSet.getString("Name") ,rSet.getString("surname") 
				    		,rSet.getInt("age"),rSet.getInt("id") , false
				    
				    });
			     }
			     
			     
			
		       
                 rSet.close();
               
		       }
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       
	} catch (SQLException | ClassNotFoundException ex) {

      
		      JOptionPane.showMessageDialog(null, "Impossible to connect "+ex.toString() );

	 }
	
	
				
			});
			
		
		}
		
	
	
		
}

	
	
	
	
	
	
