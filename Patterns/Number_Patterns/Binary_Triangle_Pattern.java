package Patterns.Number_Patterns;

import java.util.Scanner;

/*
    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1
    0 1 0 1 0 1

   This pattern prints alternating 1s and 0s in each row.  {Index starts from 0, in our case}
   => For even-indexed based rows, value starts with 1,
   => For odd-indexed based rows, value starts with 0
 
   The value alternates after each print using basic toggling logic.

  For each row, print i+1 numbers while toggling the value between 1 and 0 after each print.
*/

public class Binary_Triangle_Pattern {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = input.nextInt();

        for(int row= 0; row<size;row++){

            // Deciding starting number based on row_Number.
            int start;

            if(row %2 ==0){
                start =1; // If row is even row, starts with "1"
            }else{
                start =0;  // If row is odd row, starts with "0"
            }

            // Inner loop iterating for columns (till <=row) to form right-angled triangle 
            for(int col =0; col <=row; col++){

                System.out.print(start + " ");  // Printing start number

                start = 1-start;  // Toggle Number ( 0 ->1 and 1 -> 0)
            }
            System.out.println();
        }

        input.close();
    }
    
}
