import java.util.*;

public class PigLatin{
  public static String pigLatinSimple(String s){
    String lowerS = s.toLowerCase();
    if (lowerS.charAt(0)=='a' || lowerS.charAt(0)=='e' || lowerS.charAt(0)=='i' ||
                                 lowerS.charAt(0)=='o' || lowerS.charAt(0)=='u') {
      return lowerS + "hay";
    }
    else {
      return lowerS.substring(1) + lowerS.substring(0) + "ay";
    }
  }

  public static String pigLatin(String s){

  }

  public static String pigLatinBest(String s){
    
  }
}
