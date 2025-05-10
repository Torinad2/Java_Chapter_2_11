/********************************************************
 * Circuit Board Profit Calculator                      *
 * This program prompts the user to enter the retail    *
 * price of a circuit board, calculates the profit      *
 * based on a 40% margin, and displays the result.      *
 ********************************************************/

import java.util.Scanner;

public class CircuitBoardProfit {

    /********************************************************
     * Main Method                                          *
     * Prompts the user for the retail price, calculates    *
     * the profit, and displays the result.                 *
     ********************************************************/
    public static void main(String[] args) {

        //**********************************************
        // Constant Declarations                       *
        // Fixed value representing 40% profit margin  *
        //**********************************************
        final double PROFIT_MARGIN = 0.4;

        //**********************************************
        // Variable Declarations                       *
        // To store user input and calculated values   *
        //**********************************************
        double retailPrice;          // Retail price of the circuit board
        double profit;               // Calculated profit from the retail price

        //**********************************************
        // Input Section                               *
        // Prompting the user to enter the retail price*
        //**********************************************
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the retail price of the circuit board: $");
        retailPrice = keyboardInput.nextDouble();

        //**********************************************
        // Calculation Section                         *
        // Calculate the profit using the profit margin*
        //**********************************************
        profit = retailPrice * PROFIT_MARGIN;

        //**********************************************
        // Output Section                              *
        // Display the calculated profit               *
        //**********************************************
        System.out.println();
        System.out.printf("%-25s $%.2f\n", "Retail Price:", retailPrice);
        System.out.printf("%-25s $%.2f\n", "Profit Earned:", profit);

        //**********************************************
        // Developer Credit                            *
        //**********************************************
        System.out.println("\nDeveloped by: Nikita Baiborodov");

        //**********************************************
        // Resource Cleanup                            *
        // Close the scanner to prevent resource leaks *
        //**********************************************
        keyboardInput.close();
        System.exit(0);
    }
}
