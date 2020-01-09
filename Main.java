import java.time.LocalDateTime;
public class Main {
  public static void main(String[] args){
    String intro = "DJ's Java Program!";
    // this is similar to a console.log for your terminal
    System.out.println("intro");

    //declare variable and execute methods
    int raptorCount = 1;
    System.out.println("I own " + raptorCount + " " + pluralize("raptor", raptorCount + "."));

    int allosaurusCount = 3;
    System.out.println("I own " + allosaurusCount + " " + pluralize("allosaurus", allosaurusCount + "."));

    int indominusRexCount = 5;
    System.out.println("I own " + indominusRexCount + " " + pluralize("indominousRex", indominusRexCount + "."));

    
  }
}
