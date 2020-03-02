import java.util.Scanner;

public class ComparingNumbers{
  public static void main(String[]args){
    Scanner keyboard = new Scanner(System.in);
    double first, second;

    System.out.print("Give me two numbers. First: ");
    first = keyboard.nextDouble();
    System.out.print("Second: ");
    second = keyboard.nextDouble();

    if (first < second)
      System.out.println(first + " is LESS THAN " + second);

    if ( first <= second)
      System.out.println(first + " is LESS THAN/EQUAL TO " + second);

    if (first == second)
      System.out.println(first + " is EQUAL TO " + second);

    if (first >= second)
      System.out.println(first + " is GREATER THAN/EQUAL TO " +second);

    if (first > second)
      System.out.println(first + "is GREATER THAN" + second);

    if (first !=second){
    System.out.println(first + "is NOT EQUAL TO " + second);
    System.out.println("Hey.");
    }
  }
}

//Hey prints no matter what because it's not part of the if statement since
// it's not contained in curly braces after the statement, (so it's part of the
//mainbody curly braces)
