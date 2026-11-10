package patternprinting;

import java.util.Scanner;

public class pAbCdEf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int col=sc.nextInt();
        int n=sc.nextInt();
        int p=sc.nextInt();
        int j=0;

        for(int i=65;i<=n;i++) {
            if(j %2==0){
                for ( j = 1; j <= col; j++) {
                    System.out.print((char)i+" ");
                }
            }else {
            for( i=1;i<=col;i++){
             for ( j = 97; j <= p; j++) {
                 System.out.print((char)i+" ");
             }
            System.out.println(" ");
        }

}}}}
