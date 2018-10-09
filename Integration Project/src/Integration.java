
// BenDeleuze Integration project
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Integration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("This project is to show what I have learned in COP 2006");
			
			String myName = "Benjamin"; //String with variable myName = "Benjamin"
			System.out.println("My name is "+ myName);
			String ageQuestion = "How old am I?"; //String with variable ageQuestion = "How old am I?"
			System.out.println(ageQuestion); //Print ageQuestion
			double myAge = 19.0;; //double with variable name myAge have a value of 19
			System.out.println("I am " + myAge); //Print "I am" and myAge
			String bdayQuestion = "What day and month was I born?"; //String with variable bdayQuestion = "when was I born"
			System.out.println(bdayQuestion); //Print bdayQuestion
			final double myBday = 2.25; //double with variable name myBday have a value of 2.25
			System.out.println("I was born on " + myBday); //Print "I was born on " + myBday 
			
			
		//Create scanner object
			Scanner Scan = new Scanner(System.in);
		//Ask what their name is
			System.out.println("What is your first name?");
		//Get user input
			String yourName = Scan.nextLine();
		//use .trim() to get ride of spaces at the end of input
			yourName = yourName.trim();
		//use .length to get how many characters in name
			int yourNameLength = yourName.length();
		//use boolean and .equalsIgnoreCase to test if it was the same as my name
			final boolean sameName = yourName.equalsIgnoreCase(myName);
		//use boolean to test if length is grater than 9
			final boolean length = yourNameLength > 9;
		//if same name print line
			if (sameName) {
				System.out.println("We have the same name!");
			}
		//use else if to print if yourNameLength is greater than 9
			else if (length) {
				 System.out.println("You have " + yourNameLength + " letters in your name.\nThat's a little long!");
			}
		//use else to print if yourNameLength is less than than 9
			 else {
				 System.out.println("You have " + yourNameLength + " " + (yourName.length()==1 ? "letter" : "letters") + " in your name.\nNot too long.");
			 }
			
			yourAge(myAge); //call method "yourAge" with argument myAge"
			pickColor();
			
		//Output prompt
				System.out.println("Try to guess what number I am thin thinking of 0-10. Enter the number bellow.");
		//Waiting for user to enter number 
				int value  = Scan.nextInt(); //For a string input: String line = input.nextLine();

		//close scanner
				Scan.close();
				
				getRandomNumberAndInput(value);

		
	}
		
	public static void yourAge (double myAge) {  //method "yourAge" header with "double myAge" parameters
		Scanner ScanAge = new Scanner(System.in);
		System.out.println("What is your age?");
		int userAge = ScanAge.nextInt();
		int differenceInAge = userAge - (int)myAge; //casting double myAge to an int so the primitive data types match
		if (differenceInAge == 0) {
			System.out.println("We are the same age!");
		}
		else {
			System.out.println("That is a " + Math.abs(differenceInAge) + " year difference between you and I."); //Utilize "Math.abs" method from the Math class
		return ;
		}
	}
		
	public static void getRandomNumberAndInput (int value) {
		//Create random number 1-10			
		 Random randomGen = new Random();
		 int randomNumber = randomGen.nextInt(10);

//Tell them what number you were thinking of
		System.out.println("I was thinking of the number " + randomNumber);
		System.out.println("You entered " + value);
	 
	 if (value == randomNumber) {
		//Out put prompt
		 System.out.println("Great Job!!");
	 }
	 else {
		//Out put prompt
		 System.out.println("Nice try\nBetter luck next time!");
	 }
	}
		public static void pickColor() {
			System.out.println("What is my favorite color: Red, Blue, or Green");
			String colorRed = "Red";
			String colorBlue = "Blue";
			String colorGreen = "Green";
			Scanner ScanColor = new Scanner(System.in);
			String userColor = ScanColor.nextLine();
			switch(userColor) {
			case "Red":
				System.out.println("Not quiet, My favorite color is Green.");
				break;
			case "Blue":
				System.out.println("Not quiet, My favorite color is Green.");
				break;
			case "Green":
				System.out.println("Correct!");
				break;
			}
	}
			
}