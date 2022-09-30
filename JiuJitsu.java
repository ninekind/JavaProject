public class JiuJitsu extends MartialArtist {

  // variables
  private String takedown;
  private String submission;


  // no args constructor
  public JiuJitsu() {

  }

  public JiuJitsu(String takedown, String submission) {
    this.takedown = takedown;
    this.submission = submission;
  }


  // getters

  public String getTakedown() {
    return takedown;
  }

  public String getSub() {
    return submission;
  }

  public void setTakedown(String takedown) {
    this.takedown = takedown;
  }

  public void setSub(String submission) {
    this.submission = submission;
  }


  @Override
  public String toString() {
    return "I train Jiu-jitsu. My fav submission is " + this.submission + "." + "My fav takedown is " + this.takedown
        + ".";
  }

  @Override
  public void fight() {
    System.out.println("I am fighting using Jiu-jitsu!");
  }

  public void greet(JiuJitsu j) {
    System.out.println("Hello my takedown is " + j.takedown);
  }
  
}
