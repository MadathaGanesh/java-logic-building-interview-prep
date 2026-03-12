package Patterns.Number_Patterns;

import java.util.Scanner;

/*
    1 2 3 4 5 
    1 2 3 4 
    1 2 3 
    1 2 
    1 
*/


// Reverse Decreasing Order Triangle Logic: j <= size - i + 1

// ("j" means "Column" , and "i" means "rows")


public class ReverseRightTriangleNumber{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = input.nextInt();

        ReverseRightTriangleNumber object = new ReverseRightTriangleNumber();
        object.patternPrint(size);
        input.close();
    }

    public void patternPrint(int size){
        
        for(int i =1; i <=size; i++){
            for(int j=1; j <= size-i+1; j++){
                System.out.print(" "+j+" "); 
            }
            System.out.println();
        }

    }
}

