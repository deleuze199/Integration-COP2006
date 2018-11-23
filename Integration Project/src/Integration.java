
// Ctrl, shift, F auto format
// Ben Deleuze
// This Program is a collection of what I am learning in COP2006
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Integration {

    static Scanner scan; // Create scanner object

    public static void main(String[] args) {
        // assign scanner object
        scan = new Scanner(System.in);
        System.out.println("Hello, This project is to show what I have learned in COP 2006");
        int[] CountingArray = new int[3];
        System.out.println("Lets start by count down from 3.");
        for (int i = 3; i >= 0; i--) {
            System.out.println("Count down at: " + i);
        }
        String myName = "Benjamin";
        // String(holds a list of characters) with variable myName
        System.out.println("My name is " + myName + ".");

        String ageQuestion = "How old am I?";
        // String with variable ageQuestion = "How old am I?"
        System.out.println(ageQuestion); // Print ageQuestion
        double myAge;
        int AgeCounter = 1;
        // double(holds a number and a decimal) with variable name myAge
        do {
            System.out.println("Enter my age.");
            myAge = scan.nextInt();
            AgeCounter--;
        } while (myAge != 19);
        System.out.print("You got it! ");
        System.out.println("I am " + (int) myAge);
        // Print "I am" and myAge casting(changing the data-type of the variable) myAge
        // to an int
        AgeCounter++;
        CountingArray[0] = AgeCounter;
        String bdayQuestion = "What day and month was I born?(month.day)";
        // String with variable bdayQuestion
        System.out.println(bdayQuestion); // Print bdayQuestion
        int BirthdayCounter = 1;
        double myBday; // double with variable name myBday
        do {
            System.out.println("Enter my birthday.");
            myBday = scan.nextDouble();
            BirthdayCounter--;
        } while (myBday != 2.25);
        System.out.print("You got it! ");
        System.out.println("I was born on Febuary 25th.(" + myBday + ")");
        BirthdayCounter++;
        CountingArray[1] = BirthdayCounter;
        pickColor(CountingArray); // call method "pickColor"
        yourAge(myAge);
        // call method "yourAge" with argument "myAge"// Print "I was born on " + myBday
        System.out.println("What is your first name?");// Ask what their name is
        scan.nextLine();
        String yourFirstName = scan.nextLine();// Get user input
        yourFirstName = yourFirstName.trim();
        // use String method .trim() to get ride of spaces at the end of input
        int yourNameLength = yourFirstName.length();
        /*
         * int(holds a number in a location of memory referred to as "yourName") use
         * String method .length to get how many characters in name
         */
        final boolean sameName = yourFirstName.equalsIgnoreCase(myName);
        /*
         * use final(make it so you can not change the value of same name) boolean(gives
         * either true or false) and String method .equalsIgnoreCase to compare if the
         * Strings are the same
         */
        final boolean length = yourNameLength > 9;
        // use relational operator ">" to test if yourNameLength is greater than 9
        // use final boolean to test if length is grater than 9
        if (sameName) { // create if/else it/else (if same name print line)
            System.out.println("We have the same name!");
        } else if (length) {// use else if to print if yourNameLength is greater than 9
            System.out.println(
                    "You have " + yourNameLength + " letters in your name.\nThat's a little long!");
            // use escape sequences \n to insert a new line
        } else {// use else to print if yourNameLength is less than than 9
            System.out.println("You have " + yourNameLength + " "
                    + (yourFirstName.length() == 1 ? "letter" : "letters")
                    + " in your name.\nNot too long.");
            /*
             * use Ternary Conditional Operator(tests to see if yourName length is 1, if so
             * print "letter", if not print "letters"
             */
        }

        System.out.println("What is you last name?");
        String yourLastName = scan.nextLine();
        String myLastName = "Deleuze";
        int sameLastName = yourLastName.compareTo(myLastName);
        /*
         * use .compareTo method to compare last names; could have also used boolean
         * sameLastName = userLastName == myLastName; with and if/else statement
         */
        switch (sameLastName) {
            case 0:
                System.out.println("We must be related.");
                break;
            default:
                System.out.println("We have different last names");
                break;
        }

        System.out.println("Do you like Dogs or Cats more?");
        String animalPrefrence = scan.nextLine();
        switch (animalPrefrence) {
            case "Dogs": {
                Dog myDog = new Dog();
                System.out.println("Dogs make a " + myDog.getSound() + " sound.");
                break;
            }
            case "Cats": {
                Cat myCat = new Cat();
                System.out.println("Cats make a " + myCat.getSound() + " sound.");
                break;
            }
            default:
                System.out.println("Invalad response");
                break;
        }
        Player p1 = new Player(yourFirstName, yourLastName);
        Player p2 = new Player();
        System.out.println("Your first name is " + p1.getFirstName() + " and your last name is "
                + p1.getLastName());

        // Output prompt asking for int input
        System.out.println("Try to guess what number I am thin thinking of 0-10. Enter the number"
                + " below.");
        // scan user int input
        int value = scan.nextInt();
        // For a string input: String line = input.nextLine();
        getRandomNumberAndInput(value);// method call with argument value
        ArrayList<Integer> arithmeticOperatorList = new ArrayList<Integer>();
        useArithmeticOperatorsOnNewAndOldInput(value, arithmeticOperatorList);
        countDownFromInput(value);

        for (int i = 0; i < CountingArray.length; i++) {
            System.out.println(CountingArray[i]);
        }
        // close scanner
        scan.close();
    }

    public static void yourAge(double myAge) {
        // header with parameter myAge method "yourAge" header with "double myAge"
        // parameters
        // Scanner ScanAge = new Scanner(System.in);
        System.out.println("What is your age?");
        int userAge = scan.nextInt();
        int differenceInAge = userAge - (int) myAge;
        // casting double myAge to an int so the primitive data types match
        if (differenceInAge == 0) {
            System.out.println("We are the same age!");
        } else {
            System.out.println("That is a " + Math.abs(differenceInAge)
                    + " year difference between you and I.");
            // Use Math class "Math.abs" to get the absolute value
        }
    }

    public static void getRandomNumberAndInput(int value) { // method with argument value
        // Create random number 1-10
        Random randomGen = new Random(); // create an instance or the random class randomGen
        int randomNumber = randomGen.nextInt(11);

        // Tell them what number you were thinking of
        System.out.println("I was thinking of the number " + randomNumber);

        if (value == randomNumber) { // create if, else statement
            // Out put prompt
            System.out.println("Great Job!!");
        } else {
            // Out put prompt
            System.out.println("Nice try\nBetter luck next time!");
        }
    }

    public static void pickColor(int[] CountingArray) {
        int ColorCounter = 1;
        System.out.println("What is my favorite color: Red, Blue, or Green");
        // Scanner ScanColor = new Scanner(System.in);
        scan.nextLine();
        String userColor = scan.nextLine();
        switch (userColor) { // use create switch statement
            case "Red":
                System.out.println("Not quite, My favorite color is Green.");
                ColorCounter--;
                break;
            case "Blue":
                System.out.println("Not quite, My favorite color is Green.");
                ColorCounter--;
                break;
            case "Green":
                System.out.println("Correct!");
                ColorCounter++;
                break;
            default:
                System.out.println("Invalid response");
                ColorCounter = 0;
                break;
        }
        CountingArray[2] = ColorCounter;
    }

    public static void useArithmeticOperatorsOnNewAndOldInput(int value,
            ArrayList<Integer> arithmeticOperatorList) {
        System.out.println("Give me another number to perform arithmetic operations on."
                + "(it will continue until you 0)");
        int IntNewInput;
        arithmeticOperatorList.add(value);
        for (;;) {
            IntNewInput = scan.nextInt();
            if (IntNewInput == 0) {
                break;
            } else {
                arithmeticOperatorList.add(IntNewInput);
                System.out
                        .println(IntNewInput + " divided by " + value + " = " + IntNewInput / value
                                + " (with a remainder of " + IntNewInput % value + ")");
                System.out.println(
                        IntNewInput + " multiplied by " + value + " = " + IntNewInput * value);
                System.out.println(IntNewInput + " pluse 1" + " = " + ++IntNewInput);
                System.out.println(IntNewInput + " minuse 1" + " = " + --IntNewInput);
                System.out.print(IntNewInput + " pluse " + value + " = ");
                value += IntNewInput;
                System.out.println(value);
                System.out.println("Give me another number or type 0 to stop.");
            }
        }
        System.out.println("You entered the numbers " + arithmeticOperatorList);
    }

    private static void countDownFromInput(int value) {
        System.out.println("Lets count down from original number you entered.");
        while (value >= 0) {
            System.out.println(value);
            value--;
        }
    }
}
