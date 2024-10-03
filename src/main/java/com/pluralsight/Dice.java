/*
Dice class that contains a method to roll dice
 */
package com.pluralsight;

public class Dice {

    // method generates a random number between 1 and 6
    public int roll(){
        // int randomNumber = (int)(Math.random() * maxValue) + minValue;
        int randomNumber = (int)(Math.random() * 6) + 1;
        return randomNumber;
    }
}
