package com.moon.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

public class NewSim {

	public JFrame frmAddNewSim;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewSim window = new NewSim();
					window.frmAddNewSim.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NewSim() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddNewSim = new JFrame();
		frmAddNewSim.setTitle("Add New SIM");
		frmAddNewSim.setBounds(100, 100, 450, 300);
		frmAddNewSim.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddNewSim.getContentPane().setLayout(null);
		
		
		
		JButton btnHome = new JButton("Home");
		btnHome.setBounds(77, 138, 89, 23);
		frmAddNewSim.getContentPane().add(btnHome);
	}

}
