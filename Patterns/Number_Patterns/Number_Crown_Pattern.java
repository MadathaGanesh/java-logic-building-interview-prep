package Patterns.Number_Patterns;

import java.util.Scanner;

/*

    1             1
    1 2         2 1
    1 2 3     3 2 1
    1 2 3 4 4 3 2 1

 Pattern Structure:
 ------------------
 Each row contains three parts:

 1. Increasing numbers from 1 → row
 2. Spaces in the middle
 3. Decreasing numbers from row → 1

 Number of spaces decreases as rows increase.

 Space formula:
 spaces = 2 * (size - row)

 Total rows = size

*/

public class Number_Crown_Pattern {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = input.nextInt();

        // Outer loop contains number of rows
        for(int rows =1; rows <= size; rows++){

            // Part 1: Print Increasing numbers from  (1 -> row)
            for(int i=1; i<=rows;i++){
                System.out.print(i);
            }

            // Print spaces between two numbers.
            // Number of spaces decreases as rows increases
            for(int n =0; n < 2* (size-rows); n++){ 
                System.out.print(" ");
            }

            // Print decreasing numbers (row -> 1)
            for(int j=rows; j>=1;j--){
                System.out.print(j);
            }

            System.out.println();

          
        }

        input.close();
    }
}
