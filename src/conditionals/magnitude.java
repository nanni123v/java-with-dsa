package conditionals;
import java.util.Scanner;
public class magnitude {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        x=-x;
        if (x<69) System.out.println("magnitude is less than 69");
        else  System.out.println("magnitude is more than 69");




    }
}
