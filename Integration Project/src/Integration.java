// Ctrl, shift, F auto format
// Ben Deleuze
// This Program is a collection of what I am learning in COP2006

// Overload a method- constructor of the Player class
// Find the smallest value in an array- search SmallestIntInArray to find
// Get a sum of the values in an array using an accumulator - 
// search SumOfCountingArray to find
// Search a two-dimensional array and identify the coordinates where a value was found -
// can be found in Tic-Tac-Toe game
// Exception handling- All Exceptions handled

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Integration {

  static Scanner scan; // Create scanner object

  /**
   * Driver method. When program runs to starts from this spot
   * 
   * @param args
   */
  public static void main(String[] args) {
    // assign scanner object
    scan = new Scanner(System.in);
    System.out.println(
        "Hello, This project is to show what I have learned in COP 2006");
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
    double myAge = 0;
    int ageCounts = 1;
    // double(holds a number and a decimal) with variable name myAge
    while (true) {
      try {
        do {
          System.out.println("Enter my age.");
          myAge = scan.nextInt();
          ageCounts--;
        } while (myAge != 19);
      } catch (InputMismatchException e) {
        System.out.println("Input an Integer");
        scan.nextLine();
      } catch (Exception ex) {
        System.out.println("Unexpected Error");
        scan.nextLine();
      }
      if (myAge == 19) {
        break;
        // using break to exit the loop
      }
    }

    System.out.print("You got it! ");
    System.out.println("I am " + (int) myAge);
    // Print "I am" and myAge casting(changing the data-type of the variable)
    // myAge
    // to an int
    ageCounts++;
    int[] countingArray = new int[3];
    countingArray[0] = ageCounts;
    String bdayQuestion = "What day and month was I born?(month.day)";
    // String with variable bdayQuestion
    System.out.println(bdayQuestion); // Print bdayQuestion
    int birthdayCounter = 1;
    double myBday = 0; // double with variable name myBday
    while (true) {
      try {
        do {
          System.out.println("Enter my birthday.");
          myBday = scan.nextDouble();
          birthdayCounter--;
        } while (myBday != 2.25);
        // SpotBugs found this but it is essential for the project to use a
        // double
      } catch (InputMismatchException e) {
        System.out.println("Input an Double");
        scan.nextLine();
      } catch (Exception ex) {
        System.out.println("Unexpected Error");
        scan.nextLine();
      }
      if (myBday == 2.25) {
        break;
      }
    }

    System.out.print("You got it! ");
    System.out.println("I was born on Febuary 25th.(" + myBday + ")");
    birthdayCounter++;
    countingArray[1] = birthdayCounter;
    pickColor(countingArray); // call method "pickColor"
    yourAge(myAge);
    // call method "yourAge" with argument "myAge"// Print "I was born on " +
    // myBday
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
     * use final(make it so you can not change the value of same name)
     * boolean(gives either true or false) and String method .equalsIgnoreCase
     * to compare if the Strings are the same
     */
    final boolean length = yourNameLength > 9;
    // use relational operator ">" to test if yourNameLength is greater than 9
    // use final boolean to test if length is grater than 9
    if (sameName) { // create if/else it/else (if same name print line)
      System.out.println("We have the same name!");
    } else if (length) {
      // use else if to print if yourNameLength is greater than 9
      System.out.println("You have " + yourNameLength
          + " letters in your name.\nThat's a little long!");
      // use escape sequences \n to insert a new line
    } else {
      // use else to print if yourNameLength is less than than 9
      System.out.println("You have " + yourNameLength + " "
          + (yourFirstName.length() == 1 ? "letter" : "letters")
          + " in your name.\nNot too long.");
      /*
       * use Ternary Conditional Operator(tests to see if yourName length is 1,
       * if so print "letter", if not print "letters"
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
      default: {
        System.out.println("Invalad response");
        break;
      }
    }
    Player p1 = new Player(yourFirstName, yourLastName);
    // Player p2 = new Player(); // was used before overloading constructor was
    // created
    System.out.println("Your first name is " + p1.getFirstName()
        + " and your last name is " + p1.getLastName());
    int value = 0;
    boolean loopLeaver = false;
    while (true) {
      try {
        // Output prompt asking for int input
        System.out.println(
            "Try to guess what number I am thin thinking of 1-10. Enter the number"
                + " below.");
        // scan user int input
        value = scan.nextInt();
        // For a string input: String line = input.nextLine();
        if (value == 0 || value > 10) {
          throw new InputZeroException();
        }
        loopLeaver = true;
      } catch (InputZeroException ex) {
        System.out.println("Not in the Range of 1-10");
        scan.nextLine();
      } catch (InputMismatchException ex) {
        System.out.println("Input an Integer");
        scan.nextLine();
      } catch (Exception ex) {
        System.out.println("Unexpected Error");
        scan.nextLine();
      }
      if (loopLeaver == true) {
        break;
      }
    }
    getRandomNumberAndInput(value);// method call with argument value
    ArrayList<Integer> arithmeticOperatorList = new ArrayList<Integer>();
    useArithmeticOperatorsOnNewAndOldInput(value, arithmeticOperatorList);
    countDownFromInput(value);

    System.out.println("Score Board");
    int sumOfCountingArray = 0;
    for (int i = 0; i < countingArray.length; i++) {
      sumOfCountingArray = sumOfCountingArray + countingArray[i];
    }
    for (int i = 0; i < countingArray.length; i++) {
      System.out.print("Question " + (i + 1) + ": " + countingArray[i] + "\t");
    }
    System.out.println("Sum = " + sumOfCountingArray + "\t");

    int smallestIntInArray = countingArray[0];
    for (int i = 0; i < countingArray.length; i++) {
      if (countingArray[i] < smallestIntInArray) {
        smallestIntInArray = countingArray[i];
      }
    }
    System.out.println(
        "Smallest value recieved on a question: " + smallestIntInArray);

    System.out.println();

    loopLeaver = false;
    while (true) {
      try {
        int row;
        int column;
        char player = 'X';

        // create 2 dimensional array for tic tac toe board
        char[][] board = new char[3][3];
        char ch = '1';
        for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
            board[i][j] = ch++;
          }
        }
        displayBoard(board);
        while (!winner(board) == true) {

          try {
            // get input for row/column
            System.out
                .println("Enter a row and column (0, 1, or 2); for player "
                    + player + ":");
            row = scan.nextInt();
            column = scan.nextInt();

            // occupied
            while (board[row][column] == 'X' || board[row][column] == 'O') {
              System.out.println("This spot is occupied. Please try again");
              scan.nextLine();
            }
            // place the X
            board[row][column] = player;
            displayBoard(board);

            if (winner(board)) {
              System.out.println("Player " + player + " is the winner!");
            }

            // time to swap players after each go.
            if (player == 'O') {
              player = 'X';

            } else {
              player = 'O';
            }
            if (winner(board) == false) {
              System.out.println("The game is a draw. Please try again.");
            }
            loopLeaver = true;
          } catch (InputMismatchException ex) {
            System.out.println("Input a Integer");
            scan.nextLine();
          } catch (IndexOutOfBoundsException ex) {
            System.out.println("Input not on board");
            scan.nextLine();
          } catch (Exception ex) {
            System.out.println("Unexpected Error");
            scan.nextLine();
          }
        }
      } catch (InputMismatchException ex) {
        System.out.println("Input a Integer");
        scan.nextLine();
      } catch (IndexOutOfBoundsException ex) {
        System.out.println("Input not on board");
        scan.nextLine();
      } catch (Exception ex) {
        System.out.println("Unexpected error. Restarting from begining.");
        scan.nextLine();
      }
    }
  }

  private static void displayBoard(char[][] board) {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        if (j == board[i].length - 1) {
          System.out.print(board[i][j]);
        } else {
          System.out.print(board[i][j] + " | ");
        }
      }
      System.out.println();
    }

  }

  /**
   * @param board - is a 2d char array that holds the location of where each
   *              player is
   * @return Boolean winner - tells if there is a winner but I'm still working
   *         on getting it perfect method to determine whether there is an x or
   *         an o in the spot
   */
  public static Boolean winner(char[][] board) {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        if (board[i][j] == 'O' || board[i][j] == 'X') {
          return false;
        }
      }
    }

    return (board[0][0] == board[0][1] && board[0][0] == board[0][2])
        || (board[0][0] == board[1][1] && board[0][0] == board[2][2])
        || (board[0][0] == board[1][0] && board[0][0] == board[2][0])
        || (board[2][0] == board[2][1] && board[2][0] == board[2][2])
        || (board[2][0] == board[1][1] && board[0][0] == board[0][2])
        || (board[0][2] == board[1][2] && board[0][2] == board[2][2])
        || (board[0][1] == board[1][1] && board[0][1] == board[2][1])
        || (board[1][0] == board[1][1] && board[1][0] == board[1][2]);
    // close scanner
    // scan.close();
  }

  /**
   * @param myAge -
   */
  public static void yourAge(double myAge) {
    // header with parameter myAge method "yourAge" header with "double myAge"
    // parameters
    // Scanner ScanAge = new Scanner(System.in);
    boolean loopLeaver = false;
    while (true) {
      try {
        System.out.println("What is your age?");
        int userAge = scan.nextInt();
        int differenceInAge = userAge - (int) myAge;
        // casting double myAge to an int so the primitive data types match
        if (differenceInAge == 0) {
          System.out.println("We are the same age!");
          loopLeaver = true;
        } else {
          System.out.println("That is a " + Math.abs(differenceInAge)
              + " year difference between you and I.");
          // Use Math class "Math.abs" to get the absolute value
          loopLeaver = true;
        }
      } catch (ArithmeticException ex) {
        System.out.println("Arithmetic Error");
        scan.nextLine();
      } catch (InputMismatchException ex) {
        System.out.println("Input an Integer");
        scan.nextLine();
      } catch (Exception ex) {
        System.out.println("Unexpected Error");
        scan.nextLine();
      }
      if (loopLeaver == true) {
        break;
      }
    }
  }

  public static void getRandomNumberAndInput(int value) {
    // method with argument value
    // Create random number 1-10
    Random randomGen = new Random();
    // create an instance or the random class randomGen
    int randomNumber = randomGen.nextInt(10) + 1;

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

  public static void pickColor(int[] countingArray) {
    int colorCounter = 0;
    System.out.println("What is my favorite color: Red, Blue, or Green");
    // Scanner ScanColor = new Scanner(System.in);
    scan.nextLine();
    String userColor = scan.nextLine();
    switch (userColor) { // use create switch statement
      case "Red":
        System.out.println("Not quite, My favorite color is Green.");
        colorCounter--;
        break;
      case "Blue":
        System.out.println("Not quite, My favorite color is Green.");
        colorCounter--;
        break;
      case "Green":
        System.out.println("Correct!");
        colorCounter++;
        break;
      default:
        System.out.println("Invalid response");
        colorCounter = 0;
        break;
    }
    countingArray[2] = colorCounter;
  }

  public static void useArithmeticOperatorsOnNewAndOldInput(int value,
      ArrayList<Integer> arithmeticOperatorList) {
    System.out
        .println("Give me another number to perform arithmetic operations on."
            + "(it will continue until you 0)");
    int intNewInput;
    arithmeticOperatorList.add(value);
    for (;;) {
      try {
        intNewInput = scan.nextInt();
        if (intNewInput == 0) {
          break;
        } else {
          arithmeticOperatorList.add(intNewInput);
          System.out.println(
              intNewInput + " divided by " + value + " = " + intNewInput / value
                  + " (with a remainder of " + intNewInput % value + ")");
          System.out.println(intNewInput + " multiplied by " + value + " = "
              + intNewInput * value);
          System.out.println(intNewInput + " pluse 1" + " = " + ++intNewInput);
          System.out.println(intNewInput + " minuse 1" + " = " + --intNewInput);
          System.out.print(intNewInput + " pluse " + value + " = ");
          value += intNewInput;
          System.out.println(value);
          System.out.println("Give me another number or type 0 to stop.");
        }
      } catch (InputMismatchException ex) {
        System.out.println("Input a Integer");
        scan.nextLine();
      } catch (Exception ex) {
        System.out.println("Unexpected Error");
        scan.nextLine();
      }
    }
    System.out.print("You entered the numbers ");
    for (Integer operator : arithmeticOperatorList) {
      System.out.print(operator + "  ");
    }
    System.out.println();
  }

  private static void countDownFromInput(int value) {
    System.out.println("Lets count down from original number you entered.");
    while (value >= 0) {
      System.out.println(value);
      value--;
    }
  }
}