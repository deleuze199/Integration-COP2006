public class Player {

  // fields
  private String yourFirstName;
  private String yourLastName;

  // methods
  public Player() {
    yourFirstName = "";
    yourLastName = "";
  }

  public Player(String yourFirstName, String yourLastName) {
    this.yourFirstName = yourFirstName;
    this.yourLastName = yourLastName;
  }

  public void setFirstName(String yourFirstName) {
    this.yourFirstName = yourFirstName;
  }

  public String getFirstName() {
    return yourFirstName;
  }

  public void setLastName(String yourLastName) {
    this.yourLastName = yourLastName;
  }

  public String getLastName() {
    return yourLastName;
  }
}