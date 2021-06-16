package euler;

import java.math.BigInteger;

public class P010 {
	private static final int MAX = 1<<25;
	private static final long LIM = 2_000_000;

	public static void main(String[] args) {
		boolean m[] = new boolean[MAX]; 
		BigInteger s = BigInteger.ZERO;
		
		for(int f=2; f < MAX; f++)
			if(!m[f]) {
				if(f > LIM) {
					System.out.println(s);
					break;
				}
			
				s = s.add(BigInteger.valueOf(f));
				
				for(int k=2*f; k < MAX; k += f)
					m[k] = true;
			}
	}

}
