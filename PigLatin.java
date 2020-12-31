import java.util.*;

public class PigLatin{
  public static void main(String[] args){
    Scanner n = new Scanner(System.in);
    while(n.hasNextLine()){
      Scanner line = new Scanner(n.nextLine());
      while(line.hasNext()){
        String word = line.next();
        System.out.print(pigLatinBest(word) + " ");
      }
      System.out.println();
    }
  }

  public static String pigLatinSimple(String s){
    String lowerS = s.toLowerCase();
    if (lowerS.charAt(0)=='a' || lowerS.charAt(0)=='e' || lowerS.charAt(0)=='i' ||
                                 lowerS.charAt(0)=='o' || lowerS.charAt(0)=='u') {
      return lowerS + "hay";
    }
    else {
      return lowerS.substring(1) + lowerS.charAt(0) + "ay";
    }
  }

  public static String pigLatin(String s){
    String lowerS = s.toLowerCase();
    if (lowerS.substring(0,2).equals("bl") || lowerS.substring(0,2).equals("dr") || lowerS.substring(0,2).equals("gr") || lowerS.substring(0,2).equals("qu") || lowerS.substring(0,2).equals("sc") || lowerS.substring(0,2).equals("sp") ||
        lowerS.substring(0,2).equals("br") || lowerS.substring(0,2).equals("fl") || lowerS.substring(0,2).equals("ng") || lowerS.substring(0,2).equals("sc") || lowerS.substring(0,2).equals("sh") || lowerS.substring(0,2).equals("st") ||
        lowerS.substring(0,2).equals("ch") || lowerS.substring(0,2).equals("fr") || lowerS.substring(0,2).equals("ph") || lowerS.substring(0,2).equals("sh") || lowerS.substring(0,2).equals("sl") || lowerS.substring(0,2).equals("sw") ||
        lowerS.substring(0,2).equals("ck") || lowerS.substring(0,2).equals("gh") || lowerS.substring(0,2).equals("pl") || lowerS.substring(0,2).equals("sk") || lowerS.substring(0,2).equals("sm") || lowerS.substring(0,2).equals("th") ||
        lowerS.substring(0,2).equals("cl") || lowerS.substring(0,2).equals("gl") || lowerS.substring(0,2).equals("pr") || lowerS.substring(0,2).equals("sl") || lowerS.substring(0,2).equals("sn") || lowerS.substring(0,2).equals("tr") ||
        lowerS.substring(0,2).equals("cr") || lowerS.substring(0,2).equals("tw") || lowerS.substring(0,2).equals("wh") || lowerS.substring(0,2).equals("wr") ){
      return lowerS.substring(2) + lowerS.substring(0,2) + "ay";
    }
    else {
      return pigLatinSimple(s);
    }
  }

  public static String pigLatinBest(String s){
    String lowerS = s.toLowerCase();
    if (lowerS.charAt(0)!='a' && lowerS.charAt(0)!='b' && lowerS.charAt(0)!='c' && lowerS.charAt(0)!='d' && lowerS.charAt(0)!='e' && lowerS.charAt(0)!='f' &&
        lowerS.charAt(0)!='g' && lowerS.charAt(0)!='h' && lowerS.charAt(0)!='i' && lowerS.charAt(0)!='j' && lowerS.charAt(0)!='k' && lowerS.charAt(0)!='l' &&
        lowerS.charAt(0)!='m' && lowerS.charAt(0)!='n' && lowerS.charAt(0)!='o' && lowerS.charAt(0)!='p' && lowerS.charAt(0)!='q' && lowerS.charAt(0)!='r' &&
        lowerS.charAt(0)!='s' && lowerS.charAt(0)!='t' && lowerS.charAt(0)!='u' && lowerS.charAt(0)!='v' && lowerS.charAt(0)!='w' && lowerS.charAt(0)!='x' &&
        lowerS.charAt(0)!='y' && lowerS.charAt(0)!='z') {
      return lowerS;
    }
    if (lowerS.charAt(lowerS.length()-1)!='a' && lowerS.charAt(lowerS.length()-1)!='b' && lowerS.charAt(lowerS.length()-1)!='c' && lowerS.charAt(lowerS.length()-1)!='d' && lowerS.charAt(lowerS.length()-1)!='e' && lowerS.charAt(lowerS.length()-1)!='f' && lowerS.charAt(lowerS.length()-1)!='g' &&
        lowerS.charAt(lowerS.length()-1)!='h' && lowerS.charAt(lowerS.length()-1)!='i' && lowerS.charAt(lowerS.length()-1)!='j' && lowerS.charAt(lowerS.length()-1)!='k' && lowerS.charAt(lowerS.length()-1)!='l' && lowerS.charAt(lowerS.length()-1)!='m' && lowerS.charAt(lowerS.length()-1)!='n' &&
        lowerS.charAt(lowerS.length()-1)!='o' && lowerS.charAt(lowerS.length()-1)!='p' && lowerS.charAt(lowerS.length()-1)!='q' && lowerS.charAt(lowerS.length()-1)!='r' && lowerS.charAt(lowerS.length()-1)!='s' && lowerS.charAt(lowerS.length()-1)!='t' && lowerS.charAt(lowerS.length()-1)!='u' &&
        lowerS.charAt(lowerS.length()-1)!='v' && lowerS.charAt(lowerS.length()-1)!='u' && lowerS.charAt(lowerS.length()-1)!='x' && lowerS.charAt(lowerS.length()-1)!='y' && lowerS.charAt(lowerS.length()-1)!='z' && lowerS.charAt(lowerS.length()-1)!='0' && lowerS.charAt(lowerS.length()-1)!='1' &&
        lowerS.charAt(lowerS.length()-1)!='2' && lowerS.charAt(lowerS.length()-1)!='3' && lowerS.charAt(lowerS.length()-1)!='4' && lowerS.charAt(lowerS.length()-1)!='5' && lowerS.charAt(lowerS.length()-1)!='6' && lowerS.charAt(lowerS.length()-1)!='7' && lowerS.charAt(lowerS.length()-1)!='8' &&
        lowerS.charAt(lowerS.length()-1)!='9' ) {
      String S = lowerS.substring(0,lowerS.length()-1);
      return pigLatin(S) + lowerS.charAt(lowerS.length()-1);
    }
    else {
      if (s.length()<2){
        return pigLatinSimple(s);
      }
      return pigLatin(s);
    }
  }
}
