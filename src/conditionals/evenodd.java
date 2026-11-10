package conditionals;

import java.util.Random;
import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc .nextInt();
        if(n%2==0) System.out.println("even");
        if(n%2!=0) System.out.println("odd");
    }
}
