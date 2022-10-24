package Uge3;

import java.util.*;

public class Exercise8 {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      System.out.println("Please enter your full name:");
      String firstName = console.next();
      String lastName = console.next();
      System.out.print("Your name in reverse order is " + lastName + ", " + firstName);

      console.close();
   }
}
