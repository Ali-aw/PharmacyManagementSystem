

package tagroba;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import javax.print.attribute.standard.JobMessageFromOperator;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.TableColumnModelListener;
import javax.swing.table.DefaultTableModel;



import sun.awt.geom.AreaOp.AddOp;

public class exo120182nd {
	JFrame f1;	
	JButton badd,bdlt,bsrch;
	JComboBox cmb;
	JTextField tfdurationavarage,tfbudget;
	JLabel countrylbl,levellbl,durationlbl,bdgetlbl;
	JTable t1;
	JScrollPane pane;
	JCheckBox cb1B,cBox2,cBox3,cBox4;
	

	
	DefaultComboBoxModel<String> modelcombo;
	ButtonGroup bg1,bg2;
	JRadioButton rbprimary,rbsecondary,rbhigher,rb1,rb2,rb3;
	

	public static void main(String[] args) {
		new exo120182nd();

	}

	public exo120182nd() {
		
		f1 = new JFrame();f1.setLocationRelativeTo(null);f1.setLayout(new FlowLayout());

		badd = new JButton("ADDexpense");bdlt = new JButton("DELETE");	bsrch=new JButton("search");	
		tfdurationavarage = new JTextField(10);tfbudget = new JTextField(10);
		
		JLabel countrylbl = new JLabel("country");JLabel levellbl = new JLabel("level");
		JLabel durationlbl = new JLabel("duration avg");JLabel bdgetlbl = new JLabel("budget");
		
		rbprimary = new JRadioButton("primary");
		rbhigher = new JRadioButton("higher");rbsecondary = new JRadioButton("secondary");
		rb1 = new JRadioButton("sec");rb2 = new JRadioButton("bdgt>4000");
		rb3 = new JRadioButton("bdgt<1000");
		
		
		
		bg1 = new ButtonGroup();bg2 = new ButtonGroup();
		bg2.add(rb1);bg2.add(rb2);bg2.add(rb3);
		bg1.add(rbhigher);bg1.add(rbprimary);bg1.add(rbsecondary);
		
			
		 modelcombo =new DefaultComboBoxModel<>();
		 cmb= new JComboBox(modelcombo);
		 modelcombo.addElement("lebanon");
		 modelcombo.addElement("fransa");
		 modelcombo.addElement("syria");
		 
		 DefaultTableModel tModel= new DefaultTableModel();
		 t1 =new JTable(tModel);
		 tModel.addColumn("country");
		 
		 
		 
		 
		 pane = new JScrollPane(t1);
		 
		 
		 
		 
		 cb1B= new JCheckBox("include B ltr");cBox2= new JCheckBox("bdget in higher >secondary");
		 cBox3= new JCheckBox("bdgt in each lvl>3000");cBox4= new JCheckBox("ttl bdgt>1000");
		 
		 /*		 
			//badd.addActionListener((e) ->{
	            
				
				
Connection con;
					  
String url = "jdbc:sqlserver://localhost:1433;databaseName=I3305exo2ndsess;integratedSecurity=true;encrypt=false;";
	try {
	           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				con = DriverManager.getConnection(url);
				
				
			            
								 					 
		       if (con != null)
		       {
													             
			      System.out.println( "Your are connected");
			      
			      
			      
			      
			      
			      
	           /*

			     Statement statement = con.createStatement();
			     String query = "insert into country values('"+cmb.getSelectedItem()+"','" +
			       bg1.getSelection().getActionCommand()+ "',"+Integer.parseInt(tfdurationavarage.getText())
			       +"," 
			    		 +Integer.parseInt(tfbudget.getText())+")";
			       
			System.out.println(""+query);
			System.out.println(""+bg1.getSelection().getActionCommand());
			      statement.executeUpdate(query);
			
			   */  
			 
			
               
		//       }
		       
		       
	//} catch (SQLException | ClassNotFoundException ex) {
///
      
	//	      JOptionPane.showMessageDialog(null, "Impossible to connect "+ex.toString() );

	// }
	
	
	  
		       
		       
			//});
			
			
	/*		
			
			bdlt.addActionListener((e) ->{
				
				Connection con;
				  
	String url = "jdbc:sqlserver://localhost:1433;databaseName=I3305exo2ndsess;integratedSecurity=true;encrypt=false;";
	try {
		  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		 con = DriverManager.getConnection(url);
								
								
							            
												 					 
	   if (con != null)
		{
																	             
			System.out.println( "Your are connected");
			Statement statement = con.createStatement();
			
			if(rb1.isSelected())
			{
			String query="delete from country where country.llevel='secondary' ";
			statement.executeUpdate(query);
							      
			}		      
			if(rb2.isSelected())
			{
			String query="delete from country where country.budget>4000 ";
			statement.executeUpdate(query);				      
			}		      
				
			if(rb2.isSelected())
			{
			String query="delete from country where country.duration<1000 ";
			statement.executeUpdate(query);				      
			}
							
				               
	   }
						       
						       
} catch (SQLException | ClassNotFoundException ex) {

				      
 JOptionPane.showMessageDialog(null, "Impossible to connect "+ex.toString() );

					 }
					
					
						       
						       
						       
							
							
				
			});
			
		
	*/
		 
		 
		 
			bsrch.addActionListener((e) ->{
				
				Connection con;
				  
	String url = "jdbc:sqlserver://localhost:1433;databaseName=I3305exo2ndsess;integratedSecurity=true;encrypt=false;";
	try {
		  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		 con = DriverManager.getConnection(url);
								
								
							            
												 					 
	   if (con != null)
		{
																	             
			System.out.println( "Your are connected");
			Statement statement = con.createStatement();
			
			if(cb1B.isSelected())
			{
			String query="select country.country from country where country.country LIKE '%B%'  ";
			ResultSet rSet=statement.executeQuery(query);
			
			while(rSet.next())
			{
				tModel.addRow(new String[] {rSet.getString("country")});
			}
							      
			}	
			
	
			
			
			if(cBox2.isSelected())
			{
				String query="select c.country from country c where c.llevel='higher'"
						+ " and c.budget>(select c.budget from country c where llevel='secondary')";
				ResultSet rSet=statement.executeQuery(query);
				
				while(rSet.next())
				{
					tModel.addRow(new String[] {rSet.getString("country")});
				}			      
			}		      
				
			if(cBox3.isSelected())
			{
				String query="select c.country, c.budget,c.llevel from country c where c.budget>3000 group by c.budget"
						+ ",c.country,c.llevel";
						
				ResultSet rSet=statement.executeQuery(query);
				
				while(rSet.next())
				{
					tModel.addRow(new String[] {rSet.getString("country")});
				}					      
			}
			
			if(cBox4.isSelected())
			{
				String query="select c.country from country c ";
						
				ResultSet rSet=statement.executeQuery(query);
				
				while(rSet.next())
				{
					tModel.addRow(new String[] {rSet.getString("country")});
				}					      
			}
			
			
							
				               
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
						       
						       
} catch (SQLException | ClassNotFoundException ex) {

				      
 JOptionPane.showMessageDialog(null, "Impossible to connect "+ex.toString() );

					 }
					
					
						       
						       
						       
							
							
				
			});
			
		
		f1.add(badd);f1.add(cmb);f1.add(tfdurationavarage);f1.add(tfbudget);f1.add(countrylbl);f1.add(levellbl);
		f1.add(durationlbl);f1.add(bdgetlbl);f1.add(rbhigher);f1.add(rbprimary);f1.add(rbsecondary);
		//f1.add(rb1);f1.add(rb2);f1.add(rb3);f1.add(bdlt);
		//f1.add(pane);
		//f1.add(cb1B);f1.add(cBox2);f1.add(cBox3);f1.add(cBox4);
		f1.add(bsrch);
		f1.pack();
		f1.setVisible(true);


		

      
    }

	
	
}
