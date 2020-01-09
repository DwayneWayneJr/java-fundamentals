import java.time.LocalDateTime;

public class Main {
  public static void main(final String[] args) {
    String intro = "This is Lab01";
    // this is similar to a console.log for your terminal
    System.out.println(intro);

    // declare variable and execute methods
    final int raptorCount = 1;
    System.out.println("I own " + raptorCount + " " + pluralize("raptor", raptorCount) + ".");

    final int allosaurusCount = 3;
    System.out.println("I own " + allosaurusCount + " " + pluralize("allosaurus", allosaurusCount) + ".");

    final int indominusRexCount = 5;
    System.out.println("I own " + indominusRexCount + " " + pluralize("indominousRex", indominusRexCount) + ".");

    final int triceratopsCount = 0;
    System.out.println("I own " + triceratopsCount + " " + pluralize("triceratops", triceratopsCount) + ".");

    // flipNheads(4);

  };

  // declare methods here
  public static String pluralize(String pet, int num) {
    if (num == 1) {
      return pet;
    } else {
      return pet + "s";
    }
  }
  public static void flipNHeadz(int n) {
    int heads = 0;
    int flips = 0;
    int tails = 0;

    //do this while the above is true?
    while (heads < n) {
      if (getHeads() == "heads") {
        System.out.println("heads!");
        heads++;
        flip++;
      } else {
        System.out.println("tails!");
      }
    }
  }

}
