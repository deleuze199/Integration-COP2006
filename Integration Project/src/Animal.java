/**
 * Animal class is the parent class of Cat and Dog classes.
 * 
 * @author Benjamin Deleuze
 */
public class Animal {
  // fields
  protected String sound;

  /**
   * set methods for String sound.
   * 
   * @param sound - is a field of the Animal class; used to store the string the
   *              animal makes
   */
  public void setSound(String sound) {

    this.sound = sound;
  }

  /**
   * getter method for String sound.
   * 
   * @return sound - String that holds the noise a animal makes
   */
  public String getSound() {
    return sound;
  }

}