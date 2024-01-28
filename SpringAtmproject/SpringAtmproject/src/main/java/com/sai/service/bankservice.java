package com.sai.service;

import java.util.List;

import com.sai.model.bankapplication;

public interface bankservice {
	public bankapplication savebankapplication(bankapplication bank);
    public bankapplication getbankapplication(long accountno);
	public bankapplication authenticateUser(long accountno, String name, String password);
	public bankapplication updatebankapplication(long accountno, String name, String password, double ammount);
	public bankapplication withdraw(long accountno, String name, String password, double amount);
	public bankapplication transfer(long accountno, String name, String password, long targetAccountNo, double amount);
	public void activateAccount(long accountno);
	public void deactivateAccount(long accountno);
	
	

}
