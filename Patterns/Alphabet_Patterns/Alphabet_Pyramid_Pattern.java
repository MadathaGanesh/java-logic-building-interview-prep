package Patterns.Alphabet_Patterns;

import java.util.Scanner;

/*
    Pattern Name: Alpha hill pattern

        A
      A B A
    A B C B A
  A B C D C B A
A B C D E D C B A 

*/

public class Alphabet_Pyramid_Pattern {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size : ");
        int size = input.nextInt();

        // Outer loop controls the number of rows
        for(int row =0; row < size; row++){

            // print spaces before characters to form pyramid shape
            for(int space=0; space <(size-row-1); space++){
                System.out.print(" ");
            }

            // starting character of each row
            char ch = 'A';

            // Print chacters in increasing then decreasing order
            for(int j=0; j < 2*(row)+1; j++){

              System.out.print(ch); // Print current character

              /*
                 * If current position is before the middle of the row,
                 * increase the character (A → B → C ...)
                 * Otherwise decrease the character (C → B → A ...)
              */
              if(j < row){
                ch++;
              }else{
                ch--;
              }

            }

            System.out.println();
        }
        input.close();
    }
    
}


/*
Time Complexity: O(N²), because for each of the N rows, up to 2N characters (spaces and letters) may be printed, resulting in O(N²) total operations.

Space Complexity: O(1), as only a constant amount of extra space is used for variables like ch and breakpoint.
*/