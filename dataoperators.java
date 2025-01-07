package defaultnew;

public class dataoperators {
	public static void main(String args[]) {
		int a=10;
		int b=20;
		// arithmetic operators
		System.out.println(a+b); //addition
		System.out.println(a-b); // subtraction
		System.out.println(a*b); //multiplication
		System.out.println(a/b); // division returns quotient
		System.out.println(a%b); //modulo - returns remainder
		
		// relational operators - returns the output in boolean
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		
		// logical operators -- give inputs in boolean and the get the outputs also in boolean
		
		boolean x=true;
		boolean y=true;
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
		
		//assignment operators
		int c;
		c=a;
		System. out. println(c);
		c=b;
		System. out. println(c);
		
		//increment and decrement operator
		c=100;
		//c++ = c+1;
		//c-- = c-1;
		//c=c+5 ==> c+ = 5;
		c++;
		System.out.println(c);
		c--;
		System.out.println(c);
		c+=10;
		System.out.println(c);
		
	}

}
