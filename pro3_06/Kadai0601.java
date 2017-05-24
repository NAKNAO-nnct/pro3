class Student{
	private String name = new String();
	private int id , garde, age;
	private int birth_y, birth_m, birth_d;
	
	// コンストラクタ
	Student(String n, int a, int b, int c, int d, int e, int f){
		name = n;
		id = a;
		garde = b;
		birth_y = c;
		birth_m = d;
		birth_d = e;
		age = f;
	}
	
	//　呼び出し
	String getName(){
		return name;
	}
	String getBirthday(){
		return birth_y+"年"+birth_m+"月"+birth_d+"日";
	}
	int getID(){
		return id;
	}
	int getGarde(){
		return garde;
	}
	int getAge(){
		return age;
	}
}

public class Kadai0601 {

	public static void main(String[] args) {
		Student a = new Student("佐藤 鳥之助",8501,3,1994,6,25,24);

		System.out.println("名前：" + a.getName());
		System.out.println("学籍番号：" + a.getID());
		System.out.println("学年：" + a.getGarde());
		System.out.println("生年月日：" + a.getBirthday());
		System.out.println("年齢：" + a.getAge());
	}

}
