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
    //use the standard input (terminal input)
    //as the string that you read from
    Scanner n = new Scanner( System.in );
    //use hasNextLine()/nextLine() to loop over
    //all of the data
    while (n.hasNextLine()) {
      Scanner scan = new Scanner(n.nextLine());
      while (scan.hasNext()) {
        String word = scan.next();
        System.out.print(wordToStars(word));
        System.out.print(" ");
      }
      System.out.println();
    }
    //If you want to read the input word by word
    //this can be replaced with hasNext() and next()
  }
}
