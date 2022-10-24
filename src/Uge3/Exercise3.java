package Uge3;

import java.util.*;

public class Exercise3 {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      int a = console.nextInt();
      printNumbers(a);
      console.close();
   }

   public static void printNumbers(int maxNumber) {
      for (int i = 1; i <= maxNumber; i++) {
         System.out.print("[" + i + "]");
      }
   }
}
