package Patterns.Alphabet_Patterns;

/* 
    A
    A B
    A B C
    A B C D
    A B C D E
    A B C D E F

    ===========
    All alphabet patterns use ASCII Key .
    Capital "A" -> 65
    Capital "B" -> 66 ....

    Trick : 'A' + number

    => 'A' + 0 = A
    => 'A' + 1 = B
    => 'A' + 2 = C
    => 'A' + 3 = D etc
*/

import java.util.Scanner;

public class Increasing_Alphabet_Letter_Triangle_Pattern {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size : ");
        int size = input.nextInt();

        // Outer Loop for rows
        for(int row =0; row <size; row++){

            // Inner Loop for columns for each row.
            for(int col=0; col <=row ; col++){

                // Convert Number to alphabet using ASCII
                char ch = (char)('A' + col);

                System.out.print(ch + " ");
            }
            System.out.println();
        }
        input.close();
    }
}

/* 
Time Complexity: O(N²), as the total number of characters printed is 1 + 2 + ... + N = O(N²).

Space Complexity: O(1), only loop variables are used.
*/
