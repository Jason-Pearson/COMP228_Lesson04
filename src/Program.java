import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int myAge;
		
		System.out.print("Please enter your age: ");
		myAge = input.nextInt();
		
		System.out.println("\nYou entered: " + myAge); //+ (variable name) concatenates it to a string - use printf instead to keep the variable type intact to display via format
		//Good Practice - nest input in a try/catch - to notify user of any mistakes and start over
	}

}
