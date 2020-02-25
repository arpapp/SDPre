public class CreatingVariables
{
  public static void main (String [] args)
  {
    int x, y, age, t;
    double seconds, e, checking, inches;
    String firstName, lastName, title, weather, city;

    x = 10;
    y = 400;
    age = 39;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;

    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";

    weather = "snowy";
    t = 32;
    inches = 3.5;
    city = "Highlands Ranch";

    System.out.println("The variable x contains " + x);
    System.out.println("The value " + y + " is stored in the variable y.");
    System.out.println("The experiment took " + seconds + " seconds.");
    System.out.println("A favorite irrational # is Euler's number: " + e);
    System.out.println("Hopefully you have more than $" + checking + "!");
    System.out.println("My name's " + title + " " + firstName + lastName );
    System.out.println();
    System.out.println("Today in " + city + " the weather was " + weather +".");
    System.out.println("It snowed " + inches + " inches.");
    System.out.println("It was " + t + " degrees.");
  }
}
