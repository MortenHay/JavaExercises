package Uge5;

public class Triag {
   public static void main(String[] args) {
      System.out.println(computeIndex(1));
      System.out.println(computeIndex(5));
   }

   public static int computeIndex(int n) {
      int i = 0;
      int result = 0;
      while (result < n) {
         result += ++i;
      }
      return i;
   }
}
