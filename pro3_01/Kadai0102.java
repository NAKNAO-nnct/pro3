import java.util.*;

public class Kadai0102 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		Random rdn = new Random();
		
		//占い師側
		String[] fortune = {
				"完全でありたい人",
				"人の助けになりたい人",
				"成功を追い求める人",
				"特別な存在であろうとする人",
				"知識を得て観察する人",
				"安全を求め慎重に行動する人",
				"楽しさを求め計画する人",
				"強さを求め自己主張する人",
				"調和と平和を願う人"
				};
		
		//computer
		String[] user = new String[3];
		String[] cp = {"名前","年齢","趣味"};
		
		//表示
		System.out.println("性格診断");
		for(int i = 0; i < 3; i++) {
			System.out.print(cp[i] + "を入力してください");
			System.out.println();
			user[i] = scann.nextLine();
		}
		
		//コンピュータ判定アルゴリズム
		int result = (rdn.nextInt(5) + 100 + (user[2].length())) + (user[0].length()) + Integer.parseInt(user[1]);
		if(result > 0) {
			result = result +(-result) + 100;
		}
		if(result >= 100){
			result = result / 100;
		}else if (result >= 10){
			result = result / 10;
		}
		
		//診断結果発表
		System.out.println("あなたは...");
		System.out.println("[" + fortune[result] + "]です。");
	}

}
