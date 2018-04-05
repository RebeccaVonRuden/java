package com.rvonruden.app;

import java.math.BigDecimal;

public class BankAccount
{
    int account_Number;
    BigDecimal balance; 

    public int AccountNumber(int accountNumber) 
    {
        account_Number = accountNumber;
        return account_Number;
    }

    public int AccountNumber() 
    {
        return account_Number;
    }

    public BigDecimal Balance(BigDecimal inputBalance)  
    {
        balance = inputBalance;
        return balance;
    }

    public BigDecimal Balance() 
    {
        return balance;
    }

}

