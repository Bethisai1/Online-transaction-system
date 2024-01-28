package com.sai.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sai.configuration.Otptwilio;
import com.sai.model.bankapplication;
import com.sai.repo.Myrepo;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Service
public class bankserviceimp implements bankservice {

    @Autowired
    private Myrepo repo;

    @Override
    public bankapplication savebankapplication(bankapplication bank) {
        repo.save(bank);
        return bank;
    }

    @Override
    public bankapplication updatebankapplication(long accountno, String name, String password, double amount) {
        bankapplication bank = repo.findById(accountno).get();

        if (bank != null && name.equals(bank.getName()) && password.equals(bank.getPassword())) {
            double newAmount = bank.getAmmount() + amount;
            bank.setAmmount(newAmount);
            repo.save(bank);
            return bank;
        }

        return null;
    }

    @Override
    public bankapplication getbankapplication(long accountno) {
        bankapplication get = repo.findById(accountno).get();
        return get;
    }

    @Override
    public bankapplication authenticateUser(long accountno, String name, String password) {
        bankapplication authenticatedUser = repo.findByAccountnoAndNameAndPassword(accountno, name, password);
        return authenticatedUser;
    }

    @Override
    public bankapplication withdraw(long accountno, String name, String password, double amount) {
        bankapplication bank = repo.findById(accountno).get();

        if (bank != null && name.equals(bank.getName()) && password.equals(bank.getPassword())) {

            if (bank.getAmmount() >= amount) {
                double newAmount = bank.getAmmount() - amount;
                bank.setAmmount(newAmount);
                repo.save(bank);
                return bank;
            }
        }

        return null;
    }

    @Override
    public bankapplication transfer(long accountno, String name, String password, long targetAccountNo, double amount) {
        bankapplication sourceAccount = repo.findById(accountno).get();
        bankapplication targetAccount = repo.findById(targetAccountNo).get();

        if (sourceAccount != null && targetAccount != null && name.equals(sourceAccount.getName())
                && password.equals(sourceAccount.getPassword())) {

            if (sourceAccount.getAmmount() >= amount) {
                double newSourceAmount = sourceAccount.getAmmount() - amount;
                double newTargetAmount = targetAccount.getAmmount() + amount;

                sourceAccount.setAmmount(newSourceAmount);
                targetAccount.setAmmount(newTargetAmount);

                repo.save(sourceAccount);
                repo.save(targetAccount);

                return sourceAccount;
            }
        }

        return null;
    }

    @Override
    public void activateAccount(long accountno) {
        bankapplication bank = repo.findById(accountno).orElse(null);
        if (bank != null && !bank.isActive()) {
            bank.setActive(true);
            repo.save(bank);
        }
    }

    @Override
    public void deactivateAccount(long accountno) {
        bankapplication bank = repo.findById(accountno).orElse(null);
        if (bank != null && bank.isActive()) {
            bank.setActive(false);
            repo.save(bank);
        }
    }
	}
