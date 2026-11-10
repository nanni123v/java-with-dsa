package conditionals;

import java.util.Scanner;

public class ternaryoperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((n%2==0)?"even":"odd");
        // if else k shortrcut ternary operator h
    }
}
