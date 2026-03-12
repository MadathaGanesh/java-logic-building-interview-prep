package Patterns.Number_Patterns;

import java.util.Scanner;

/*
    In this pattern, instead of printing increasing numbers from 1 to i in each row, we print the row number itself repeatedly.
    For example, the first row prints 1, the second row prints 2 2, the third row prints 3 3 3, and so on until N.

    (Here Print rows)

    1
    2 2
    3 3 3
    4 4 4 4
    5 5 5 5 5 

*/

public class RightTriangleNumbers {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Size : ");

        int size = input.nextInt();

        // Outer loop for rows from 1 to size
        for( int rows = 1 ; rows <= size; rows++){

            // For each row, use an inner loop (col) from 1 to rows.
          // Instead of printing col, print rows (the current row number).
           for(int col = 1; col <=rows; col++){

            System.out.print(" "+ rows + " ");
           
            }

           // Moving to next line
           System.out.println();
        }
        input.close();
    }
    
}

/*
    Time Complexity: O(n^2), Outer loop execute from 1 to size and the inner loop executes "rows times" for each row.

    Space Complexity: O(1), since only loop variables are used.

*/