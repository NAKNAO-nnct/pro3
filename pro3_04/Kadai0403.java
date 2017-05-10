import java.util.Scanner;

public class Kadai0403 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		Student std[] = new Student[10];
		String item[] = {"名前:","年齢:","学籍番号:","学年:","年:","月:","日:"};
		java.io.PrintStream p = System.out;

		for(int i = 0; i < 10; i++){
			std[i] = new Student();
			p.println(i+1 + "人目");
			
			//　名前入力
			p.print(item[0]);
			std[i].name = scann.next();
			
			//　年齢入力
			p.print(item[1]);
			std[i].age = scann.nextInt();
			
			//　学籍番号入力
			p.print(item[2]);
			std[i].id = scann.nextInt();
			
			//　学年入力
			p.print(item[3]);
			std[i].garde = scann.nextInt();
			
			//　年
			p.print(item[4]);
			std[i].birth_y = scann.nextInt();
			
			//　月
			p.print(item[5]);
			std[i].birth_m = scann.nextInt();
			
			// 日
			p.print(item[6]);
			std[i].birth_d = scann.nextInt();
			
			p.println();
		}
		
		for(int i = 0; i < 10; i++){
			p.print(item[0]);
			p.println(std[i].name);
			p.print(item[1]);
			p.println(std[i].age);
			p.print(item[2]);
			p.println(std[i].id);
			p.print(item[3]);
			p.println(std[i].garde);
			p.print(item[4]);
			p.println(std[i].birth_y);
			p.print(item[5]);
			p.println(std[i].birth_m);
			p.print(item[6]);
			p.println(std[i].birth_d);
			p.println();
		}

	}

}
