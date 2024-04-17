package com.itproger;
import java.util.List;

public class User
{
   private int balance = 0;
   private List<Drink> Drink;

   // Class User constructor
   public User()  {}

   //Balance setter
   public  void setBalance(int balance)
    {
        this.balance = balance;
    }
    //Balance getter
    public int getBalance()
    {
        return this.balance;
    }
    //Top up the account method
    public void deposit(int amount)
    {
        balance += amount;
    }
    //withdraw money from the account
    public void withdraw(int amount)
    {
        if(balance >= amount)
        {
            balance -= amount;
        }
        else
        {
            System.out.println("Insufficient funds");
        }
    }
    @Override
    public String toString()
    {
        return "User {" +
                "balance = " + balance +
                "}";

    }

}
