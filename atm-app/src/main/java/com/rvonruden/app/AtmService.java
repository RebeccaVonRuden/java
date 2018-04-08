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
        BankAccount bankAccount = bankVault.Get_Bank_Account(accountNumber);
        if(bankAccount != null)
        {
            return bankAccount.Balance();
        }
        return null;
    }
    
    public BigDecimal WithdrawFromAccount(int accountNumber, BigDecimal withdrawAmmount)
    {
        // Get bank account
        BankAccount bankAccount = bankVault.Get_Bank_Account(accountNumber);
        // Does bank account exist
        if(bankAccount != null)
        {
            // if exist does it have enough funds to withdraw
            int canWithdraw = bankAccount.Balance().compareTo(withdrawAmmount);
            if(canWithdraw == 0 || canWithdraw == 1)
            {
                // if it does withdraw funds and return balance
                return bankAccount.Balance().subtract(withdrawAmmount);
            }
            return null;
            // if it does not return null
        }
        throw new IllegalArgumentException("No account with that account number");
    }

    public BigDecimal DepositToAccount(int accountNumber, BigDecimal depositAmmount)
    {
        // Get bank account
        BankAccount bankAccount = bankVault.Get_Bank_Account(accountNumber);
        // Does bank account exist
        if(bankAccount != null)
        {
                // if it does deposit funds and return balance
                return bankAccount.Balance().add(depositAmmount);
        }
        return null;
    }
}
