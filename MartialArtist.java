
public class MartialArtist implements Fighter {

  // variables for kind of martial art
  private String name;
  private String art;

  

  // no args constructor
  public MartialArtist() {

  }

  // constructor with args
  public MartialArtist(String name, String art) {
    this.name = name;
    this.art = art;
  }

  

  // getters
  public String getName() {
    return name;
  }

  public String getArt() {
    return art;
  }

  // setters
  public void setName(String name) {
    this.name = name;
  }

  public void setart(String art) {
    this.art = art;
  }

  @Override
  public void fight() {
    System.out.println("I am a martial artist training to fight!");
  }

  public void goPractice() {
    System.out.println("It is time for practice!");
  }

  @Override
  public String toString() {
    return "My name is " + this.name + " i've been training " + this.art + ".";
  }

  
}
