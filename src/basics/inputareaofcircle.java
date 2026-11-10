package basics;

import java.util.Scanner;

public class inputareaofcircle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double r= sc.nextDouble();
        double a=3.141592*r*r;
        System.out.println(a);
    }
}
