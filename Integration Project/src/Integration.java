// Ctrl, shift, F auto format
// Ben Deleuze
// This Program is a collection of what I am learning in COP2006
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Integration {

  static Scanner scan; // Create scanner object

  public static void main(String[] args) {
    // assign scanner object
    scan = new Scanner(System.in);
    System.out.println("Hello, This project is to show what I have learned in COP 2006");
    String myName = "Benjamin"; // String(holds a list of characters) with variable myName
    System.out.println("My name is " + myName);
    
    String ageQuestion = "How old am I?"; // String with variable ageQuestion = "How old am I?"
    System.out.println(ageQuestion); // Print ageQuestion
    double myAge = 19;
    // double(holds a number and a decimal) with variable name myAge have a value of 19
    System.out.println("I am " + (int)myAge);
    // Print "I am" and myAge casting(changing the data-type of the variable) myAge to an int
    String bdayQuestion = "What day and month was I born?"; // String with variable bdayQuestion
    System.out.println(bdayQuestion); // Print bdayQuestion
    final double myBday = 2.25; // double with variable name myBday have a value of 2.25
    System.out.println("I was born on " + myBday); // Print "I was born on " + myBday

    System.out.println("What is your first name?");// Ask what their name is
    String yourName = scan.nextLine();// Get user input
    yourName = yourName.trim();
    // use String method .trim() to get ride of spaces at the end of input
    int yourNameLength = yourName.length();
    /*int(holds a number in a location of memory referred to as "yourName") 
    use String method .length to get how many characters in name*/
    final boolean sameName = yourName.equalsIgnoreCase(myName);
    /*use final(make it so you can not change the value of same name)
    boolean(gives either true or false)
    and String method .equalsIgnoreCase to compare if the Strings are the same*/
    final boolean length = yourNameLength > 9;
    //use relational operator ">" to test if yourNameLength is greater than 9
    // use final boolean to test if length is grater than 9
    if (sameName) { // create if/else it/else (if same name print line)
      System.out.println("We have the same name!");
    }
    else if (length) {// use else if to print if yourNameLength is greater than 9
      System.out
          .println("You have " + yourNameLength + " letters in your name.\nThat's a little long!");
      // use escape sequences \n to insert a new line
    }
    else {// use else to print if yourNameLength is less than than 9
      System.out.println("You have " + yourNameLength + " "
      + (yourName.length() == 1 ? "letter" : "letters") + " in your name.\nNot too long.");
      /* use Ternary Conditional Operator(tests to see if yourName length is 1, if so print "letter",
      if not print "letters" */
    }
    
    compareLastName(); //call method "compareLastName"
    yourAge(myAge); // call method "yourAge" with argument "myAge"
    pickColor(); // call method "pickColor"
    
    // Output prompt asking for int input
    System.out.println("Try to guess what number I am thin thinking of 0-10. Enter the number"
        + " below.");
    // scan user int input
    int value = scan.nextInt(); // For a string input: String line = input.nextLine();

    getRandomNumberAndInput(value); //method call with argument value

    // close scanner
    scan.close();
  }

  public static void yourAge(double myAge) { //header with parameter myAge
    // method "yourAge" header with "double myAge" parameters
    //  Scanner ScanAge = new Scanner(System.in);
    System.out.println("What is your age?");
    int userAge = scan.nextInt();
    int differenceInAge = userAge - (int) myAge; 
    // casting double myAge to an int so the primitive data types match
    if (differenceInAge == 0) {
      System.out.println("We are the same age!");
    } else {
      System.out.println(
          "That is a " + Math.abs(differenceInAge) + " year difference between you and I."); 
      // Use Math class "Math.abs" to get the absolute value
      return;
    }
  }

  public static void getRandomNumberAndInput(int value) {  //method with argument value
    // Create random number 1-10
    Random randomGen = new Random(); //create an instance or the random class randomGen
    int randomNumber = randomGen.nextInt(10); 

    // Tell them what number you were thinking of
    System.out.println("I was thinking of the number " + randomNumber);
    System.out.println("You entered " + value);

    if (value == randomNumber) { //create if, else statement
      // Out put prompt
      System.out.println("Great Job!!");
    } else {
      // Out put prompt
      System.out.println("Nice try\nBetter luck next time!");
    }
    System.out.println(randomNumber + " divided by " + value + " = " + randomNumber/value +
    " with a remainder of " + randomNumber%value);
    System.out.println(randomNumber + " multiplied by " + value + " = " + randomNumber*value);
    System.out.println(value + " pluse 1 " + " = " + ++value);
    System.out.println(value + " minuse 1 " +  " = " + --value);
    System.out.print(value + " pluse 5 " + " = ");
    value += 5;
    System.out.print(value);
  }

  public static void pickColor() {
    System.out.println("What is my favorite color: Red, Blue, or Green");
   // Scanner ScanColor = new Scanner(System.in);
    scan.nextLine();
    String userColor = scan.nextLine();
    switch (userColor) { //use create switch statement
      case "Red":
        System.out.println("Not quite, My favorite color is Green.");
        break;
      case "Blue":
        System.out.println("Not quite, My favorite color is Green.");
        break;
      case "Green":
        System.out.println("Correct!");
        break;
      default:
        System.out.println("Invalid response");
        break;
    }
  }
  private static void compareLastName() {
    System.out.println("What is you last name?");
    String userLastName = scan.nextLine();
    String myLastName = "Deleuze";
    int sameLastName = userLastName.compareTo(myLastName);
    /*use .compareTo method to compare last names; could have also used 
    boolean sameLastName = userLastName == myLastName; with and if/else statement */
    switch (sameLastName) {
      case 0:
      System.out.println("We must be related.");
      break;
      default:
      System.out.println("We have different last names"); 
      break;
    } 
  }
}