
public class Kadai0201 {

	static void printPolynomial(int[] flx){
		
		int n = flx.length;
		String math = "";
		
		for(int i = n - 1; i > 1; i--){
			if(flx[i] == 0)
				continue;
			else if(flx[i] == 1)
				math = math + "x^" + (i) + " + ";
			else
				math = math + flx[i] + "x^" + (i) + " + ";
		}
		
		
		if(flx[1] != 0){
			if(flx[1] == 1)
				math = math + "x";
			else
				math = math + flx[1] + "x";
		}
		if(flx[0] != 0)
			math = " + " + math + flx[0];
		System.out.print(math);
	}
	
	public static void main(String[] args) {
		int[] flx = {0, 3, 2, 0, 1};
		printPolynomial(flx);
	}

}
