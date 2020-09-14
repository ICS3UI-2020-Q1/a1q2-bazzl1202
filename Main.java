import java.util.Scanner;
/**
 *
 * @author Liana Bazzarella
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);

    //declare variable that stores first integer
    int firstInteger;

    //declare variable that stores second integer
    int secondInteger;

    //ask the user for two integers
    System.out.println("Please enter in two integers, on seperate lines, to divide.");

    //initialize the users two integers
    firstInteger = input.nextInt();
    secondInteger = input.nextInt();

    // declare and initialize quotient
    int quotient = firstInteger/secondInteger;

    //declare and initialize modulus 
    int modulus = firstInteger%secondInteger;

    // tell the user the quotient and remainder
    System.out.println(firstInteger + "/" + secondInteger + " is " + quotient + " with a remainder of "+ modulus + ".");
  }
}
