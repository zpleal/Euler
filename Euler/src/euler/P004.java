package euler;

public class P004 {
	
	static boolean isPalindrome(int n) {
		String txt = Integer.toString(n);
		int len = txt.length();
		
		for(int i=0; i< len/2; i++)
			if(txt.charAt(i) != txt.charAt(len-i-1))
				return false;
		return true;
	}
	
	static boolean factors(int n) {
		
		for(int i=100; i<1000; i++)
			if(n % i == 0) {
				int q = n/i;
				
				if(q >= 100 && q < 1000)
					return true;
			}
		return false;
	}
	
	public static void main(String[] args) {
		int n;
		
		for(n = 999*999; n >= 100*100; n--) 
			if(isPalindrome(n) && factors(n))
				break;
		System.out.println(n);

	}

}
