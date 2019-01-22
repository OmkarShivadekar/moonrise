package com.moon.model;

public class Sim 
{
    private int sim_id;
    private int sim_status;
    private String sim_type;
    private String reg_date;
	public int getSim_id() {
		return sim_id;
	}
	public void setSim_id(int sim_id) {
		this.sim_id = sim_id;
	}
	public int getSim_status() {
		return sim_status;
	}
	public void setSim_status(int sim_status) {
		this.sim_status = sim_status;
	}
	public String getSim_type() {
		return sim_type;
	}
	public void setSim_type(String sim_type) {
		this.sim_type = sim_type;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
}
