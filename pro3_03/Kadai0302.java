import java.math.*;
public class Kadai0302 {
	
	//ベクトルの平均値
	static void absVector(int a[], int b){
		int c = 0;
		for(int i = 0; i < b; i++){
			c = a[i] * a[i] + c;
		}
		System.out.println("絶対値："+ Math.sqrt(c));
	}
	
	//k倍
	static void multiplyVector(int a[], int b){
	}
	
	//2つのベクトルの和
	static void sumVector(int a[], int b){
	}
	
	//2つのベクトルの内積
	static void dotVector(int a[], int b){
	}
	
	//2つのベクトルの外積
	static void crossVector(int a[], int b){
	}
	
	//Main
	public static void main(String[] args){
		int[] Vector = {1,2};
		int length = Vector.length;
		absVector(Vector,length);
	}

}
