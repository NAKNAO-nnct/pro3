package pro3_02; /**
 * Created by NakanoYuki on 2017/04/25.
 */
import java.util.Scanner;

public class Kadai0203 {

    static int factorial(int n){
        if(n == 0)
            return 1;
        n = n * factorial(n - 1);
        return n;
    }

    public static void main(String[] args){
        Scanner scann = new Scanner(System.in);
        int a = scann.nextInt();
        System.out.println(factorial(a));

    }
}
