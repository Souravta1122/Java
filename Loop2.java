//WAP TO PRINT 1 TO N EVEN NUMBER USING FOR LOOP

import java.util.*;
public class Loop2 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for(int i=1 ; i<=n ; i++) {
            if(i%2==0) {
                System.out.println(i);
            }
        }
    }
}
