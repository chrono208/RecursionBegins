import java.util.Scanner;

public class Lab4Ex2 {

	//Reversal method using substring.
	public static void reverse(String input)
	{		
		//Base Case.
		if ((input == null) ||(input.length() <= 1))
		{
			System.out.print(input);
		}//If.
	         
	    //General Case.   
	    else 
	    {
	    	System.out.print(input.charAt(input.length()-1));
	    	reverse(input.substring(0,input.length()-1));
	    }//Else.
	}//Reverse.
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String input = "";
		scan.close();
		
		System.out.println("Please enter a string for me to reverse:");
		input = scan.next();

		reverse(input);
	}//Main.
}//Class.