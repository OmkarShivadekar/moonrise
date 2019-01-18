package com.moon.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.moon.controller.HomeController;

import javax.swing.JComboBox;
import javax.swing.JButton;

public class Home {

	public JFrame customer_details;
	public static JTextField cust_name;
	public static JTextField textField_1;
	public static JTextField textField_3;
	
	@Autowired
	private static HomeController theHomeController;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		//getting bean from IOC
		theHomeController = (HomeController)context.getBean("homeController");
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.customer_details.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Home() {
		initialize();
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		customer_details = new JFrame();
		customer_details.setTitle("Customer Details");
		customer_details.setBounds(100, 100, 667, 525);
		customer_details.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		customer_details.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setToolTipText("");
		lblNewLabel.setBounds(143, 104, 46, 14);
		customer_details.getContentPane().add(lblNewLabel);
		
		JLabel lblGovtId = new JLabel("Govt ID");
		lblGovtId.setToolTipText("We'll never share your details.");
		lblGovtId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGovtId.setBounds(143, 140, 64, 14);
		customer_details.getContentPane().add(lblGovtId);
		
		JLabel lblSelectSimId = new JLabel("Select SIM ID");
		lblSelectSimId.setToolTipText("");
		lblSelectSimId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSelectSimId.setBounds(143, 177, 92, 14);
		customer_details.getContentPane().add(lblSelectSimId);
		
		JLabel lblChoosePlan = new JLabel("Choose Plan");
		lblChoosePlan.setToolTipText("");
		lblChoosePlan.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblChoosePlan.setBounds(143, 214, 92, 14);
		customer_details.getContentPane().add(lblChoosePlan);
		
		JLabel lblBalance = new JLabel("Balance");
		lblBalance.setToolTipText("");
		lblBalance.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBalance.setBounds(143, 252, 92, 14);
		customer_details.getContentPane().add(lblBalance);
		
		cust_name = new JTextField();
		cust_name.setBounds(280, 103, 178, 20);
		customer_details.getContentPane().add(cust_name);
		cust_name.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(280, 134, 178, 20);
		customer_details.getContentPane().add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(280, 251, 178, 20);
		customer_details.getContentPane().add(textField_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(280, 176, 178, 20);
		customer_details.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(280, 213, 178, 20);
		customer_details.getContentPane().add(comboBox_1);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(212, 303, 89, 23);
		customer_details.getContentPane().add(btnSave);
		
		//we used DI here
		btnSave.addActionListener(theHomeController);
		
		
		
		JButton btnReset = new JButton("Reset");
		
		btnReset.setBounds(313, 303, 89, 23);
		customer_details.getContentPane().add(btnReset);
		
		JButton btnNewSim = new JButton("Add new SIM");
		btnNewSim.setBounds(468, 175, 121, 23);
		customer_details.getContentPane().add(btnNewSim);
		
		//DI
		btnNewSim.addActionListener(theHomeController);
		
		JButton btnNewPlan = new JButton("Add new Plan");
		btnNewPlan.setBounds(468, 212, 121, 23);
		customer_details.getContentPane().add(btnNewPlan);
		
		
		
		
	}
}
