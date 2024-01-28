package com.sai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sai.model.bankapplication;
import com.sai.service.bankservice;

@Controller
public class Mycontroller{

    @Autowired
    private bankservice service;

    @RequestMapping("/a")
    public String homepage() {
        return "home";
    }

    @RequestMapping("/newacount")
    public String bankfrom() {
        return "newacount";
    }

    @RequestMapping("/register")
    public String saveform(bankapplication bank) {
        service.savebankapplication(bank);
        return "success";
    }

    @RequestMapping("/balance")
    public String balance(bankapplication bank, ModelMap model) {
		return "balance";
    }

    @RequestMapping("/view")
    public String viewAll(@RequestParam long accountno, @RequestParam String name, @RequestParam String password, ModelMap model) {
        bankapplication authenticatedUser = service.authenticateUser(accountno, name, password);

        if (authenticatedUser != null) {
            model.put("authenticatedUser", authenticatedUser);
            return "viewform";
        } else {
        	
            return "errorform";
        }
    }
    @RequestMapping("/deposite")
    public String deposite() {
		return "deposite";
    	
    }
    @RequestMapping("/views")
    public String depositeform(@RequestParam long accountno,@RequestParam String name,@RequestParam String password,@RequestParam double ammount,ModelMap model)
    {
    	model.put("account",service.updatebankapplication(accountno, name, password, ammount));
		return "display"; 
    }
    
    @RequestMapping("/withdraw")
    public String withdraw() {
		return "withdraw";
    	
    }
        @RequestMapping("/withdraws")
        public String withdrawform(@RequestParam long accountno, @RequestParam String name, @RequestParam String password, @RequestParam double ammount, ModelMap model) {
            bankapplication account = service.withdraw(accountno, name, password, ammount);

            if (account != null && account.isActive()) {
                // Perform withdrawal operation
                model.put("accno", account);
                return "withcut";
            } else{
                // Handle inactive account
                return "inactiveAccount";
            }
        }

    
    @RequestMapping("/transfer")
    public String transferform() {
		return "transfer";
    
    }
    
    @RequestMapping("/trans")   
    public String transferAmount(@RequestParam long accountno, @RequestParam String name, @RequestParam String password, @RequestParam long targetAccountNo, @RequestParam double amount, ModelMap model) {
        bankapplication result = service.transfer(accountno, name, password, targetAccountNo, amount);

        if (result != null) {
            model.put("accou", service.transfer(accountno, name, password, targetAccountNo, amount));
            return "transferResult";
            
        } else {
        	
        	return "traserror";        	
         
        }        	
        }
    @RequestMapping("/close")
    public String closeacount() {
        return "close";
    }

    @RequestMapping("/activate")
    public String activateAccount(@RequestParam long accountno) {
        service.activateAccount(accountno);
        return "redirect:/a";
    }

    @RequestMapping("/deactivate")
    public String deactivateAccount(@RequestParam long accountno) {
        service.deactivateAccount(accountno);
        return "redirect:/a";
    }

    @RequestMapping("/about")
    public String aboutfrom() {
        return "about";
    }
}
