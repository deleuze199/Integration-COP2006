public class Player {
  private String yourFirstName;
  private String yourLastName;
  public Player() {
    yourFirstName = "";
    yourLastName = "";
  }
  public Player(String yourFirstName, String yourLastName) {
    this.yourFirstName = yourFirstName;
    this.yourLastName = yourLastName;
  }
  public void setFirstName() {
    this.yourFirstName = yourFirstName;
  }
  public String getFirstName() {
    return yourFirstName;
  }
  public void setLastName() {
    this.yourLastName = yourLastName;
  }
  public String getLastName() {
    return yourLastName;
  }
}
