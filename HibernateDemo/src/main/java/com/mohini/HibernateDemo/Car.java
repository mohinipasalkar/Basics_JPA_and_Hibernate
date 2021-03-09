package com.mohini.HibernateDemo;

public class Car {
	private int carid;
	private String carname;
	private String color;
	
	public int getCarid() {
		return carid;
	}
	public void setCarid(int carid) {
		this.carid = carid;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car [carid=" + carid + ", carname=" + carname + ", color=" + color + "]";
	}
	
	
}
