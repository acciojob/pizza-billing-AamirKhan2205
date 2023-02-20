package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
        boolean isCheeseAdded;
    private String bill;
    boolean isToppingsAdded;
    boolean isTakeaway;
    boolean isBilGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg) {
            price = 300;
            bill += "Base Price Of The Pizza: 300" + "\n";
        }
        else{
            price = 400;
            bill += "Base Price Of The Pizza: 400" + "\n";
        }
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isCheeseAdded){
            isCheeseAdded = true;
            price += 80;
        }
        // your code goes here
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded){
            isToppingsAdded = true;
             if(isVeg){
                 price += 70;
             }
             else{
                 price += 120;
             }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeaway){
            isTakeaway = true;
             price += 20;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBilGenerated){
            isBilGenerated = true;
             if(isCheeseAdded){
                 bill += "Extra Cheese Added: 80" + "\n";
             }
             if(isToppingsAdded){
                 if(isVeg){
                 bill += "Extra Toppings Added: 70" + "\n";
                 }
                 else{
                     bill += "Extra Toppings Added: 120" + "\n";
                 }
             }
             if(isTakeaway){
                 bill += "Paperbag Added: 20" + "\n";

             }
              bill += "Total Price: " + price + "\n";

        }
        return this.bill;
    }
}
