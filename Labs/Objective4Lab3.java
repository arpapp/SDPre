import java.util.Scanner;

public class Objective4Lab3{
  public static void main(String[]args){
    Scanner keyboard = new Scanner(System.in);
    int userNum;

    System.out.println("Please enter a number: ");
    userNum = keyboard.nextInt();

    if (userNum > 0){
      System.out.println("The number is positive.");
    }
    else if (userNum == 0){
      System.out.println("The number is equal to 0.");
    }
    else if (userNum < 0){
      System.out.println("The number is negative.");
    }

keyboard.close();
  }
}
