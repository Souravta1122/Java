//WAP TO MAKE A CALCULATOR USING SWITCH

import java.util.*;
public class Calculator {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.print("Enter operation : ");
        int operation = sc.nextInt();

        switch(operation) {
            case 1 : System.out.println(a+b);
            break;

            case 2 : System.out.println(a-b);
            break;

            case 3 : System.out.println(a*b);
            break;

            case 4 : if(b==0) {
                System.out.println("Invalid Input");
            }
            else {
                System.out.println(a/b);
            }
            break;

            default : System.out.println("Invalid Operation");
        }

    }
}
