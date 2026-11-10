package conditionals;
import java.util.Scanner;

public class Isinteger {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your number");
         double x = sc.nextDouble();
         int n= (int)x;
         if(x-n==0) {
             System.out.println("number is integer");
         }else
             {
                 System.out.println("number is not integer");
             }

    }
}
