package Patterns.Number_Patterns;

import java.util.Scanner;

/*
    Pattern Name: Pascal's Triangle

        1
       1 1    => 1+1 =2 (2 is written in middle in next row)
      1 2 1   => 1+2 =3 (first 3), 2+1 = 3 (second 3) these two 3's are written in next row
     1 3 3 1  => 1+3 =4 (first 4), 3+3 = 6 (first 6), 3+1 =4 (last/second 4) are written in next row.s
    1 4 6 4 1

    => First and Last letters are always "1" (one) only.

    => Each middle element is the sum of the two elements above it.

    This comes from the combinatorics identity:
        C(n,r)=C(n-1,r-1)+C(n-1,r)
        So every element equals sum of the two elements above it.

*/
public class Pascals_Triangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter size : " );
        int size = input.nextInt();

        // Outer loop controls number of rows
        for(int row =0; row<size;row++){

            // Print spaces to align the triangle shape, Spaces decrease as rows increase
            for(int space =0; space <(size-row);space++){
                System.out.print(" ");
            }

            // 'value' stores the current element of Pascal's Triangle. Every row starts with 1.
            int value =1;
                        
            // Inner loop prints elements in the current row
            for(int col=0; col <=row; col++){
                System.out.print(value + " ");                  // Print current value
                
                /*
                    Calculate next value using formula:

                    value = value * (row - col) / (col + 1)

                    Example (row = 4):
                    1 → 4 → 6 → 4 → 1
                */
                value = value *(row-col) /(col+1);
            }
            System.out.println();
        }
        input.close();
        
    }
    
}
