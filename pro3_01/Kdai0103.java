import java.util.Scanner;
public class Kdai0103 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		//config
		String dis = "長介";
		String[] name = new String[100];
		//入力処理
		System.out.println("縁起がいいと思う名前を入力してください");
		for(int i = 0; i< 100; i++){
			//System.out.print();
			name[i] = scann.nextLine();
			
			//END処理
			if(name[i].equals(dis)){
				break;
			}
		}
		
		//表示処理
		System.out.print("寿限無寿限無");
		for(int i = 0; i < 100; i++){
			System.out.print(name[i]);
			if(name[i].equals(dis)){
				System.exit(0);
			}
		}
		System.out.print(dis);
			
	}

}
