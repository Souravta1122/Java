//WAP TO PRINT A TABLE OF A NUMBER

import java.util.*;
public class Table {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for(int i=1 ; i<11 ; i++) {
            System.out.println(n*i);
        }
        
    }
}
