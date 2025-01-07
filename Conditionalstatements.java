package defaultnew;

public class Conditionalstatements {
	public static void main(String args[]) {
	int age=15;
	
	// if statement
	
	if(age>=18)
	System.out.println("this age is eligible to vote");
	else
	{
		System.out.println("this age is not eligible to vote");
	}
	
	//nested if else statement
	
	int day=7;
	if(day==1)
	{
		System.out.println("Monday");
	}
	else if(day==2)
	{
		System.out.println("Tuesday");
	}
	else if(day==3)
	{
		System.out.println("Wednesday");
	}
	else if(day==4)
	{
		System.out.println("Thursday");
	}
	else if(day==5)
	{
		System.out.println("Friday");
	}
	else if(day==6)
	{
		System.out.println("saturday");
	}
	else if(day==7)
	{
		System.out.println("sunday");
	}
	else
	{
		System.out.println("this number is not applicable for day count");
	}
	
	
	// switch statement - lines of code is reduced than nestedif
	int day_new=3;
	switch(day_new)
	{
	case 1: System.out.println("monday"); break;
	case 2: System.out.println("tue"); break;
	case 3: System.out.println("wed"); break;
	case 4: System.out.println("thursday"); break;
	case 5: System.out.println("friday"); break;
	case 6: System.out.println("saturday"); break;
	case 7: System.out.println("sunday"); break;
	default: System.out.println("not in day count"); 
	}
}
}
