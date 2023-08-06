//WAP TO PRINT N TO 1 NATURAL NUMBERS USING WHILE LOOP

import java.util.*;
public class Loop1 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        do {
            System.out.println(n);
            n=n-1;
        } while(n>=1);
        

    }
    
}
