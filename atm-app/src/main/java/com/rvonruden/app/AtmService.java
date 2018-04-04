package com.rvonruden.app;

import java.math.BigDecimal;

public class AtmService
{
    BankVault bankVault;

    AtmService() 
    {
        bankVault = new BankVault();
        bankVault.InitializeBankVault();
    }

    public BigDecimal CheckBalance(int accountNumber)
    {   
        // find the Bank Account using account number

        // if the bank account is found return balance

        // if the bank accout is not found return null

    }
}