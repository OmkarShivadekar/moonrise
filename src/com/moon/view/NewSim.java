package com.moon.view;

import java.awt.Button;
import java.awt.Choice;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import org.springframework.stereotype.Component;

import javax.swing.JButton;

@Component
public class NewSim {

	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	public JFrame frmAddNewSim;
	
	public NewSim() {
		initialize();
	}

	private void initialize() {
		frmAddNewSim = new JFrame();
		frmAddNewSim.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmAddNewSim.setBounds(100, 100, 450, 300);
		frmAddNewSim.setTitle("Add New SIM");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frmAddNewSim.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label1 = new JLabel("Sim _ID");
		label1.setBounds(47, 31, 46, 14);
		contentPane.add(label1);
		
		JLabel label2 = new JLabel("Sim_Details");
		label2.setBounds(47, 72, 89, 14);
		contentPane.add(label2);
		
		JLabel label4 = new JLabel("Sim_Type");
		label4.setBounds(47, 141, 89, 14);
		contentPane.add(label4);
		
		JLabel label5 = new JLabel("Registration Date");
		label5.setBounds(47, 183, 112, 14);
		contentPane.add(label5);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(209, 28, 153, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(209, 67, 153, 44);
		contentPane.add(textArea);
		
		Choice choice = new Choice();
		choice.setBounds(209, 141, 153, 20);
		contentPane.add(choice);
		choice.addItem("Postpaid");
		choice.addItem("Prepaid");
		
		textField_1 = new JTextField();
		textField_1.setBounds(209, 180, 153, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		Button button = new Button("Submit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setActionCommand("");
		button.setBounds(134, 229, 70, 22);
		contentPane.add(button);
	}
	
	
}
