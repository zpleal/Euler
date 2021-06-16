package euler;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class P003 {

	/**
	 * Largest prime factor
	 * Problem 3
	 * 
	 * The prime factors of 13195 are 5, 7, 13 and 29.
	 *
     * What is the largest prime factor of the number 600851475143 ?
	 * @param args
	 */
	public static void main(String[] args) {
		BigInteger n = new BigInteger("600851475143");
		// BigInteger n = new BigInteger("13195");
		
		BigInteger t = n.sqrt();
		BigInteger l = BigInteger.ONE;

		while(n.mod(BigInteger.TWO).compareTo(BigInteger.ZERO) == 0) {
			n = n.divide(BigInteger.TWO);
			l = BigInteger.TWO;
		}
		
		for(
				BigInteger f = new BigInteger("3");
				f.compareTo(t) <= 0;
				f = f.add(BigInteger.TWO))
			while(n.mod(f).compareTo(BigInteger.ZERO) == 0) {
				n = n.divide(f);
				l = f;
			}
			
		System.out.println(l);
					
	}
}
