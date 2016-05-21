import java.util.*;

/**
 *   File Name: NumberVersus10.java<br>
 *
 *   Venkatraman, Arunkumar<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: May 21, 2016
 *   
 */

/**
 * NumberVersus10 //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author Venkatraman, Arunkumar
 * @version 1.0.0
 * @since 1.0
 *
 */
public class NumberVersus10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Create the Scanner object
		// TODO Greet User and ask or a number
		// TODO Store the number inside a String variable input
		// TODO Convert the number into an integer type (Integer.parseInt),
		// string
		// in an integer variable
		// TODO Use an if statement to check if it is less than 10
		// TODO If so, print a message to user that the number is less than 10
		// TODO Use an if statement to check if it is greater than 10
		// TODO If so, print a message to user that the number is greater than
		// 10
		// TODO If neither, print number is equal to 10

		// Create Scanner object
		Scanner scanner = new Scanner(System.in);
		// String variable to hold user input string
		String inpStr;
		// Greet the user to the application
		System.out.println("Welcome to Number Check app");
		// Ask the user input
		System.out.print("Please enter the number to be verified: ");
		inpStr = scanner.nextLine();
		// Store the user's name inside the integer variable

		int inpNum = Integer.parseInt(inpStr);
		if (inpNum > 10) {
			System.out.println("The value entered is greater than 10");
		}

		else if (inpNum < 10) {
			System.out.println("The value entered is less than 10");
		}

		else
			System.out.println("The value entered is equal to 10");

		System.out.println("Thank you for using this app!");

	}

}
