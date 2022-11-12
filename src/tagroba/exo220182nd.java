package tagroba;

import java.awt.FlowLayout;
import java.lang.FdLibm.Pow;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class exo220182nd {
	JFrame f1;
	JTextField lamount,nbofyears,rate,monthlypayment,totalamount;
	JButton bsimulateButton;
	

	public static void main(String[] args) {
		new exo220182nd();
		
	}
	
	public  exo220182nd() {
	
	f1 = new JFrame();f1.setLocationRelativeTo(null);f1.setLayout(new FlowLayout());
	
	
	
	
	lamount= new JTextField(10);nbofyears= new JTextField(10);rate =new JTextField();
	monthlypayment=new JTextField(10);totalamount= new JTextField(10);
	
	bsimulateButton= new JButton();
	
	
	
	bsimulateButton.addActionListener((e) ->{
		
		
 
		
		
	});
	
	
	
	
	
	f1.add(lamount);f1.add(nbofyears);f1.add(rate);f1.add(monthlypayment);f1.add(totalamount);f1.add(bsimulateButton);
	f1.pack();
	f1.setVisible(true);
	
	
	
	}

}
