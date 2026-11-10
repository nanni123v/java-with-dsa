package conditionals;

import java.util.Scanner;

public class logicoperator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int x = sc.nextInt();
        if(x%5==0||x%3==0) System.out.println("divisble by 3 or 5");
        else System.out.println("not divisible by 3 or 5");
    }
}
