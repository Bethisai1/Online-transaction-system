package com.sai.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class bankapplication {
	@Id
	private long accountno;
	private String name;
	private String password;
	private double ammount;
	private String address;
	private int mobile;
	public bankapplication() {
		super();
	}
	public bankapplication(long accountno, String name, String password, double ammount, String address, int mobile) {
		super();
		this.accountno = accountno;
		this.name = name;
		this.password = password;
		this.ammount = ammount;
		this.address = address;
		this.mobile = mobile;
	}
	public long getAccountno() {
		return accountno;
	}
	public void setAccountno(long accountno) {
		this.accountno = accountno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getAmmount() {
		return ammount;
	}
	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "bankapplication [accountno=" + accountno + ", name=" + name + ", password=" + password + ", ammount="
				+ ammount + ", address=" + address + ", mobile=" + mobile + "]";
	}
	

	
	

	    private boolean active;

	    

	    public boolean isActive() {
	        return active;
	    }

	    public void setActive(boolean active) {
	        this.active = active;
	    }
	}


