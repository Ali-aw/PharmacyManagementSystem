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

public class exodb{
	
	JFrame f1 ;
	JButton b1;
	JTextField tf1,tf2,tf3,tf4;
	JLabel l1,l2,l3,l4;
	JCheckBox cBox;


	public static void main(String[] args) {
		new exodb();
	
	}

		public exodb() {
			
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
			
			
			
			//String email =tf1.getText();//lzm bs e3ml insert 7ot ' ' l2n m3rfo varchar
			//String password =tf2.getText();
			
			
			//String query ="insert into login values("+email+","+Integer.parseInt(password)+")";
			//String query ="delete from login where password =  " +password;
			
			
			//String query ="insert into person values("+tf1.getText()+","+tf2.getText()+
			//","+Integer.parseInt(tf3.getText())+","+Integer.parseInt(tf4.getText())+","
					
			
			//+" )";
			//statement.executeUpdate(query);
			
			//System.out.println(""+cBox.isSelected());
			Statement statement = con.createStatement();
			String query = "select * from person";
			
			ResultSet rSet = statement.executeQuery(query);
			
			
			JTable t2 = new JTable();
			JScrollPane pane1 = new JScrollPane(t2);
			
			Object[] headersObjects={"Name","surname","age","id","vegiterian"};
			Object[][] dataObjects;
			
			DefaultTableModel mod3 = new DefaultTableModel();
			
			f1.pack();f1.setVisible(true);
			
			
			
			
			while(rSet.next())
			{
				
				System.out.println(""+rSet.getString("Name"));
				//mod3.addRow(new Object[] {   rSet.getString("Name")    })
			}
			
			//System.out.println(""+rSet); bkon feha SQLServerResultSet:1
			
			//System.out.println(""+statement);   //statement is a counter     
            rSet.close();
													      								               
		}
	}
			
			
				
	
			
	
			});
	
	
	
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		catch (SQLException | ClassNotFoundException ex) {
		JOptionPane.showMessageDialog(null, "Impossible to connect " + ex.toString());
		
		}
		}
		});
													    
		}
		
}					
				



