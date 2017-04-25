package pro3_02;

import java.util.Scanner;

public class Kadai0202 {

    /* method */
    static int factorial(int n){
        int a = n;
        for(int i=1; i<n; i++){
            a = a * i;
        }
        return a ;
    }

    /* main */
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        System.out.print("x!の計算：x = :");
        int num = scann.nextInt();

        //factorial(num);
        System.out.println(factorial(num));
    }

}
