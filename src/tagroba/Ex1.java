/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tagroba;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class Ex1  {

    String[] entete = {"studentId", "Name", "score", "passed"};
    DefaultTableModel model;

	public static void main(String[] args) {
		new Ex1();
		
	}
    public Ex1() {

        JFrame f = new JFrame("Boolean an checkBox");
        f.setSize(1000, 1000);
        model = new myModel();
        model.setColumnIdentifiers(entete);
        JTable tb = new JTable(model);
        JScrollPane scp = new JScrollPane(tb);
        model.addRow(new Object[]{"S001", "bob", 90, true});
        model.addRow(new Object[]{"S002", "hassan", 90, true});
        model.addRow(new Object[]{"S002", "jinane", 90, true});
        f.add(scp);

        f.pack();
        f.setVisible(true);
        f.setLocationRelativeTo(null);
    }

   
    }


	
    