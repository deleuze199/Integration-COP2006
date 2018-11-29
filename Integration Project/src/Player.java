/**
 * Player class is used to store user first and last names.
 * 
 * @author Benjamin Deleuze
 */
public class Player {

  // fields
  private String yourFirstName;
  private String yourLastName;

  // methods
  public Player() {
    yourFirstName = "";
    yourLastName = "";
  }

  /**
   * overloaded constructor for the Player class.
   * 
   * @param yourFirstName - holds users first name
   * @param yourLastName  - holds users last name
   */
  public Player(String yourFirstName, String yourLastName) {
    this.yourFirstName = yourFirstName;
    this.yourLastName = yourLastName;
  }

  /**
   * setter for String yourFirstName.
   * 
   * @param yourFirstName - holds users first name
   */
  public void setFirstName(String yourFirstName) {
    this.yourFirstName = yourFirstName;
  }

  /**
   * getter for String yourFirstName.
   * 
   * @return yourFirstName - holds users first name
   */
  public String getFirstName() {
    return yourFirstName;
  }

  /**
   * setter for String yourLastName.
   * 
   * @param yourLastName - holds users last name
   */
  public void setLastName(String yourLastName) {
    this.yourLastName = yourLastName;
  }

  /**
   * getter for String yourLastName.
   * 
   * @return yourLastName - holds users last name
   */
  public String getLastName() {
    return yourLastName;
  }
}