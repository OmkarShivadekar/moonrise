package com.moon.model;

public class Plan 
{
    private int plan_id;
    private int type_id;
    private String plan_type;
    private int validity;
    private String recharge_date;
	public int getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(int plan_id) {
		this.plan_id = plan_id;
	}
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	public String getPlan_type() {
		return plan_type;
	}
	public void setPlan_type(String plan_type) {
		this.plan_type = plan_type;
	}
	public int getValidity() {
		return validity;
	}
	public void setValidity(int validity) {
		this.validity = validity;
	}
	public String getRecharge_date() {
		return recharge_date;
	}
	public void setRecharge_date(String recharge_date) {
		this.recharge_date = recharge_date;
	}
}
