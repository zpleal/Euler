package euler;

public class P006 {

	public static void main(String[] args) {
		int n = 100;
		int s = 0;
		
		for(int i=1; i<=n; i++)
			s += i*i;

		int sn = n * (n+1) / 2;
		
		int d = sn*sn  - s;
		
		System.out.println(d);
	}

}
