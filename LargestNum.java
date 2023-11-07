package Day5Assign;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args){
        int num1=46, num2=49, num3=93;

        if ( num1 > num2 )
        {
            if ( num1 > num3 )
            {
                System.out.println("Largest number: " + num1);
            }
            else
            {
                System.out.println("Largest number: " + num3);
            }
        }
        else
        {
            if ( num2 > num3 )
            {
                System.out.println("Largest number: " + num2);
            }
            else
            {
                System.out.println("Largest number: " + num3);
            }
        }
    }
}
