package pro3_02;

import java.util.*;

public class Kadai0201 {
    static Random rdn = new Random();

    static String[] user = new String[3];
    static int result = 0;
    static String[] ft = {"大凶","大吉","大凶","吉","大凶","大凶","小吉","大凶","凶"};

    //判定
    static int process(String a, String b, String c){
        result = (rdn.nextInt(5) + 100 + (c.length())) + (a.length()) + Integer.parseInt(b);
        if(result > 0) {
            result = result +(-result) + 100;
        }
        if(result >= 100){
            result = result / 100;
        }else if (result >= 10){
            result = result / 10;
        }
        return result ;
    }

    //過去
    static void past(int a){
        a = rdn.nextInt(9) * a;
        System.out.println(ft[a]);
    }

    //現在
    static void current(int a){
        a = rdn.nextInt(9) * a;
        System.out.println(ft[a]);
    }

    //未来
    static void future(int a){
        a = rdn.nextInt(9) * a;
        System.out.println(ft[a]);
    }

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        String[] cp = {"名前","年齢","趣味"};

        //表示
        System.out.println("性格診断");
        for(int i = 0; i < 3; i++) {
            System.out.print(cp[i] + "を入力してください");
            System.out.println();
            Kadai0201.user[i] = scann.nextLine();
        }

        process(Kadai0201.user[0], Kadai0201.user[1], Kadai0201.user[2]);

        System.out.println("あなたの過去の運勢は");
        past(Kadai0201.result);

        System.out.println("あなたの現在の運勢は");
        current(Kadai0201.result);

        System.out.println("あなたの未来の運勢は");
        future(Kadai0201.result);

    }

}
