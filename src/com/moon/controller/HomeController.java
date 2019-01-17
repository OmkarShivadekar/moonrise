package com.moon.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

import com.moon.view.Home;
import com.moon.view.NewSim;

public class HomeController implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// This will communicate with dao
		
	
		
		if(e.getActionCommand().equals("Save"))
		{
			JOptionPane.showMessageDialog(null, "Data Saved");
		}
		
		if(e.getActionCommand().equals("Add new SIM"))
		{
			Home ss = new Home();
			System.out.println("sss");

			NewSim ssss= new NewSim();
			ssss.frmAddNewSim.setVisible(true);
			
			
			ss.customer_details.dispatchEvent(new WindowEvent(ss.customer_details, WindowEvent.WINDOW_CLOSING));
			
			
		}
		
		
		
		
		
	}

}
