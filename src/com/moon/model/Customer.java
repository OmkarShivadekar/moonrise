package com.moon.model;

public class Customer
{
	private int cid;
	private int sim_id;
    private String govt_id_proof;
    private int status;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getSim_id() {
		return sim_id;
	}
	public void setSim_id(int sim_id) {
		this.sim_id = sim_id;
	}
	public String getGovt_id_proof() {
		return govt_id_proof;
	}
	public void setGovt_id_proof(String govt_id_proof) {
		this.govt_id_proof = govt_id_proof;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
