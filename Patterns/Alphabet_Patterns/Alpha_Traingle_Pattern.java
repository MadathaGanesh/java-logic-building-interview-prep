package Patterns.Alphabet_Patterns;

import java.util.Scanner;

/*
    Pattern Name: Alpha Triangle Pattern

    E
    D E
    C D E
    B C D E
    A B C D E

        Logic:
    - The starting character of each row moves backward from 'E' to 'A'.
    - Inside each row, characters increase sequentially.
*/

public class Alpha_Traingle_Pattern {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter size : ");
        int size = input.nextInt();

       // Outer loop controls the number of rows
        for(int row =0; row <size; row++){

             /*
             * Calculate the starting character for the current row.
             * Example when size = 5:
             * row 0 -> 'A' + 4 = 'E'
             * row 1 -> 'A' + 3 = 'D'
             * row 2 -> 'A' + 2 = 'C'
             * row 3 -> 'A' + 1 = 'B'
             * row 4 -> 'A' + 0 = 'A'
             */
            char startChar = (char) ('A'+size-row-1);

            // Inner loop prints characters in the current row
            for(int col=0; col <=row; col++){

                System.out.print(startChar +" "); // Print the current character
                
                startChar++; // Move to next alphabet
            }
            System.out.println();
        }



        System.out.println("\n \n \n");


        // Aproach 2 : To print above pattern " But this will print upto 'E' letter only".
        for(int i=0; i<size; i++){
            for(char ch=(char) ('E'-i); ch <='E';ch++){
                System.out.print(ch);
            }

            System.out.println();
        }

        input.close();
    }
    
}
