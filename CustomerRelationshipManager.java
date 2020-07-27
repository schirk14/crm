import java.util.*;
import java.io.*;

public class CustomerRelationshipManager {

  static void readFile(String fileName) {
    try {
      File fileToRead = new File(fileName);
      Scanner result = new Scanner(fileToRead);
      while (result.hasNextLine()) {
        String data = result.nextLine();
        System.out.println(data);
      }
      result.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
  
  static void Customer() {
    System.out.println("\nHere is a list of all the customers:");
    readFile("customer.txt");
    System.out.println("\n");
    mainMenu();
  }

  static void SalesLead() {
    System.out.println("\nHere is a list of all the sales leads:");
    readFile("saleslead.txt");
    System.out.println("\n");
    mainMenu();
  }

  static void Employee() {
    System.out.println("\nHere is a list of all the employees:");
    readFile("employee.txt");
    System.out.println("\n");
    mainMenu();
  }

  static Scanner user_input= new Scanner(System.in);

  public static void mainMenu() {
    System.out.println("Enter '1' to lookup customers");
    System.out.println("Enter '2' to lookup sales leads");
    System.out.println("Enter '3' to lookup employees");
    System.out.println("Enter '4' to exit the software");
    
    String menuInput = user_input.nextLine();
    
    if(menuInput.matches("^[1-4]{1}$")) {
    } else {
      System.out.println("\nSorry, it appears there was a user error. Please enter a valid number 1-4");
      mainMenu();
    }

    int intSelected = Integer.parseInt(menuInput);

    if(intSelected == 1) {
      Customer();
      } else if (intSelected == 2) {
        SalesLead();
      } else if (intSelected == 3) {
        Employee();
      } else if (intSelected == 4) {
        System.exit(0);
      }  else {
          System.out.println("\nSorry, it appears there was a user error. Please enter a valid number 1-4");
          mainMenu();
        }
  }

  public static void main(String[] args) {
    System.out.println("Welcome to the CRM Software!\n");
    mainMenu();
  }
}
