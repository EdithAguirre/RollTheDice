/*
the application will roll a pair of dice 20 times. Display the
value of the two dice each time they are rolled. Count how many times the
numbers 2, 4, 6 and 7 are rolled and display the result.
 */
package com.pluralsight;
public class App {
    public static void main(String[] args) {

        // Create an instance of Dice named dice
        Dice dice = new Dice();

        // Create integer variables for roll times and counters
        int roll1, roll2, twoCounter = 0, fourCounter = 0, sixCounter = 0,
                sevenCounter = 0;

        // Loop that executes 100 times
        for (int i = 1; i <= 100; i++){
            // Roll dice twice
            roll1 = dice.roll();
            roll2 = dice.roll();

            // Add the numbers we got from rolling the dice
            int rollSum = roll1 + roll2;

            // Print the value of each roll of the dice
            System.out.printf("Roll %d: %d - %d Sum: %d\n", i, roll1, roll2, rollSum);

            // Determine if the sum of roll1 and roll2 is 2,4,6, or 7 and if so
            // increment the respective counter variable
            if (rollSum == 2) {
                twoCounter++;
            }
            if (rollSum == 4) {
                fourCounter++;
            }
            if (rollSum == 6) {
                sixCounter++;
            }
            if (rollSum == 7) {
                sevenCounter++;
            }
        }

        // When the loop terminates display the counters
        System.out.println("\nTwo counter: " + twoCounter);
        System.out.println("Four counter: " + fourCounter);
        System.out.println("Six counter: " + sixCounter);
        System.out.println("Seven counter: " + sevenCounter);
    }
}
