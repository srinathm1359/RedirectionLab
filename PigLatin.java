import java.util.*;
public class PigLatin{
  public static boolean testDigraph(String s){
    String[] digraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh",
    "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn",
    "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    int length = digraphs.length;
    for (int i = 0; i < length; i++) {
      if (digraphs[i].equals(s)) {
        return true;
      }
    }
    return false;
  }
  public static boolean testVowel(char a){
    return (a =='a'||a =='e'||a =='i'||a =='o'||a =='u');
  }
  public static String pigLatinSimple(String s){
    s = s.toLowerCase();
    int length = s.length();
    if (testVowel(s.charAt(0))) {
      return (s + "hay");
    }
    if (length == 1) {
      return (s + "ay");
    }
    return s.substring(1,length) + s.charAt(0) + "ay";
  }
  public static void main(String[] args){
    //use the standard input (terminal input)
    //as the string that you read from
    Scanner n = new Scanner( System.in );
    //use hasNextLine()/nextLine() to loop over
    //all of the data
    while (n.hasNextLine()) {
      Scanner scan = new Scanner(n.nextLine());
      while (scan.hasNext()) {
        String word = scan.next();
        System.out.print(pigLatinSimple(word));
        System.out.print(" ");
      }
      System.out.println();
    }
    //If you want to read the input word by word
    //this can be replaced with hasNext() and next()
  }
}
