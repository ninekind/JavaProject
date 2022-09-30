import java.util.*;

class Main {
  public static void main(String[] args) {

    // variable
    int len;

    // MartialArtist object with args constructor
    MartialArtist jo = new MartialArtist("Phillip", "Brazilian Jiu-jitsu");
    jo.goPractice();
    jo.fight();
    System.out.println(jo);

    // JiuJitsu object with args
    JiuJitsu joe = new JiuJitsu("Single leg", "arm bar");
    System.out.println("------------------------------------");
    System.out.println(joe);
    // inherited methods
    joe.goPractice();
    joe.fight();

    JiuJitsu jon = null;

    try {
      joe.greet(jon);
    } catch (Exception ex) {
      System.out.println("Can't greet sorry!");
    }

    // new scanner object
    Scanner sc = new Scanner(System.in);
    // print statement for user
    System.out.println("\nDo you like/ watch mixed martial arts such as UFC?:\n" + "1) Yes!!!!\n" + "2) NO!!!!!!!!\n"
        + "and any other number to ignore!");
    // variable to save user int input
    int response = sc.nextInt();

    // switch responses for use int input
    switch (response) {
      case 1:
        System.out.println("Awesome me too! I love to watch the fights!");
        break;
      case 2:
        System.out.println("Oh! I understand. Violence isn't for everybody.");
        break;
      default:
        System.out.println("Okay forget I asked...");
        break;
    }

    ArrayList<String> forms = new ArrayList<>();

    System.out.println("How many different MMA styles do you know?");
    len = sc.nextInt();

    System.out.println("Enter the martial art/arts you know.");
    for (int i = 0; i < len; i++) {
      forms.add(sc.next());

    }

    for (String val : forms) {
      System.out.println(val);
    }

    sc.close();
  }
}
