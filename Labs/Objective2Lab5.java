public class Objective2Lab5
{
  public static void main(String[]args)
  {
    double side1, side2, hypotenuse, a, b;

    side1 = 8;
    side2 = 10;
    a = side1*side1;
    b = side2*side2;
    hypotenuse = Math.sqrt(a+b);
    System.out.println("The hypotenuse of a triangle with sides " + side2 +
    "and " + side1 + "is " + hypotenuse);

  }

}
