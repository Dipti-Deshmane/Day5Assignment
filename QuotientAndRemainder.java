package Day5Assign;

import java.util.Scanner;

public class QuotientAndRemainder {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            double quotient;
            double reminder;
              quotient=num1/num2;
              reminder=num1%num2;

            System.out.println("Quotient is: "+quotient);
            System.out.println("Reminder is: "+reminder);

        }
}
