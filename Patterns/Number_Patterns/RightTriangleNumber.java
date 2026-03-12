package Patterns.Number_Patterns;

import java.util.Scanner;

/*
    (Here Print columns5)

    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
*/


public class RightTriangleNumber {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size : ");

        int size = input.nextInt();

        // Outer loop for rows from 1 to size
        for(int row = 1 ; row <= size ; row++){

            // Print column Numbers from 1 to row
            for(int col = 1; col <=row ; col++){
                System.out.print( " "+ col + " ");
            }
            System.out.println();
        }


        input.close();
    }
    
}


/*
   Time Complexity: O(N²), because the outer loop runs N times and the inner loop runs up to i times for each row.

    Space Complexity: O(1), since only loop variables are used.
*/