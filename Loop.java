//WAP TO PRINT 1 TO N NATURAL NUMBERS USING WHILE LOOP

import java.util.*;
class Loop {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int i = 1;
        while(i<=n) {
            System.out.println(i);
            i=i+1;
        }

    }
}