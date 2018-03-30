package com.rvonruden.app;

import java.math.BigDecimal;

public class BankVault
{
    BankAccount[] bankAccounts;

    void BankVault()
    {
        bankAccounts = new BankAccount[1];
        BankAccount bankAccount =  new BankAccount();
        // bankAccount.AccounNumber(12345);
        // bankAccount.Balance(new BigDecimal("99.05"));
        bankAccounts[0] = bankAccount;
    }

    public BigDecimal CheckBalance(int accountNumber)
    {
        return bankAccounts[0].Balance();
    }
}