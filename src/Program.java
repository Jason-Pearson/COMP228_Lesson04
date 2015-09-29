import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int myAge;// default is 0
		boolean isValid = false; //check for positive for exception
		
		//Good Practice - nest input in a try/catch block - to notify user of any mistakes and start over
		while(!isValid)
		{
		try
		{
			Scanner input = new Scanner(System.in); //redeclares/re-initializes scanner input per loop - stops infinite loop
			System.out.print("Please enter your age: ");
			myAge = input.nextInt();
			
			System.out.println("\nYou entered: " + myAge); // (variable name) concatenates it to a string - use printf instead to keep the variable type intact to display via format
			isValid = true;
		}
		catch(Exception exception)//automatically checks nextInt - throws exception when variable input is not integer
		{
			System.out.println("Please enter positive number");//stops the try block upon exception error (not displaying age and not making isValid true - hence while loop continues until user types an int)
		}
		}
	}

}
