package patternprinting;

import java.util.Scanner;

public class p1234 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j<= n; j++) {
                System.out.print(j );
              //  System.out.print(i ); 1111
            }
            System.out.println(" ");
        }
    }
}
