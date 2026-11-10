package loops;

import java.util.Scanner;

public class displayap {
    public static void main(String[] args) {
        //display ap -2,5,8,11 upto n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=-2;i<=(3*n-1);i+=3){
            System.out.println(i);
        }
    }
}
