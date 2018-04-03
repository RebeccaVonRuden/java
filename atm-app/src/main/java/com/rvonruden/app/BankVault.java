package com.rvonruden.app;

import java.math.BigDecimal;
import java.util.ArrayList;

import com.rvonruden.app.BankAccount;

public class BankVault
{
    BankAccount[] bankAccounts;

    public void InitializeBankVault()
    {
        bankAccounts = new BankAccount[2];
        BankAccount ba1 = new BankAccount();
        ba1.AccountNumber(12345);
        ba1.Balance( new BigDecimal("99.05"));
        BankAccount ba2 = new BankAccount();
        ba2.AccountNumber(43215);
        ba2.Balance( new BigDecimal("50.15"));
        bankAccounts[0] = ba1;
        bankAccounts[1] = ba2;
    }

    public BankAccount Get_Bank_Account(int accountNumber)
    {
        for( int i=0; i <= bankAccounts.length - 1; i++)
        {
            if(bankAccounts[i].AccountNumber() == accountNumber)
            {
                return bankAccounts[i];
            }
        }
        return null;
    }
}