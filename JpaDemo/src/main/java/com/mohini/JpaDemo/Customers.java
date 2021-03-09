package com.mohini.JpaDemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customers {
	
	@Id
	private int cid;
	private String cname;
	private String dish;
	
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getDish() {
		return dish;
	}
	public void setDish(String dish) {
		this.dish = dish;
	}
	@Override
	public String toString() {
		return "Customers [cid=" + cid + ", cname=" + cname + ", dish=" + dish + "]";
	}
	
	
	
}
