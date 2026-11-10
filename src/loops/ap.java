package loops;

import java.util.Scanner;

public class ap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        for(int i=1;i<=2*n-1;i+=2)
int a=1,d=2;
for(int i=1;i<=n;i++){
    System.out.println(a);
    a+=d;
}


    }
}
