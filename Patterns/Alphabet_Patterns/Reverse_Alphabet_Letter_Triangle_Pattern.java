package Patterns.Alphabet_Patterns;
/*
    A B C D E
    A B C D
    A B C 
    A B
    A

*/

import java.util.Scanner;

public class Reverse_Alphabet_Letter_Triangle_Pattern {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter size : ");

        int size = input.nextInt();

        // Outer loop to control number of rows
        for(int row =0; row <size; row++){

            /*
                Inner Loop prints alphabets in each row

                "size-row" : determines how many letters to print.

                Example: when size = 5

                row : 0 -> letters : 5 -> A B C D E
                row : 1 -> letters : 4 -> A B C D ... etc
            */
            for(int j=0; j <= size-row-1;j++){

                // Convert number to an Alphabet using ASCII value.
                char ch = (char)('A' + j);

                // Print the alphabet followed by space
                System.out.print(ch + " ");
            }

            System.out.println();
        }

        input.close();
    }
    
}

/*
Time Complexity: O(N²), due to the total number of characters printed.

Space Complexity: O(1), only loop variables are used.
*/