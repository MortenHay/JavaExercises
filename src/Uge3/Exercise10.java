package Uge3;

public class Exercise10 {
   public static void main(String[] args) {
   }

   public static int factorial(int n) {
      int result = 1;
      for (int i = 1; i <= n; i++) {
         result *= i;
      }
      return result;
   }
}
