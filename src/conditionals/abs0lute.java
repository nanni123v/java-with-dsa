package conditionals;

import java.util.Scanner;

public class abs0lute {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        if(x<0) System.out.println(-x);
        else System.out.println(x);
    }
}
