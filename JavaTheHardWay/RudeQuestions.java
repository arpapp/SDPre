import java.util.Scanner;

public class RudeQuestions
{
  public static void main(String []args)
  {
    String name, hockey;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Hello. What is your name? ");
    name = keyboard.next();

    System.out.print("Hi, " + name + "! How old are you? ");
    age = keyboard.nextInt();

    System.out.println("So you're " + age + ", eh? That's not very old.");
    System.out.print("How much do you weigh, " + name + "? ");
    weight = keyboard.nextDouble();

    System.out.println(weight + "! Better keep that quiet!!");
    System.out.print("Finally, what's your income, " + name + "? ");
    income = keyboard.nextDouble();

    System.out.print("Hopefully that is " + income + " per hour");
    System.out.println(" and not per year!");
    System.out.println("So, " + name + " who is your favorite hockey team?");
    hockey = keyboard.next();
    System.out.println(hockey + ", huh? Well, whatever floats your boat.");

    System.out.print("Well, thanks for answering my rude questions, ");
    System.out.println(name + ".");

//The program did not blow up when an integer was entered into
// the double field because it simply recognized the ".0" at the end
//of the whole number that is traditionally omitted. It can recognize
//a fractional component if present but doesn't need one to function.

//The program did not blow up when a number was entered into the String
// field because the String field can store alphabetical and numeric
//information.

//I couldn't find anything that blew up the String variable. I tried
//long words and nothing but neither of these things caused the program
//to stop working. To break the int field I typed a number with a decimal
//and to break the double field I typed a word.

  }
}
