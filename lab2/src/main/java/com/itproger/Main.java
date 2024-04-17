package com.itproger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {

        CoffeeMaker coffeeMaker1 = new CoffeeMaker(true, 700,100); //coffe maker object creation
        Admin admin = new Admin("Alex", 4141, coffeeMaker1); // administrator object creation
        Drink espresso = new Drink("ESPRESSO", 6.5); // drink object creation
        User user1 = new User(); // user object creating

       admin.fillWater(500); //admin functionality testing
       user1.setBalance(500);  // set user balance
       coffeeMaker1.setUser(user1); //set user for coffee maker

        //List<Drink> drinkList = new ArrayList<>(); // drinklist creation

        System.out.println(coffeeMaker1.toString());
        System.out.println(user1.toString());
        System.out.println(admin.toString());
        System.out.println(espresso.toString());





        coffeeMaker1.CoffeeMachineProcess();






    }
}