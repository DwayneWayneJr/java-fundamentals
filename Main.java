import java.time.LocalDateTime;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    String intro = "This is Lab01";
    // this is similar to a console.log for your terminal
    System.out.println(intro);

    // declare variable and execute methods
    int raptorCount = 1;
    System.out.println("I own " + raptorCount + " " + pluralize("raptor", raptorCount) + ".");

    int allosaurusCount = 3;
    System.out.println("I own " + allosaurusCount + " " + pluralize("allosaurus", allosaurusCount) + ".");

    int indominusRexCount = 5;
    System.out.println("I own " + indominusRexCount + " " + pluralize("indominousRex", indominusRexCount) + ".");

    int triceratopsCount = 0;
    System.out.println("I own " + triceratopsCount + " " + pluralize("triceratops", triceratopsCount) + ".");

    flipNHeadz(4);

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
    int headsInARow = 0;
    int flips = 0;

    // do this while the above is true?
    while (headsInARow < n) {
      if (checkHeads() == "heads") {
        System.out.println("heads!");
        headsInARow++;
        flips++;
      } else {
        System.out.println("tails!");
        headsInARow = 0;
        flips++;
      }
    }
    System.out.println("It took " + flips + " " + pluralize("flip", flips) + " to flip " + n + " "
        + pluralize("head", n) + " in a row.");
  }

  public static String checkHeads() {
    Random myRandomNumbers = new Random();
    int m = myRandomNumbers.nextInt();
    System.out.println(m);
    // double m = (Math.random());
    if (m < 0) {
      return "tails";
    } else {
      return "heads";
    }
  }
}
