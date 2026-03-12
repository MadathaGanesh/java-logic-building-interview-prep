package Patterns.Number_Patterns;

import java.util.Scanner;

/*
    Pattern Name: Number pattern : The pattern is a square with concentric layers of numbers:

    4 4 4 4 4 4 4
    4 3 3 3 3 3 4
    4 3 2 2 2 3 4
    4 3 2 1 2 3 4
    4 3 2 2 2 3 4
    4 3 3 3 3 3 4
    4 4 4 4 4 4 4 

    size =4

    => Total number of rows and columns = 2*(size)-1 

*/


public class Number_Pattern {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n value : ");

        int n = input.nextInt();  // Highest number in the pattern

        // The size of the matrix will be (2*n - 1)
        // Example: if n = 4 → size = 7
        int size = 2*(n)-1;         

        // Outer loop controls rows
        for(int row = 0; row <size; row++){

            // Inner loop controls columns
            for(int col=0; col <size;col++){

                // Distance of the current cell from the top edge
                int top = row; // (Starting top value is "row")

                // Distance from the left edge
                int left = col; // (Starting left value is "col")
               
                // Distance from the bottom edge
                int bottom = size-1-row; // (7 - row value)

                // Distance from the right edge
                int right = size-1-col;  // (7 - column value)

                // Find the minimum distance from all four edges
                // This tells us which "layer" the cell belongs to
                int distance = Math.min(Math.min(top, bottom),Math.min(right, left));

                // Calculate the value to print
                // Outer layer = n, inner layers decrease by 1
                int value = n-distance;

                // Print the value with space
                System.out.print(value + " ");
  
            }
            System.out.println();
        }
 
        input.close();
    }
    
}

/*
“The matrix size is (2n − 1) × (2n − 1). Since we iterate through every cell using two nested loops, the time complexity is O(n²). The algorithm uses only a few variables and no extra data structures, so the space complexity is O(1).”

*/