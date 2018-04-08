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

    public boolean DoesBankAccountExist(int accountNumber)
    {
        BankAccount bankAccount = bankVault.Get_Bank_Account(accountNumber);
        if(bankAccount != null)
        {
            return true;
        }
        return false;
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
        BankAccount bankAccount = bankVault.Get_Bank_Account(accountNumber);
        // Does bank account exist
        if(bankAccount != null)
        {
            // if exist does it have enough funds to withdraw
            int canWithdraw = bankAccount.Balance().compareTo(withdrawAmmount);
            if(canWithdraw == 0 || canWithdraw == 1)
            {
                // if it does withdraw funds and return balance
                BigDecimal newBalance = bankAccount.Balance().subtract(withdrawAmmount);
                bankAccount.Balance(newBalance);
                return newBalance;
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
                BigDecimal newBalance = bankAccount.Balance().add(depositAmmount);
                bankAccount.Balance(newBalance);
                return newBalance;
        }
        return null;
    }
}
