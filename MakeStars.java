import java.util.*;

public class MakeStars{
  public static void main(String[] args){
    Scanner n = new Scanner(System.in);
    while (n.hasNextLine()){
      String line = n.nextLine();
      for (int i=0; i<line.length(); i++){
        if(line.charAt(i)== ' '){
          System.out.print(" ");
        }
        else{
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
}
