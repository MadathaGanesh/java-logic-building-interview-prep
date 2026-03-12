package Patterns.Number_Patterns;

import java.util.Scanner;

/*
    Pattern Name: FLoyd's Triangle
    
    Increasing Number Triangle  from 1 to N(size)
 
    1
    2  3
    4  5  6
    7  8  9  10
    11 12 13 14 15

    => Use "Counter" variable to increment the number and print that number.
*/

public class Floyds_Triangle {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number : ");
        int size = input.nextInt();

        // Variable to store the number that will be printed.
        // starts from 1 and increasing till size 
        int counter =1;

        // Outer loop controls the number of rows
        for(int row =0; row <size; row++){

            // Inner loop controls the number of columns in each row.
            // Each row prints (row+1) number.
            for(int col=0; col<=row; col++){

                // Prints the current number
                System.out.print(counter + " ");

                // Increase the number to next number.
                counter = counter+1;
            }
            System.out.println();
        }
        input.close();

    }

}

/*
Time Complexity: O(N²), since the total number of printed values across rows is 1 + 2 + ... + N = O(N²).

Space Complexity: O(1), only a counter variable is used.
*/