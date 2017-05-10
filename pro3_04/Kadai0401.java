class Student{
	String name = new String();
	int id , garde, age;
	int birth_y, birth_m, birth_d;
	
}
public class Kadai0401 {

	public static void main(String[] args) {
		Student a = new Student(); 
		a.name = "佐藤 鳥之助";
		a.id = 8061;
		a.garde = 3;
		a.birth_y = 1994;
		a.birth_m = 6;
		a.birth_m = 25;
		a.age = 24;
		
		System.out.println("名前：" + a.name);
		System.out.println("学籍番号：" + a.id);
		System.out.println("学年：" + a.garde);
		System.out.println("生年月日：" + a.birth_y + "年" + a.birth_m + "月" + a.birth_d + "日");
		System.out.println("年齢：" + a.age);
	}

}
