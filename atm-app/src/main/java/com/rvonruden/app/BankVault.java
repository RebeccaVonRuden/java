package com.rvonruden.app;

import java.math.BigDecimal;
import java.util.ArrayList;

import com.rvonruden.app.BankAccount;

public class BankVault
{
    BankAccount[] bankAccounts;

    public void InitializeBankVault()
    {
        bankAccounts = new BankAccount[1];
        BankAccount b = new BankAccount();
        b.AccountNumber(12345);
        b.Balance( new BigDecimal("99.05"));
        bankAccounts[0] = b;
    }

    public BankAccount Get_Bank_Account(int accountNumber)
    {
        return bankAccounts[0];
    }
}