package com.bean;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class product {
	@Id
	@GeneratedValue
	int pid;
	
	String pName;
	
	int pQty;
	public product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public product(int pid, String pName, int pQty) {
		super();
		this.pid = pid;
		this.pName = pName;
		this.pQty = pQty;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpQty() {
		return pQty;
	}
	public void setpQty(int pQty) {
		this.pQty = pQty;
	}
	@Override
	public String toString() {
		return "product [pid=" + pid + ", pName=" + pName + ", pQty=" + pQty + "]";
	}
	
	
}
