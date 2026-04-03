package Patterns.Alphabet_Patterns;

import java.util.Scanner;

/*  
Pattern Name: Alpha Ramp Pattern

    A
    B B
    C C C 
    D D D D 
    E E E E E

        Logic:
        - Number of rows = user input
        - Each row prints the same alphabet
        - Alphabet increases every row (A, B, C, D...)
        - Number of alphabets printed = row number + 1
*/
public class Alphabet_Ramp_Pattern {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = input.nextInt();

        // Outer loop controls the number of rows
        // Starts from 0 and runs until (size - 1)
        for(int row =0; row < size; row++){

             /*
             Inner loop controls the number of columns printed in each row
             For row 0 → prints 1 time
             For row 1 → prints 2 times
             For row 2 → prints 3 times
             and so on...
            */
            for(int column =0; column<=row; column++){
                
                /*
                 'A' + row converts the row number into an alphabet

                 row = 0 → 'A'
                 row = 1 → 'B'
                 row = 2 → 'C'
                 row = 3 → 'D'
                 row = 4 → 'E'

                 (char) is used to convert the ASCII value into a character
                */
                System.out.print((char) ('A' +row) + " ");
            }
        System.out.println();
        }
        input.close();
    }
}

/*
Time Complexity: O(N²), because the total number of characters printed is the sum of the first N natural numbers.

Space Complexity: O(1), only loop variables and a character variable are used.
*/
