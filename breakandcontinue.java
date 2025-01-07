package defaultnew;

public class breakandcontinue {
	public static void main (String args[]){
		
		// Use of break and continue
		for(int i=1; i<=10; i++)
		{
			if (i==5)
			{
				break;
			}
			System.out.println(i);
					}
	
		for (int j=1; j<=10;j++) {
		if(j==4)
		{
			continue;
		}
		System.out.println(j);
		
		}
	}

}
	
