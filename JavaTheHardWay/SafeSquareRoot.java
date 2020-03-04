import java.util.Scanner;

public class SafeSquareRoot{
  public static void main(String[]args){
    Scanner keyboard = new Scanner(System.in);
    double x, y;
    String answer;

    answer = "YES!";

    System.out.println("Are you ready?! ");
    answer = keyboard.next();

    while (!answer.equals("YES!")){
      System.out.println("Try again to get hype!");
      System.out.println("Are you ready?!");
      answer = keyboard.next();
    }

    System.out.println("Give me a number and I'll find it's square root.");
    System.out.print("No negative numbers please.");
    x = keyboard.nextDouble();

    while (x<0){
      System.out.println("I won't take the square root of a negative.");
      System.out.print("\nNew number: ");
      x = keyboard.nextDouble();
    }
    y = Math.sqrt(x);
    System.out.println("The square root of "+x+" is "+y);
  }
}
