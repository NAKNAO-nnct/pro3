public class Kadai0402 {

	public static void main(String[] args) {
		java.io.PrintStream p = System.out;
		Student a = new Student();
		Student b = new Student();
		Student c = new Student();
		Student d[] = {a,b,c};
		
		a.name = "佐藤 鳥之助";
		a.id = 8023;
		a.garde = 5;
		a.birth_y = 1994;
		a.birth_m = 6;
		a.birth_m = 25;
		a.age = 24;
		
		b.name = "冬 将軍";
		b.id = 9061;
		b.garde = 3;
		b.birth_y = 1991;
		b.birth_m = 9;
		b.birth_m = 15;
		b.age = 20;
		
		c.name = "真賀田 四季";
		c.id = 3341;
		c.garde = 1;
		c.birth_y = 1865;
		c.birth_m = 1;
		c.birth_m = 2;
		c.age = 2;
		
		for(int i = 0; i < 3; i++){
			System.out.println("名前：" + d[i].name);
			System.out.println("学籍番号：" + d[i].id);
			System.out.println("学年：" + d[i].garde);
			System.out.println("生年月日：" + d[i].birth_y + "年" + d[i].birth_m + "月" + d[i].birth_d + "日");
			System.out.println("年齢：" + d[i].age);
			p.println();
		}

	}

}
