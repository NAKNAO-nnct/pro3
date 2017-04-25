package pro3_02;
import java.util.Scanner;

public class Kadai0204 {

    static String imitationList = "高専太郎";

    //文字列連結プログラム
    static void addList(String s){
        imitationList = imitationList + s;
    }

    /*文字列削除プログラム
    文字数より多い数が指定された場合、"error"と出力
     */
    static void deleteList(int n){
        if(n == imitationList.length())
            imitationList = "error";
        else
            imitationList = imitationList.substring(n,imitationList.length());
    }

    
    public static void main(String[] args){
        Scanner scann = new Scanner(System.in);

        //追加する文字列の入力
        System.out.print("追加する文字列：");
        String imitationList = scann.nextLine();

        //文字列の追加処理
        addList(imitationList);

        //文字列連結処理出力
        System.out.println(Kadai0204.imitationList);


        //削除する文字数の入力
        System.out.print("削除する文字数：");
        int imitationLength = scann.nextInt();

        //文字列の削除処理
        deleteList(imitationLength);

        //文字列削除処理出力
        System.out.println(Kadai0204.imitationList);

    }
}
