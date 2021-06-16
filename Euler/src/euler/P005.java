package euler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class P005 {

	private static int mdc(int a, int b) {
		if(a < b) {
			int t = b;
			b = a;
			a = t;
		}
		int r = a % b; 	
		
		return r == 0 ? b : mdc(b,a%b) ;
	}
	
	@Test
	void testMdc() {
		assertEquals(2,mdc(8,6));
		assertEquals(2,mdc(6,8));
		assertEquals(5,mdc(15,10));
		assertEquals(5,mdc(10,15));
		assertEquals(1,mdc(7,9));
		assertEquals(1,mdc(7,9));
	}
	
	
	public static void main(String[] args) {
		int n = 20;
		int p = 1;
		
		for(int f = n; f > 1; f--) 
			if(p % f != 0)
				p *= f/mdc(p,f);

		System.out.println(p);
	}

}
