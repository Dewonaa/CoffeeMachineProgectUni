package com.itproger;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CoffeeMaker
{ Scanner scan = new Scanner(System.in);
    private User user;
    private Drink drink;
    private boolean powerOn; //var which shows if coffee machine is on
    private int waterCapacity = 1000; // var which shows maximum water volume
    private int waterLevel; //var which shows current water level
    private int beansCapacity = 500; // var which shows maximum beans amount
    private int coffeeBeans; // var which shows coffee beans
    //constructor
    public CoffeeMaker(boolean powerOn, int waterLevel, int coffeeBeans)
    {
        this.powerOn = powerOn; // initial state of coffee machine
        this.waterLevel = waterLevel; //initial level of water
        this.coffeeBeans = coffeeBeans; // initial amount of coffee beans

    }
    public void setDrink(Drink drink)
    {
         this.drink = drink;
    }
    public Drink getDrink()
    {
        return drink;
    }


    // Getter and Setter for User
    public User getUser()
    {
        return user;
    }
    public void setUser(User user)
    {
        this.user = user;
    }

    // Getter and Setter of state
    public boolean getPowerOn()
    {
        return powerOn;
    }
    public void setPowerOn(boolean powerOn)
    {
        this.powerOn = powerOn;
    }

    // Getters for waterCapacity and beansCapacity
    public int getWaterCapacity()
    {
        return waterCapacity;
    }
    public int getBeansCapacity()
    {
        return beansCapacity;
    }

    //Getters and Setters for waterCapacity
    public int getWaterLevel()
    {
        return waterLevel;
    }
    public void setWaterLevel(int waterLevel)
    {
        this.waterLevel = waterLevel;
    }
    //Getters and Setters for beansCapacity
    public int getCoffeeBeans()
    {
        return coffeeBeans;
    }
    public void setCoffeeBeans(int coffeeBeans)
    {
        this.coffeeBeans = coffeeBeans;
    }
@Override
public String toString()
{
    return "Coffee Machine {" +
            "power ON = " + getPowerOn() +
            ", water capacity = " + waterCapacity +
            ", beans capacity = " + beansCapacity +
            ", water level = " + waterLevel +
            ", coffee beans amount = " + coffeeBeans +
            "}";
}


    // managing machine methods
    public void addWater(int amount)
    {
        waterLevel += amount;
    }
    public void addCoffeeBeans(int amount)
    {
        coffeeBeans += amount;
    }


//    //Choose drink
    private void output(Drink out_drink)
    {
        System.out.println(out_drink);
    }


    //default statement drink
    int drinking = 6;
    int adds = 0;
    int end = 2;
    //Choosing drink
    public void ChooseDrink ()
    {
        System.out.println("        MENU         ");
        System.out.println("-1-");
        System.out.println(Drink.americano());

        System.out.println("-2-");
        System.out.println(Drink.espresso());

        System.out.println("-3-");
        System.out.println(Drink.cappuccino());

        System.out.println("-4-");
        System.out.println(Drink.latte());

        System.out.println("-5-");
        System.out.println(Drink.hotWater());

        System.out.println("-6-");
        System.out.println(Drink.hotChocolate());

        System.out.println("-7-");
        System.out.println("I did not choose yet\n");


        System.out.println("Enter what do you want to order\n");

    }

//
//    //User input
    public int input ()
    {
        int drinking = scan.nextInt();

        this.drinking = drinking;
        return drinking;
    }
    public int inputAdditions ()
    {
        int adds = scan.nextInt();

        this.adds = adds;
        return adds;
    }
    public int inputEndProcess ()
    {
        int end = scan.nextInt();

        this.end = end;
        return end;
    }
    public void inputDecisions ()
    {
        int input = scan.nextInt();
        if (input == 1) {
            ChooseSupplements();
        } else if (input == 2) {
            MakeDrink(this.drinking);
        }
    }


    //User input result
    public void MadeAChoise ( int drink)
    {

        switch (drink) {

            case 1:
                System.out.println(Drink.espresso());
                break;
            case 2:
                System.out.println(Drink.americano());
                break;
            case 3:
                System.out.println(Drink.cappuccino());
                break;
            case 4:
                System.out.println(Drink.latte());
                break;
            case 5:
                System.out.println(Drink.hotWater());
                break;
            case 6:
                System.out.println(Drink.hotChocolate());
                break;
            case 7:
                System.out.println("You have not chosen your drink, wanna end process?   1 for YES    2 for NO");
                inputEndProcess();
                EndProcess();
                break;
        }
        if (drink >= 1 && drink < 7) {
            System.out.println("You choose a drink, want to add supplements?  1 for YES    2 for NO");
            inputDecisions();
        }

    }


    public void EndProcess ()
    {
        if (end == 1) {
            System.out.println("End process");
            System.exit(0);
        } else if (end == 2) {
            System.out.println("Do you want to make order   1 for YES    2 for NO?");
            inputEndProcess();
            if (end == 1) {
                ChooseDrink();
                input();
                MadeAChoise(this.drinking);

            } else {
                System.out.println("End process");
                System.exit(0);
            }

        }

    }

    public void ChooseSupplements () {

        System.out.println("Additions");
        System.out.println("-1-");
        System.out.println("Sugar");
        System.out.println("*** 0,2$ ***");

        System.out.println("-2-");
        System.out.println("Milk");
        System.out.println("*** 0,5$ ***");

        System.out.println("-3-");
        System.out.println("Nothing of the above");
        inputAdditions();
        AddSupplements();

    }

    public void AddSupplements () {
        int sugarCounter = 0;
        int milkCounter = 0;
        if (adds == 1) {
            sugarCounter += 1;
            System.out.println("+sugar");
            MakeDrink(this.drinking);


        } else if (adds == 2) {
            milkCounter += 1;
            System.out.println("+milk");
            MakeDrink(this.drinking);

        } else {
            System.out.println("You did not choose any supplements");
            MakeDrink(this.drinking);
        }
    }
    public void WantAnotherDrink()
    {
        System.out.println("Your drink is ready. Do you want to order another?   1 for YES   2 for NO   ");
        inputEndProcess();
        if(this.end == 1 )
        {
            ChooseDrink();
            input();
            MadeAChoise(this.drinking);
        }
        else
        {
            //Pay();
        }

    }

    //Making coffee
    public void MakeDrink ( int drink)
    {
        switch (drink)
        {
            case 1:
                System.out.println("Making " + Drink.espresso());
                break;
            case 2:
                System.out.println("Making " + Drink.americano());
                break;
            case 3:
                System.out.println("Making " + Drink.cappuccino());
                break;
            case 4:
                System.out.println("Making " + Drink.latte());
                break;
            case 5:
                System.out.println("Making " + Drink.hotWater());
            case 6:
                System.out.println("Making " + Drink.hotChocolate());
        }
        if (waterLevel >= 100 && coffeeBeans >= 20)
        {

            waterLevel -= 100;
            coffeeBeans -= 20;
            switch (drink)
            {
                case 1:
                    System.out.println(Drink.espresso() + " is ready!");
                    break;
                case 2:
                    System.out.println(Drink.americano() + " is ready!");
                    break;
                case 3:
                    System.out.println(Drink.cappuccino() + " is ready!");
                    break;
                case 4:
                    System.out.println(Drink.latte() + " is ready!");
                    break;
                case 5:
                    System.out.println(Drink.hotWater() + " is ready!");
                case 6:
                    System.out.println(Drink.hotChocolate() + " is ready!");

            }
        }
        else if (waterLevel < 100)
        {
            System.out.println("ERROR!!! \n Not enough water");
        }
        else if (coffeeBeans < 20)
        {
            System.out.println("ERROR!!! \n Not enough coffee beans");
        }
        else
        {
            System.out.println("ERROR!!! \n Fill up machine");
        }

        WantAnotherDrink();


    }

    public void CoffeeMachineProcess()
    {
        ChooseDrink();
        input();
        MadeAChoise(this.drinking);

    }



    // System.out.println("You choose one drink, want another?\n Enter 1 for YES\n Enter 2 for NO\n");
    //int option = 0;
    //public int inputAmount ()
   // {
      //  int option = scan.nextInt();
      //  this.option = option;
       // return option;
   //}
   // public void AnotherDrink ( int value) {
       // while (this.option == 1) {

          //  ChooseDrink();
          //  input();
           // MadeAChoise(this.drink);
           // inputAmount();


       // } if(value==2) {
          //  System.out.println("Thank you for order");
       // }

    //}





}
