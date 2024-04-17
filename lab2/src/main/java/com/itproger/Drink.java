package com.itproger;

import java.util.List;


public class Drink
{
    private String name;
    private double price;
    private List<Drink> Drink;
    //constructor
    public Drink(String name, double price)
    {
        this.name = name;
        this.price = price;
    }
    //Getter name
    public String getName()
    {
        return name;
    }
    //Getter price
    public double getPrice()
    {
        return price;
    }

    @Override
    public String toString()
    {
        return "Drink {" +
                "name = '" + name + '\''+
                ", price = " + price +
                "}";

    }
    //Objects
    public static Drink espresso()
    {
        return new Drink("ESPRESSO", 6.5);
    }
    public static Drink latte()
    {
        return new Drink("LATTE", 5.95);
    }
    public static Drink cappuccino()
    {
        return new Drink("CAPPUCCINO", 5.95);
    }
    public static Drink americano()
    {
        return new Drink("AMERICANO", 4.75);
    }
    public static Drink hotChocolate()
    {
        return new Drink("HOT CHOCOLATE", 4.15);
    }
    public static Drink hotWater()
    {
        return new Drink("HOT WATER", 1.0);
    }

}
