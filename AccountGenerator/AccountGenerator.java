import java.util.Scanner;
import java.util.Random;

public class AccountGenerator {
    public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    Random randGen = new Random();

    String firstName;
    String lastName;
    String firstPart;
    String lastPart;
    int randomNum;
    String username;

    System.out.print("Enter your First Name: ");
    firstName = scnr.next();

    System.out.print("Enter your Last Name: ");
    lastName = scnr.next();
    
    firstPart = firstName.substring(0,1);
    lastPart = lastName.substring(0,5);

    randomNum = randGen.nextInt(100);
    username = firstPart + lastPart + randomNum;

    System.out.print("Username: " + username);



    }
}
