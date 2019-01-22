package com.moon.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.moon.view.Home;
import com.moon.view.NewSim;
import com.moon.view.Plan;

@Component
public class HomeController implements ActionListener {
	


	private String name;
	
	@Autowired
	NewSim sim;
	
	@Autowired
	Plan plan;
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// This will communicate with dao
		
		
		if(e.getActionCommand().equals("Save"))
		{
			JOptionPane.showMessageDialog(null, "Data Saved");
		}
		
		if(e.getActionCommand().equals("Add new SIM"))
		{
			System.out.println("button click");
			
			name = Home.cust_name.getText();
			System.out.println(name);
			
			//global = (NewSim) beans(null);
			sim.frmAddNewSim.setVisible(true);
			
			
			
			
			//ss.customer_details.dispatchEvent(new WindowEvent(ss.customer_details, WindowEvent.WINDOW_CLOSING));
			
			
		}else if(e.getActionCommand().equals("Add new Plan")){
			plan.frame.setVisible(true);
			
		}
		
		
		
		
		
	}
	
	
}
