package defaultnew;

public class loopstatements {
	public static void main(String args[]) {
		int i=1;
		
		// while loop
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}

		
		// do while
		int j=1;
		do {
			System.out.println(j);
			j+=3;
		} while(j<=10);
		
		// for loop = for(intialize; condition; inc/dec)
		
		for(int k=1;k<=10; k++)
		{
			System.out.println(k);
		}
		
		for(int x=10; x>=1; x-=4)
		{
			System.out.println(x);
		}
	}

}

