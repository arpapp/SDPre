public class ClubBouncer{
  public static void main(String[]args){
    int age = 22;
    boolean onGuestList = false;
    double allure = 7.5;
    String gender = "F";

    if ( onGuestList || age >= 21 || (gender.equals("F") && allure >= 8)){
      System.out.println("You are allowed to enter the club.");
    }
    else {
      System.out.println("You are not allowed to enter the club.");
    }
  }
}

//I removed the print statement in between the if and else statmenet because
// it failed to compile due to the else statment being seperated from the if
// statement.
