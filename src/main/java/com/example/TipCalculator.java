package com.example;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW

        int tipPercent = percent;
        double bill  = cost;
        double totalTip = Math.round((bill * tipPercent / 100.0)*100.0) / 100.0;
        double totalBill = Math.round((bill + totalTip)*100.0)/100.0;
        double costPerPerson = Math.round((bill/people*100.0))/100.0;
        double tipPerPerson = Math.round((totalTip / people*100.0))/100.0;
        double totalPerPerson = Math.round((totalBill / people*100.0))/100.0;

        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + bill + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + totalTip + "\n" +
                       "Total Bill with tip: $" + totalBill + "\n" +
                       "Per person cost before tip: $" + costPerPerson + "\n" +
                       "Tip per person: $" + tipPerPerson + "\n" +
                       "Total cost per person: $" + totalPerPerson + "\n" +
                       "-------------------------------\n";

        
        System.out.println(result);
        return result;
    }

    public static String extraCredit(int people, int percent, double cost) {
        List<String> items = new ArrayList<String>();
        String result = "Extra credit not implemented";
        //  COPY AND PASTE YOUR PROGRAM FROM calculateTip() HERE
        int tipPercent = percent;
        double bill  = cost;
        double totalTip = Math.round((bill * tipPercent / 100.0)*100.0) / 100.0;
        double totalBill = Math.round((bill + totalTip)*100.0)/100.0;
        double costPerPerson = Math.round((bill/people*100.0))/100.0;
        double tipPerPerson = Math.round((totalTip / people*100.0))/100.0;
        double totalPerPerson = Math.round((totalBill / people*100.0))/100.0;
        
        result = "-------------------------------\n" +
                       "Total bill before tip: $" + bill + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + totalTip + "\n" +
                       "Total Bill with tip: $" + totalBill + "\n" +
                       "Per person cost before tip: $" + costPerPerson + "\n" +
                       "Tip per person: $" + tipPerPerson + "\n" +
                       "Total cost per person: $" + totalPerPerson + "\n" +
                       "-------------------------------\n";
        
        System.out.println(result);
        
        // the while loop condition is checked,
        // and if TRUE, runs the code inside.
        // when the code inside is done running, the condition is rechecked,
        // and the loop repeats as long as the condition remains TRUE.
        // when the condition becomes FALSE, it stops
        System.out.println("Enter each item ordered, one at a time. When done, enter -1");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            
            
            String food = scanner.nextLine();
            if (food.equals("-1")){
                break;
            }
            items.add(food);

        }
        result+= "Items ordered:\n";
        for(int i=0; i<items.size(); i++){
            result+= items.get(i) + "\n";
        }
        result+= "-------------------------------\n";
        return result;
        }
    
    
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people=2; 
        int percent=18;
        double cost=5.99;              
        //System.out.println(calculateTip(people,percent,cost));
        System.out.println(extraCredit(people, percent, cost));
    }
}
        
