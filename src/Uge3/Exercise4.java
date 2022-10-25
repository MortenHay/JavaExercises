package Uge3;

import java.util.*;

public class Exercise4 {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      int a = console.nextInt();
      // int b = Factorial.factorial(a);

      // System.out.println(b);
      console.close();
   }

   public class Factorial {
      public int factorial(int n) {
         int result = 1;
         for (int i = 1; i <= n; i++) {
            result *= i;
         }
         return result;
      }
   }
}
