package euler;

/**
 * Multiples of 3 and 5
 * Problem 1
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, 
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 * 
 * @author zp
 */
public class P001 {

	public static void main(String[] args) {
		int s = 0;
		
		for(int n = 1; n<1000; n++)
			if( (n % 3 == 0) || (n % 5 == 0))
				s += n;
		
		System.out.println(s);
	}

}
