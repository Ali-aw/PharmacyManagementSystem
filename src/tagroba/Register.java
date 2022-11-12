package tagroba;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 900);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(46, 56, 358, 88);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(130, 21, 96, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(70, 24, 49, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(70, 63, 49, 14);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(140, 52, 96, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(46, 169, 358, 88);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(72, 11, 49, 14);
		panel_1.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(151, 8, 96, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(72, 63, 49, 14);
		panel_1.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(151, 60, 96, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(46, 295, 358, 98);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(71, 23, 49, 14);
		panel_2.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(151, 20, 96, 20);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(46, 64, 201, 23);
		panel_2.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(131, 31, 49, 14);
		contentPane.add(lblNewLabel_5);
	}
}
