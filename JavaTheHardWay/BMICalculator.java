import java.util.Scanner;

public class BMICalculator
{
  public static void main(String []args)
  {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi, inches, lbs, feet, height, feetc;

    System.out.print("Your height (feet only): ");
    feet = keyboard.nextDouble();

    System.out.print("Your height (inches):");
    inches = keyboard.nextDouble();

    System.out.print("Your weight in pounds: ");
    lbs = keyboard.nextDouble();

    feetc = (feet * 12);
    height = feetc + inches;
    m = height*0.0254;
    kg = lbs*0.453592;
    bmi = kg/ (m*m);

    System.out.println("Your BMI is " + bmi);
  }
}
