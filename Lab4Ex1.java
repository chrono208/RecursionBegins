import java.util.Scanner;

public class Lab4Ex1 {
	
	//Recursive Sum Core. 1 + 2 + 3 ... + N
	public static int sum(int num) 
	{             
		//Base Case.
		if (num == 0) 
		{
			return 1;
		}//If.
	         
	    //General Case.   
	    else 
	    {
	    	return (num + sum(num - 1));
	    }//Else.
	}//Sum method.
	      
	//Bi Power Core. 2^N
	public static int biPower(int num) 
	{
		//Base Case.
		if (num == 0) 
		{
			return 1;
		}//If.
	         
		//General Case.
		else {
			return 2 * biPower(num - 1);
		}//Else.
	}//BiPower method.
	      
	//Five times core. 5N
	public static int fiveTime(int num) {
		
		//Base Case.
		if (num == 0) {
			return 1;
		}//If.
		
		//General Case.
		else {
			return 5 * fiveTime(num - 1);
		}//Else.
	}//Five Time method.
	
	//Main Method
	public static void main( String [] args ) {
	
		int num;
		Scanner scan = new Scanner(System.in);
		
		//Ask user for number.
		System.out.println("Enter a number non-negative integer:");
		num = scan.nextInt();
		scan.close();

		System.out.println(sum(num));
		System.out.println(biPower(num));
		System.out.println(fiveTime(num));
		
	}//Main Method.	      
}//Class.