package tagroba;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.TableColumnModelListener;

import com.sun.accessibility.internal.resources.accessibility;
import com.sun.tools.classfile.Opcode.Set;

public class tailhead {
	JFrame f1;
	JList l1,lcopy;
	JButton b1,b2,bcopy;
	JComboBox cmb;
	JTextField tf1;
	String string ;
	int sel_item_list_index;
	DefaultListModel<String> model,modelcopy;
	DefaultComboBoxModel<String> modelcombo;
	ButtonGroup bg1;
	JRadioButton rbtail,rbhead;
	JCheckBox boxdoubleBox;

	public static void main(String[] args) {
		new tailhead();

	}

	public tailhead() {
		
		f1 = new JFrame();f1.setLocationRelativeTo(null);f1.setLayout(new FlowLayout());

		b1 = new JButton("ADD");b2 = new JButton("remove");	bcopy = new JButton("copy");		
		tf1 = new JTextField(10);
		
		rbtail =new JRadioButton("tail");rbhead =new JRadioButton("heat");
		bg1 = new ButtonGroup();
		bg1.add(rbhead);bg1.add(rbtail);
		boxdoubleBox=new JCheckBox("withoutdouble");
		
		
		
		model =new DefaultListModel<>();//ma fyye tzeka w3rfo array list
		l1=new JList(model);
		model.addElement("1");
		model.addElement("2");
		
		modelcopy =new DefaultListModel<>();
		lcopy=new JList(modelcopy);
		modelcopy.addElement("c1");
		modelcopy.addElement("c2");
		
		
		
		 modelcombo =new DefaultComboBoxModel<>();
		 cmb= new JComboBox(modelcombo);
			modelcombo.addElement("even");
			modelcombo.addElement("odd");
		
		
	
		
			
			
		
		    b1.addActionListener((e)  ->{
			string =tf1.getText();
			
			 if (rbhead.isSelected() | rbtail.isSelected()) 
			 {
		
			        if(rbtail.isSelected())
			        {									
							 
			           model.addElement(string);
			           modelcombo.addElement(string);
			
			        }
			
			
                   if(rbhead.isSelected())
                   {	

                       model.add(0, string);
                       modelcombo.insertElementAt(string, 0);

                   }
		    }
		    else JOptionPane.showMessageDialog(null,"plz select where do u want to insert");
         
			
		});
		
		b2.addActionListener((e) -> {
			Object currentitemString= cmb.getSelectedItem();
			
			
			if(currentitemString!=null)
			{								
				if(currentitemString=="even")
				{
					System.out.println("even");
					
					for(int i=0;i<=model.getSize();i++)
					{						
						if(Integer.parseInt(model.getElementAt(i)) %2==0)						
							model.remove(i);										
					}
		
					
				}
				else 
					{
					     for(int i=0;i<=model.getSize();i++)
					     {
						
						        if(Integer.parseInt(model.getElementAt(i)) %2!=0)						
							    model.remove(i);
						
				
					     }
					}
				
					
				
			}
		
		
			
			
			
			

			
			
			
			
			
			
			
			
			
			/*
			int i=modelcombo.getSize()-1;
			int i2=model.getSize()-1;
			System.out.println(""+i);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			/*
			 if (rbhead.isSelected() | rbtail.isSelected()) 
			 {
		
			        if(rbtail.isSelected())
			        {									
			        			
						model.removeElementAt(i2);								
						modelcombo.removeElementAt( i  );
			           
			
			        }
			
			
                   if(rbhead.isSelected())
                   {	
                	  		
						model.removeElementAt(0);										
						modelcombo.removeElementAt(0);


                   }
		    }
		    else JOptionPane.showMessageDialog(null,"plz select where do u want to insert");
         */
			
						
			//ma fyye bl combobox em7e mn 5lel l model
			
			
		});
		
		bcopy.addActionListener((e)  ->{
			
			ArrayList<Object> arrayList = new ArrayList<>();
			if(boxdoubleBox.isSelected())
			{
				
				
				
				for(int i=0; i<=model.getSize()-1;i++)
				{
					
					
					if( !arrayList.contains(model.getElementAt(i)) )
					{
						arrayList.add(model.getElementAt(i));
						modelcopy.add(i, model.getElementAt(i));
						
					}
					
				}
				
			}
			else 
				{
				    for(int i=0; i<=model.getSize()-1;i++)
				    {
				
						modelcopy.add(i, model.getElementAt(i));
				   
					
				    }
			    }
			
			
			
		});
		
		
		
		f1.add(b1);f1.add(b2);f1.add(cmb);f1.add(l1);f1.add(tf1);f1.add(rbhead);f1.add(rbtail);f1.add(lcopy);
		f1.add(bcopy);f1.add(boxdoubleBox);
		f1.pack();
		f1.setVisible(true);


		

      
    }

	
	
}

