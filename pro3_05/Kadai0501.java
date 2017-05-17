/* 
 * (c) 2017 TROMPOT.nara
 * 2017 / 05 / 17
 */
class Student{
	private String name = new String();
	private int id , garde, age;
	private int birth_y, birth_m, birth_d;
	
	// private変数に格納
	void setName(String n){
		name = n;
	}
	void setID(int in){
		 id = in;
	}
	void setGarde(int in){
		 garde = in;
	}
	void setBirth_Y(int in){
		birth_y = in;
	}
	void setBirth_M(int in){
		birth_m = in;
	}
	void setBirth_D(int in){
		birth_d = in;
	}
	void setAge(int in){
		age = in;
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

public class Kadai0501 {

	public static void main(String[] args) {
		Student a = new Student();
		a.setName("佐藤 鳥之助");
		a.setID(8501);
		a.setGarde(3);
		a.setBirth_Y(1994);
		a.setBirth_M(6);
		a.setBirth_D(25);
		a.setAge(24);
		System.out.println("名前：" + a.getName());
		System.out.println("学籍番号：" + a.getID());
		System.out.println("学年：" + a.getGarde());
		System.out.println("生年月日：" + a.getBirthday());
		System.out.println("年齢：" + a.getAge());
	}

}
