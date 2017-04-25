import java.util.Scanner;

public class Kadai0101 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		//入力側設定
		String name = scann.nextLine();
		
		System.out.println("ようこそ" + name + "さん");
		scann.close();
	}

}
