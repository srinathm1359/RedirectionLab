import java.util.*;
public class PigLatin{
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

  }
}
