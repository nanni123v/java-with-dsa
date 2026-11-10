package patternprinting;

import java.util.Scanner;

public class pabcde {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int n= sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=97;j<=n; j++){
                System.out.print((char)j);
            }
            System.out.println(" ");
        }
    }

}
