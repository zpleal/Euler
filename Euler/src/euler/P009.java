package euler;

public class P009 {

	public static void main(String[] args) {
		
		for(int a=1; a<1000; a++)
			for(int b=1; b<1000; b++) {
				double q = Math.sqrt(a*a + b*b);

				if(Math.floor(q) == q) {
					int c = (int) q;
					
					if(a+b+c == 1000)
						System.out.println(a*b*c);
					
					//System.out.println(a+"  "+b+"  "+c);
				}
				
			}

	}

}
