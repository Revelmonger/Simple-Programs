// Programmer: Your name
// Class, Section and Term: ...
// Purpose: Input and output of some values 

// Import the Scanner Class for input operations.
import java.util.Scanner; 
public class SimpleProgram {
	public static void main(String[] args) {
	
      Scanner scnr = new Scanner(System.in);


      String userInput;
      String userInput2;

     
      System.out.print("Enter string: ");
      userInput = scnr.nextLine();
      System.out.print("Enter string again: ");
      userInput2 = scnr.nextLine();
      
      
      System.out.println("The input string is: " + userInput);
      System.out.println("The input string2 is: " + userInput2);
      
      
      if (userInput2.equalsIgnoreCase(userInput)){
      System.out.println(userInput + " is equal to " + userInput2);
      } else {
       System.out.println(userInput + " is not equal to " + userInput2);
      }
      
      if (userInput.compareTo(userInput2) > 0) {
         System.out.println(userInput + " is greater than " + userInput2);
      } else if (userInput.compareTo(userInput2) < 0)  {
                  System.out.println(userInput + " is less than " + userInput2);
      } else if (userInput.compareTo(userInput2) ==0 )  {
                  System.out.println(userInput + " is equal to " + userInput2);
      } else {
       System.out.println("error");  
      }
      
      
      
      System.out.println("The first character of string 1 is: "+ userInput.charAt(0) + " and the last character of string 1 is :" + userInput.charAt(userInput.length()-1));
      
      
      
      
      scnr.close();
	}
}
