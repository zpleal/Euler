package euler;

public class P007 {
	
	
	private static final int MAX = 1<<20;

	public static void main(String[] arg) {
		
		boolean m[] = new boolean[MAX]; 
		int n = 1;
		
		for(int f=2; f < MAX; f++)
			if(!m[f]) {
				System.out.println(n+" "+f);
				if(n == 10_001)
					break;
				n++;
			
				for(int k=2*f; k < MAX; k += f)
					m[k] = true;
			}
	}

}
