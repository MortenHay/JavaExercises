package Uge3;

public class Cosine {
   public static void main(String[] args) {
      double increment = Math.PI / 5;
      System.out.println(cosine(0.5, 1));
      System.out.println("\n");
      for (int i = 0; i < 10; i++) {
         double angle = (i - Math.PI) + increment * i;
         for (int j = 0; j < 10; j++) {
            System.out.print(cosine(angle, j) + "\t");
         }
         System.out.println();
         System.out.println(Math.cos(angle));
      }
   }

   public static double cosine(double x, int k) {
      double result = 0;
      for (int i = 0; i <= k; i++) {
         result += (Math.pow(-1, i) * Math.pow(x, 2 * i) / factorial(2 * i));
      }
      return result;
   }

   public static int factorial(int n) {
      int result = 1;
      for (int i = 1; i <= n; i++) {
         result *= i;
      }
      return result;
   }
}
