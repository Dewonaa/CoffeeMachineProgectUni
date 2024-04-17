package com.itproger;

public class Admin
{
    private String name;
    private int id;
    private CoffeeMaker сoffeeMaker;


//constructor
public Admin(String name, int id, CoffeeMaker coffeeMaker)
{
this.сoffeeMaker = coffeeMaker;
this.name = name;
this.id = id;
}
//Getters
public CoffeeMaker getСoffeeMaker()
{
    return this.сoffeeMaker;
}
public String getName()
{
    return name;
}
public int getId()
{
    return id;
}

//fill coffee maker
    public void fillWater(int waterLevel)
    {
        this.сoffeeMaker.setWaterLevel(waterLevel);
    }
    public void fillCoffeeBeans(int coffeeBeans)
    {
        this.сoffeeMaker.setCoffeeBeans(coffeeBeans);
    }

    @Override
    public String toString()
    {
        return "Admin {" +
                "admin name '" + name + '\'' +
                ", admin id = " + id +
                "}";
    }
}

