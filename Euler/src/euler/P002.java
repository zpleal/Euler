package euler;

/**
 * Even Fibonacci numbers
 * Problem 2
 * 
 * 
 * 
 * @author zp
 *
 */
public class P002 {

	public static void main(String[] args) {
		
		int f1 = 1;
		int f2 = 2;
		int f;
		
		long s = 2;
		
		while(true) {
			f = f1 + f2;
			if(f > 4_000_000)
				break;
			
			f1 = f2;
			f2 = f;
			
			if(f % 2 == 0)
				s += f;
		} 
		
		System.out.println(s);
	}

}
