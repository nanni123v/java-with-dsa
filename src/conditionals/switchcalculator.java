package conditionals;

import java.util.Scanner;

public class switchcalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        char op= sc.next().charAt(0);
        int b=sc.nextInt();

        switch(op) {
            case '+':
                System.out.println(a + b);
            case '-':
                System.out.println(a - b);
            case '*':
                System.out.println(a * b);
            case '/':
                System.out.println(a / b);
        }
    }
}
