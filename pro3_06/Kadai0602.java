class Actor{
	private String kind, name;
	
	Actor(String a,String b){
		kind = a;
		name = b;
	}
	Actor(String a){
		kind = a;
		name = "まだない";
	}
	
	String getKind(){
		return kind;
	}
	String getName(){
		return name;
	}
}
public class Kadai0602 {
	public static void main(String[] args) {
		
		// 表示1
		Actor a = new Actor("人");
		System.out.println("我輩は" + a.getKind() +"である。名前は"+ a.getName() +"。");
		
		// 表示2
		a = new Actor("猫","にゃんごろげ");
		System.out.println("我輩は" + a.getKind() +"である。名前は"+ a.getName() +"。");
	}

}