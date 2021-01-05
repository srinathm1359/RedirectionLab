import java.util.*;
public class MakeStars{
  public static String wordToStars(String word) {
    int length = word.length();
    String newWord = "";
    for(int i = 0; i < length; i++) {
      newWord+= "*";
    }
    return newWord;
  }
  public static void main( String[]args ){
    //Test wordToStars
    /* System.out.println(wordToStars("Hello"));
    System.out.println(wordToStars("Hello World"));
    System.out.println(wordToStars("banana")); */
    
  }
}
